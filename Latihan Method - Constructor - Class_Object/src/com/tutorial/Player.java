package com.tutorial;

public class Player {
   String name;
   double health;
   int level;

   Weapon weapon;
   Armor armor;

   Player(String name, double health) {
      this.name = name;
      this.health = health;
   }

   void attack(Player enemy) {
      System.out.println(this.name + " attack " + enemy.name);

      this.getDamage(enemy);
   }

   void getDamage(Player enemy) {
      System.out.println(enemy.name + " gets damage " + this.weapon.attackPower);
      double receivedDamage;
      // player ap = 100, enemy dp 10
      // receivedDamage = player ap - enemy dp
      // enemy dp = 0
      // enemy health = enemy health - receivedDamage
      if (this.weapon.attackPower >= enemy.armor.defensePower) {
         receivedDamage = this.weapon.attackPower - enemy.armor.defensePower;
         enemy.armor.defensePower = 0;
         enemy.health = enemy.health - receivedDamage;
      }
      // player ap 15, enemy dp 50
      else {
         enemy.armor.defensePower -= this.weapon.attackPower;
      }
      System.out.println("After battle\n");
      enemy.display();
   }

   void equipWeapon(Weapon weapon) {
      this.weapon = weapon;
   }

   void equipArmor(Armor armor) {
      this.armor = armor;
   }

   void display() {
      System.out.println("Char Stats:");
      System.out.println("Player Name  : " + this.name);
      System.out.println("Health       : " + this.health + " hp");
      System.out.println("Weapon Name  : " + this.weapon.name);
      System.out.println("Attack Power : " + this.weapon.attackPower);
      System.out.println("Armor Name   : " + this.armor.name);
      System.out.println("Defense Power: " + this.armor.defensePower + "\n");
   }
}

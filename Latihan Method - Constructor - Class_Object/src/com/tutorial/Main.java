package com.tutorial;

public class Main {
   public static void main(String[] args) {
      Player firstPlayer = new Player("Kayzen", 100);
      Player secondPlayer = new Player("Zero2", 100);

      Weapon ironSword = new Weapon(15, "Iron Sword");
      Weapon goldArrow = new Weapon(100, "Gold Arrow");

      Armor ironArmor = new Armor(10, "Iron Armor");
      Armor goldArmor = new Armor(50, "Gold Armor");

      firstPlayer.equipWeapon(ironSword);
      firstPlayer.equipArmor(ironArmor);
      firstPlayer.display();

      secondPlayer.equipWeapon(goldArrow);
      secondPlayer.equipArmor(goldArmor);
      secondPlayer.display();

      System.out.println("Battle!!!");
      System.out.println("Episode 1");
      firstPlayer.attack(secondPlayer);

      System.out.println("Episode 2");
      secondPlayer.attack(firstPlayer);
   }
}
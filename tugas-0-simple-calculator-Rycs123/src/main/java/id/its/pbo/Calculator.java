package id.its.pbo;

public class Calculator {
   public int add (int operand1, int operand2){
      return operand1 + operand2;
   }

   public int substract (int operand1, int operand2){
      return operand1 - operand2;
   }

   public int multiply (int operand1, int operand2){
      return operand1 * operand2;
   }

   public double divide (int operand1, int operand2){
      return (double) operand1 / operand2;
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

public class myCalculator {
     private double number1;
     private double number2;
     private double result =  0;
     private char operation;

    public myCalculator(double d, double d0, char c) {
        super();
        this.number1=d;
        this.number2=d0;
        this.operation= c;
    }
     
    public double calculate(){
         switch (operation) {
             case '+':
                 System.out.println("in addition");
                 result = number1 + number2;
                 break;
             case '-':
                 System.out.println("in substraction");
                 result = number1 - number2;
                 break;
             default: 
                 System.out.println("Operator not found");
                 break;
                 
         }
         
         return result;
         
     }
     
     public static void main (String[] agr) {
         myCalculator calculator = new myCalculator(12.0,5.0,'+');
         double outPut = calculator.calculate();
         System.out.println(outPut);
             }   }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author samjhanasubedi
 */
public class ExceptionThrown {
    static int divideByZero(int a, int b){
        int i = a/b;
        
        return i;       
    }
    
    static int computeDivision(int a, int b){
        int res = 0 ;
        
        try 
        {
            res = divideByZero(a,b);
        }
        catch(NumberFormatException e)
        {
            System.out.println("NumberformatException occured");
        }
        return res;
    }
    
    public static void main(String[] args){
        
        
    }   
}

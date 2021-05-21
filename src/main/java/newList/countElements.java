/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newList;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author samjhanasubedi
 */
public class countElements {
    
    public static void main (String[] args) {
        
        ArrayList <Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);
        myNumbers.add(3);
        myNumbers.add(1);
        myNumbers.add(4);
        myNumbers.add(5);
        myNumbers.add(6);
        myNumbers.add(5);
        System.out.print("[ ");
        for (int i= 0; i< myNumbers.size();i++){
            
            System.out.print(myNumbers.get(i) + " ");
            
            
        }
        System.out.print("]");    
        System.out.println();
        
        for (int i = 1; i<=6; i++){
        int count1 = Collections.frequency(myNumbers,i);
        System.out.println(i+" = "+ count1);
        
        }
        
        

        
        
                }
}

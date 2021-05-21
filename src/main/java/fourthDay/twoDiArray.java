/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourthDay;

/**
 *
 * @author samjhanasubedi
 */
public class twoDiArray {
    public static void main (String[] agr) {
        
        //creates a two dimension array added up by elements { } in their own set
        int [][] myNumbers = {{1},{2,3},{4,5,6},{7,8,9,10},{11,12,13,14,15}};
        
        /*
        looping through the 2-D array, 
        example:1st: i=0, takes j= 0, prints: [0][0]=1
                2nd:  i=1, takes j= 0,1 prints: [1][0]=2 and [1][1]=3
                3rd: i=2, takes j= 0,1,2 prints: [2][0]=4, [2][1]=5 and [2][2]=6
        and so on
        */
        
        //length of myNumbers array =5 
        for (int i = 0; i < myNumbers.length; ++i) {
            //length of myNumbers[0-4]
            for(int j = 0; j < myNumbers[i].length; ++j) {
                //prints elements from each row
                System.out.print(myNumbers[i][j]+" ");
                
            }
            //break line
            System.out.println();   
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myFirstProgram;
/**
 *
 * @author samjhanasubedi
 */


public class Arrays {

    public static void main(String[] args) {
    int[][] arr= new int[5][5];
    int val=1;

    for(int row=0;row<5;row++){
        System.out.println();
        for (int col=0;col<row+1; col++){
            arr[row][col]= val;
            val++;
        }
    }
    for (int i=0;i<5;i++){
        for (int j=0;j<5;j++) {
            if (arr[i][j] > 0)
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();

    }
    }

}
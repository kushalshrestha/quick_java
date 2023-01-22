/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_interview1;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        System.out.print("Enter 2D array size : ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();


        System.out.println("Enter array elements : ");

        int multiplicationTable[][]=new int[size][size];


        for(int i=0; i<size;i++)
        {
            for(int j=0; j<size;j++)
            {
                multiplicationTable[i][j]=(i+1) * (j+1);
                System.out.println(multiplicationTable[i][j]);
            }
        }
        System.out.print("\nData you entered : \n");
        for(int[]x:multiplicationTable){
            for(int y:x){
                System.out.print(y+"        ");
            }
            System.out.println();
        }
    }

    public static void displayMultiplicationTable(int x) {

    }
}

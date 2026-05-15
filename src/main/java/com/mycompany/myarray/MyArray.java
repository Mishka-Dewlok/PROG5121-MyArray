/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myarray;

/**
 *
 * @author mdewlok
 */
import java.util.Scanner;
public class MyArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //create array for 5 values
        int[] numbers = new int[5];
        
        // prompt user for values
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print("Enter value" + (i + 1));
            numbers[i] = input.nextInt();
        }
        
        //display
        System.out.println("Values stored in array");
        
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
        
       input.close();
    }
}

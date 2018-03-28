/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
       System.out.print("Enter the value of n: ");
       int n = s.nextInt();
       fibonacci(n);
   }

   public static void fibonacci(int n) {
       if (n == 0) {
           System.out.println("0");
       } else if (n == 1) {
           System.out.println("0 1");
       } else {
           System.out.print("0 1 ");
           int a = 0;
           int b = 1;
           for (int i = 1; i < n; i++) {
               int nextNumber = a + b;
               System.out.print(nextNumber + " ");
               a = b;
               b = nextNumber;
           }
       }
   }
}
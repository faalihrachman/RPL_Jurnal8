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

   static int calculate(int a){
        if(a<=0)
            return 0;
        
        int fib[]=new int[a+1];
        fib[0] = 0;
        fib[1] = 1;
        
        int sum = fib[0]+fib[1];
        for(int i=2; i<=a; i++){
           fib[i] = fib[i-1]+fib[i-2];
           sum += fib[i];
        }
        return sum;
    }
}

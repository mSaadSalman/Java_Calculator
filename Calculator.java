/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * @author saadsalman
 */
public class Calculator {

    public static void main(String[] args) {
        //Create a Menu
        //Create Variabales to receive user input / Scanners 
        //perform operations
        //check for errors
        
        double num1;
        double num2;
        int operation_num;
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        
        System.out.println("Calculator");
        System.out.println("Operations List");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        
        System.out.println("Enter First Number");
        num1 = scanner1.nextDouble();
        
        System.out.println("Enter the second Number");
        num2 = scanner2.nextDouble();
        
        System.out.println("Select the operation to be performed (1-4)");
        operation_num = scanner3.nextInt();
        
        if(operation_num==1){
            
            System.out.println("Result is: ");
            System.out.println(num1+num2);
        }
        
        else if(operation_num==2){
            
            System.out.println("Result is: ");
            System.out.println(num1-num2);
        }
        
        else if(operation_num==3){
            
            System.out.println("Result is: ");
            System.out.println(num1*num2);
        }
        
        else if(operation_num==4){
            
            System.out.println("Result is: ");
            System.out.println(num1/num2);
        }
        
        else {
            System.out.println("Wrong Number please select a value from operations list");
        }
    }
}
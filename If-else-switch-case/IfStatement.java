/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gochocit.examples;

/**
 *
 * @author LHVINH
 */
public class IfStatement {

    public static void main(String[] args) {
        int number = 10;
        // checks if number is less than 0
        if (number < 0) {
            System.out.println("The number is negative.");
        }
        System.out.println("Statement outside if block");

        // create a string variable
        String language = "Java";
        // if statement
        if ("Java".equals(language)) {
            System.out.println("Best Programming Language");
        }
    }
}

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
public class MaxMethod {

    /* Return the max of two int values */
    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }

    /* Find the max of two double values */
    public static double max(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }

    /* Return the max of three double values */
    public static double max(double num1, double num2, double num3) {
        return max(max(num1, num2), num3);
    }

    public static void main(String[] args) {
        System.out.println("The maximum of 3 and 4 is " + max(3, 4));
        System.out.println("The maximum of 3.0 and 5.4 is " + max(3.0, 5.4));
        System.out.println("The maximum of 3.0, 5.4, and 10.14 is " + max(3.0, 5.4, 10.14));
    }
}

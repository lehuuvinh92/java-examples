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
public class Ternary_Operator {
    public static void main(String[] args) {
        int a = -1;
        int abs = (a > 0) ? a : -a;
        System.out.println("Absolute value of a is " + abs);
        int so = 5;
        System.out.println((so % 2 == 0) ? so + " la so chan!" : so + " la so le!");
    }
}

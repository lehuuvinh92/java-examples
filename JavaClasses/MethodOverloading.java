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
public class MethodOverloading {

    // this method accepts int
    private static void display(int a) {
        System.out.println("Arguments: " + a);
    }

    private static void display(int a, int b) {
        System.out.println("Arguments: " + a + " and " + b);
    }

    // this method  accepts String object
    private static void display(String a) {
        System.out.println("Got String object.");
    }

    public static void main(String[] args) {
        display(1);
        display(1, 4);
        display("Hello");
    }
}

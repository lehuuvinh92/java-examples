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
public class SumMethod {

    public static int sum(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Tong tu 1 den 10 la " + sum(1, 10));
        System.out.println("Tong tu 25 den 35 la " + sum(25, 35));
        System.out.println("Tong tu 37 den 49 la " + sum(37, 49));
    }
}

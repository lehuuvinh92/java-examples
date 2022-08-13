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
class MyUtils {

    public static double mean(int[] p) {
        int sum = 0;
        for (int i = 0; i < p.length; i++) {
            sum += p[i];
        }
        return ((double) sum) / p.length;
    }
}

public class StaticMethodInClass {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // Gọi phương thức tĩnh
        double avgAtt = MyUtils.mean(arr);
        System.out.print(avgAtt);
    }
}
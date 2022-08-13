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
public class SumArray {

    public static void main(String[] args) {
        double[] myList = {2.3, 5.0, 7.1, 5.5, 9.2};
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.print("Tong cac phan tu trong mang = " + total);
    }
}

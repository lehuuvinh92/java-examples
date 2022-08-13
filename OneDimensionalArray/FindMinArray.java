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
public class FindMinArray {

    public static void main(String[] args) {
        double[] myList = {2.3, 5.0, 7.1, 5.5, 9.2};
        double min = myList[0];
        int indexMin = 0;
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] < min) {
                min = myList[i];
                indexMin = i;
            }
        }
        System.out.println("Phan tu min trong mang = " + min);
        System.out.println("Chi so phan tu min trong mang = " + indexMin);
    }
}

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
public class RandomArray {

    public static void main(String[] args) {
        double[] myList = new double[5];
        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 100;
        }
        System.out.print("Cac phan tu trong mang: ");
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }
    }
}

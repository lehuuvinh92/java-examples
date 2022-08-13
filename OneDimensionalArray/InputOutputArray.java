/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gochocit.examples;

import java.util.Scanner;

/**
 *
 * @author LHVINH
 */
public class InputOutputArray {

    public static void main(String[] args) {
        double[] myList = new double[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap " + myList.length + " cua mang:");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();
        }
        System.out.print("Cac phan tu trong mang: ");
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }
    }
}

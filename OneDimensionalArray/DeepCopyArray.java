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
public class DeepCopyArray {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] copyArr = new int[6];
        //sao chép mảng numbers vào mảng copyArr
        for (int i = 0; i < numbers.length; ++i) {
            copyArr[i] = numbers[i];
        }
        System.out.print("Mang copyArr sao chep duoc: ");
        for (int number : copyArr) {
            System.out.print(number + " ");
        }
    }
}

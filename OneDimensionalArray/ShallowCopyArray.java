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
public class ShallowCopyArray {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] copyArr = numbers;
        System.out.print("Mang copyArr sao chep duoc: ");
        for (int number : copyArr) {
            System.out.print(number + " ");
        }
        System.out.println();
        numbers[0] = -111;//thay đổi phần tử đầu tiên trong mảng numbers
        System.out.print("Mang copyArr sau khi mang numbers thay doi: ");
        for (int number : copyArr) {
            System.out.print(number + " ");
        }
    }
}

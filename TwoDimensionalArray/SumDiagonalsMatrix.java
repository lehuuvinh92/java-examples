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
public class SumDiagonalsMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 0},
            {4, 5, 6, 9},
            {7, 2, 5, 5}
        };
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (row == column) {
                    total += matrix[row][column];
                }
            }
        }
        System.out.println("Tong cac phan tu tren duong cheo chinh cua matrix = " + total);
    }
}

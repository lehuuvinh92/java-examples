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
public class LoopArrayWithForEach {

    public static void main(String[] args) {
        double[] myList = {2.3, 5.0, 7.1, 5.5, 9.2};
        double sum = 0;
        double average = 0;
        //tính tổng các phần tử trong mảng
        for (double number : myList) {
            sum += number;
        }
        //lấy kích thước của mảng
        int arrayLength = myList.length;
        //tính trung bình cộng các phần tử trong mảng
        average = sum / arrayLength;
        System.out.println("Tong = " + sum);
        System.out.println("Trung binh = " + average);
    }
}

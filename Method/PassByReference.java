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
public class PassByReference {

    int data;

    PassByReference(int dataValue) {
        data = dataValue;
    }

    /*Hoán đổi 2 biến*/
    public static void swap(PassByReference n1, PassByReference n2) {
        System.out.println("\tGia tri cac bien ben trong ham swap");
        System.out.println("\t\tTruoc khi swap, n1.data = " + n1.data + " va n2.data = " + n2.data);
        // Swap n1.data with n2.data
        int temp = n1.data;
        n1.data = n2.data;
        n2.data = temp;
        System.out.println("\t\tSau khi swap, n1.data = " + n1.data + " va n2.data = " + n2.data);
    }

    public static void main(String[] args) {
        PassByReference n1 = new PassByReference(1);
        PassByReference n2 = new PassByReference(2);
        System.out.println("Truoc khi goi ham swap, n1.data = " + n1.data + " va n2.data = " + n2.data);
        swap(n1, n2);
        System.out.println("Sau khi goi ham swap, n1.data = " + n1.data + " va n2.data = " + n2.data);
    }
}

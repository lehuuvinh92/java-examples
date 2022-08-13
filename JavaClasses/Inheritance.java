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
class Nguoi {

    String name;

    //hàm đi chơi
    void diChoi() {
        System.out.println(name + " di choi thoi!");
    }
}

class SinhVien extends Nguoi {

    int studentId;

    //hàm đi học
    void diHoc() {
        System.out.println(name + " mssv: " + studentId + " di hoc thoi!");
    }
}

public class Inheritance {

    public static void main(String args[]) {
        SinhVien sv1 = new SinhVien();
        sv1.name = "An";
        sv1.studentId = 123456789;
        sv1.diChoi();
        sv1.diHoc();
    }
}

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
class LopCha {

    public void xuat() {
        System.out.println("Lop cha.");
    }
}

class LopCon extends LopCha {

    @Override
    public void xuat() {
        super.xuat();//gọi hàm xuat() của lớp cha
        System.out.println("Lop con.");
    }
}

public class SuperInClass {

    public static void main(String[] args) {
        LopCon aaa = new LopCon();
        aaa.xuat();
    }
}

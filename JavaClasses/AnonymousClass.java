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
class LopA {

    public void xuat() {
        System.out.println("Day la lop A.");
    }
}

class AnonymousDemo {

    public void createClass() {
        //tạo một anonymous class extends LopA
        LopA p1 = new LopA() {
            @Override
            public void xuat() {
                System.out.println("Day la anonymous class.");
            }
        };
        p1.xuat();
    }
}

class AnonymousClass {

    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();
    }
}

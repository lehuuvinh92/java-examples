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
class AClass {

    int bienA;

    //nested class
    class BClass {

        int bienB;

        void xuatBienB() {
            bienB = 5;
            System.out.println("Gia tri bienB = " + bienB);
        }
    }

    //protected nested class
    protected class CClass {

        int bienC;

        void xuatBienC() {
            bienC = 9;
            System.out.println("Gia tri bienC = " + bienC);
            bienA = 10;
            System.out.println("Gia tri bienA = " + bienA);
        }
    }
}

class InnerClass {

    public static void main(String[] args) {
        AClass ac = new AClass();
        AClass.BClass bc = ac.new BClass();
        AClass.CClass cc = ac.new CClass();
        System.out.println("Lop inner BClass:");
        bc.xuatBienB();
        System.out.println("Lop inner CClass:");
        cc.xuatBienC();
    }
}

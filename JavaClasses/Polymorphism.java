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
class Polygon {
    //phương thức render của lớp Polygon

    public void render() {
        System.out.println("Rendering Polygon...");
    }
}

class Square extends Polygon {
    //ghi đè phương thức render

    @Override
    public void render() {
        System.out.println("Rendering Square...");
    }
}

class Circle extends Polygon {
    //ghi đè phương thức render

    @Override
    public void render() {
        System.out.println("Rendering Circle...");
    }
}

class Polymorphism {

    public static void main(String[] args) {
        // create an object of Square
        Square s1 = new Square();
        s1.render();

        // create an object of Circle
        Circle c1 = new Circle();
        c1.render();
    }
}

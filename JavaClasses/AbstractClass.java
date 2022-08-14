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
abstract class Animal {

    //hàm abstract
    abstract void makeSound();

    public void eat() {
        System.out.println("I can eat.");
    }
}

class Dog extends Animal {

    //định nghĩa hàm abstract của lớp cha ở lớp con
    @Override
    public void makeSound() {
        System.out.println("Bark bark");
    }
}

class AbstractClass {

    public static void main(String[] args) {
        //tạo một đối tượng của lớp Dog
        Dog d1 = new Dog();
        d1.makeSound();
        d1.eat();
    }
}

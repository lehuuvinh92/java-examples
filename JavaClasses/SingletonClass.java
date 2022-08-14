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
class Database {

    private static Database dbObject;

    private Database() {
    }

    public static Database getInstance() {
        //tạo ra đối tượng nếu đối tượng chưa được tạo
        if (dbObject == null) {
            dbObject = new Database();
        }
        //return đối tượng của lớp Database
        return dbObject;
    }

    public void getConnection() {
        System.out.println("You are now connected to the database.");
    }
}

class SingletonClass {

    public static void main(String[] args) {
        //khai báo đối tượng mà không thể khởi tạo
        //bởi vì hàm khởi tạo được khai báo private
        Database db1;
        //lấy đối tượng duy nhất của lớp Database
        db1 = Database.getInstance();
        db1.getConnection();
    }
}

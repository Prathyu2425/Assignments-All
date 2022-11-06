package com.Oop;

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager(01, "Y.Naaju", 30000);
        Manager m2 = new Manager(02, "B.Harika", 32000);
        Manager m3 = new Manager(03, "V.Bhagya", 35000);
        Labour l1 = new Labour(1, "B.Divya", 15000);
        Labour l2 = new Labour(2, "K.Harsha", 16000);
        Labour l3 = new Labour(3, "K.Sowji", 18000);
        System.out.println(l1.getSalary() + l2.getSalary() + l3.getSalary() + m1.getSalary() + m2.getSalary() + m3.getSalary());
    }
}

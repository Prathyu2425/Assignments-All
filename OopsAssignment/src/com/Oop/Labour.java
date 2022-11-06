package com.Oop;

import java.util.*;
public class Labour extends Employee{
    //public static final
    double overtime=0.5;
    public Labour(int employeeId,String employeeName,double salary){
        super(employeeId,employeeName,salary);
    }
    public double getSalary() {
        return salary+salary*overtime;
    }



}
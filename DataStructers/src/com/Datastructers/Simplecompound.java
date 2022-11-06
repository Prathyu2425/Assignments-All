package com.Datastructers;
        import java.util.Scanner;

    public class Simplecompound {
        public static void main(String args[])
        {
            double a,rate,t,sim,com;
            Scanner s=new Scanner(System.in);
            System.out.println("enter the amount:");
            a=s.nextInt();
            System.out.println("enter the  no of years:");
            t=s.nextDouble();
            System.out.println("enter the rate interest");
            rate=s.nextDouble();
            sim=(a*t*rate)/100;
            com=a*Math.pow(1.0+rate/100.0,t)-a;
            System.out.println("simple interest is : "+sim);
            System.out.println("compound interest is : "+com);

        }
    }


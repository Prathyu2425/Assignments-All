package com.Lambda;

import java.util.ArrayList;
import java.util.List;
    import java.lang.*;
import java.util.*;
    public class ThreadExample {
        public static void main(String args[])
        {
            Thread t1=new Thread(()->{
                List<Integer> list=new ArrayList<Integer>();
                list.add(1);
                list.add(2);
                list.add(3);
                list.add(4);
                System.out.println(list);
                //Consumer<List<Integer>> numList=list1->list.stream().forEach(a->System.out.println(a+" "));
                //modify.addThen(numlist).accept(list);
            });
            t1.start();
        }
    }
    

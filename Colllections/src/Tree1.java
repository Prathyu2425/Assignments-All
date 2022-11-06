
    package com.Collections;
import java.util.*;
import java.util.TreeMap;
    public class Tree1 {
        public static void main(String[] args)
        {
            TreeMap<Long, String> map = new TreeMap<Long, String>();
            TreeMap<Long, String> Name = new TreeMap<Long,String>();
            TreeMap<Long, String> email = new TreeMap<Long, String>();
            TreeMap<Long, Enum> Gender = new TreeMap<Long, Enum>();
            map.put(86548934756L, "Sunitha");
            map.put(56748398655L, "Manogna");
            map.put(86598767867L, "Akhila");
            map.put(76584946376L, "Chinna");
            //  The keys are as follows
            System.out.println("The keys of the given treemap is" + map.keySet());
            System.out.println("The values of the given treemap is " + map.values());
            System.out.println("The key/value pair is " + map.entrySet());
            // The name class is given follow
            Name.put(86695746859L, "Akhila");
            Name.put(7685493647L, "Sunitha");
            Name.put(8765946736L, "Manogna");
            Name.put(7658493684L, "Chinna");
            Name.put(86874938436L, "Vanisree");
            Name.put(876557263265L, "Varsha");
            System.out.println("The keys of the given treemap is" + Name.keySet());
            System.out.println("The values of the given treemap is " + Name.values());
            System.out.println("The key/value pair is " + Name.entrySet());
            email.put(765648275365L, "sunitha123@gmail.com");
            email.put(76849378756L, "akhila123@gmail.com");
            email.put(98756736375L, "manogna34@gmail.com");
            email.put(876583674577L, "chinna@gmail.com");
            System.out.println("The keys of the given treemap is" + email.keySet());
            System.out.println("The values of the given treemap is" + email.values());
            System.out.println("The key/value pair is " + email.entrySet());
        }
    }

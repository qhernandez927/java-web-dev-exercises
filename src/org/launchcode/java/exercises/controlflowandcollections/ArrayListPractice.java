package org.launchcode.java.exercises.controlflowandcollections;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> tens = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();
        double sums = 0;
        tens.add(1);
        tens.add(2);
        tens.add(3);
        tens.add(4);
        tens.add(5);
        tens.add(6);
        tens.add(7);
        tens.add(8);
        tens.add(9);
        tens.add(10);
        for(int num : tens){
            if(num % 2 == 0){
                evens.add(num);
            }
        }
        for(int num : evens){
            System.out.println(sums += num);

        }
    }
}

package org.launchcode.java.exercises.controlflowandcollections;

public class ArrayPractice {
    public static void main (String[] args){
        int [] values = {1, 1, 2, 3, 5, 8};

        for(int i : values){
                System.out.println(i);
                if(i % 2 ==1){
                    System.out.println(i);
                }
            }
        }
    }




package org.launchcode.java.exercises.controlflowandcollections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapPractice {
    public static void main (String[] args){
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newId;

//        System.out.println("Enter your student ID:");


//        do {
//            System.out.println("Enter your student ID: ");
//            newId = input.nextInt();
            System.out.println("Enter your student ID: ");
            newId = input.nextInt();

            if(!newId.equals("")){
                System.out.print("Students Name: ");
                String newStudent = input.nextLine();
                students.put(newId, newStudent);
                input.nextLine();
            } else if (newId.equals("")){

            }

        System.out.println("\nClass Roster");

        for (Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println("ID:" + student.getKey() + " Student Name" + student.getValue());
        }
    }
}

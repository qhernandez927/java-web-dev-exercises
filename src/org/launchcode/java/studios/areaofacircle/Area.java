package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Enter the radius of your circle:");
        double radius = input.nextDouble();
        System.out.println("The radius of your circle is:" + Circle.getArea(radius));

    }
}

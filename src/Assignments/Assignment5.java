//Take the input of a radius and calculate area + circumference of the circle.
package Assignments;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Assignment5 {

    public static void main(String[] args) {
        float r;
        double area, circum;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        r = in.nextFloat();

        area = 3.14 * r * r;
        circum = 2 * 3.14 * r;

        System.out.println("Area of Circle :" + area);
        System.out.println("circumference of Circle :" + circum);
    }
}

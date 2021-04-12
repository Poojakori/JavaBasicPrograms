//consider 2 inputs as length and width of rectangle. Calculate the area + diagonal length + circumference.
package Assignments;
import java.util.Scanner;
import static java.lang.StrictMath.sqrt;

public class Assignment4 {
    public static void main(String[] args) {
        float l, w;
        float area, circum;
        double DiaLen;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length: ");
        l = in.nextFloat();
        System.out.println("Enter the width: ");
        w = in.nextFloat();

        area = w * l;
        DiaLen = sqrt((w*w)+(l*l));
        circum = 2 * (l + w);

        System.out.println("Area of Rectangle :" + area);
        System.out.println("circumference of Rectangle :" + circum);
        System.out.println("diagonal length of Rectangle :" + DiaLen);

    }

}

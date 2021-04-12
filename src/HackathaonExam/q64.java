//Write a Java program to replace the second element of a ArrayList with the specified element.
package HackathaonExam;

import java.util.ArrayList;

public class q64 {
    public static void main(String[] args){
        ArrayList<String> shapes = new ArrayList<String>();

        shapes.add("square");
        shapes.add("Triangle");

        System.out.println("Original array list: " + shapes);
        String new_shape = "Rectangle";
        shapes.set(1,new_shape);

        int num=shapes.size();
        System.out.println("after the Replace of second element");
        for(int i=0;i<num;i++)
            System.out.println(shapes.get(i));
    }
}

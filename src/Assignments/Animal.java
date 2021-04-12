package Assignments;

public class Animal {
     String Name;
     int Age;
     String Bread;
     String Color;
     String Action;

    public Animal(){
        System.out.println("Constructor one is called");
    }
    public Animal(String Name, int Age){
        System.out.println("Constructor Two is called");
    }
    public Animal(String Name, int Age, String Bread, String Color){
        System.out.println("Constructor Three is called");
    }

    public void move(){
            System.out.println("I am a "+ Bread +"."+Action);
        }

    public void Describe(){
            System.out.println("I am a "+Bread+". My name is "+ Name+". I am "+ Age+" years old,"+" with "+ Color+" Color.");
        }
}


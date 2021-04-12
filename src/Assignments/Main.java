package Assignments;

public class Main {

    public static void main(String[] args) {
        Animal dog= new Animal();
        Animal cat= new Animal("Kitty",3);
        Animal monkey= new Animal("Marcel",2,"monkey","Black & white");

        dog.Name = "Pinky";
        dog.Bread="dog";
        dog.Color="White";
        dog.Age=4;
        dog.Action="I Bark.";
        cat.Name="Kitty";
        cat.Bread="cat";
        cat.Color="Black";
        cat.Age=3;
        cat.Action="I run.";
        monkey.Name="Marcel";
        monkey.Bread="monkey";
        monkey.Color="Black & white";
        monkey.Age=2;
        monkey.Action="I jump.";

        dog.move();
        dog.Describe();
        cat.move();
        cat.Describe();
        monkey.move();
        monkey.Describe();

    }
}

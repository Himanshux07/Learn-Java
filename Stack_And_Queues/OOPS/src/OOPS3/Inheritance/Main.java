package OOPS3.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(4,6,3);


        BoxWeight box2= new BoxWeight(2,3,4,5);
        System.out.println(box.length + " " +box.breadth + " "+ box.width);

        Box box3 = new BoxWeight(1,2,3,4);

        //you cant access the variable of child class
        // box3.weight ----->  will throw an error

        // you can access parent class variable

        box.length=3;

        // this is not allowed as you are referencing parent to child
        // BoxWeight box = new Box(); ---> throw an error


    }
}

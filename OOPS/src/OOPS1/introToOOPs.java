package OOPS1;

public class introToOOPs {
    public static void main(String args[]){

//        OOPS1.Student s1=new OOPS1.Student();
//
//        s1.name="Himu";
//        s1.rollNo=8124;
//        s1.marks=94.3f;

//        s1.display();

        Student s2=new Student("Johny",16,88.0f);

//        s2.display();

        //overloading
        Student s3=new Student(s2);
        s3.display();;

        // calling a constructor from a constructor

        Student s4= new Student();
        s4.display();
    }
}

class Student{

    String name;
    int rollNo;
    float marks;

//    OOPS1.Student(){
//
//    }



    void display(){
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(marks);
    }

    Student(String name,int roll,float mark){
        this.name=name;
        rollNo=roll;
        this.marks=mark;
    }

    //constructor overloading
    Student(Student other){
        this.name=other.name;
        this.rollNo=other.rollNo;
        this.marks= other.marks;
    }
    // calling a constructor from a constructor;
    Student(){
        this ("Himanshu",8124,100.0f);
    }
}
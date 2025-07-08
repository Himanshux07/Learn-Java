import java.util.Scanner;
//function overloading
public class Intext
{
    public static void main(String [] args)
    {
        overloading1(96);
        overloading2("Himanshu");
    }
    static void overloading1(int a){
        System.out.println(a);
    }
    static void overloading2(String b){
        System.out.println(b);
    }
}
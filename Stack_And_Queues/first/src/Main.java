import java.util.Arrays;
//variable arguments
public class Main {
    public static void main(String [] arg) {
        vararg(1,3,5,67,78,69);   // we can pass any no. of input
    }
    static void vararg(int ...v){
        System.out.println(Arrays.toString(v)); // will print in array format
    }
}
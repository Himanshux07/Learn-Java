import java.io.*;
public class Codeforces {
    public static void main(String[] args) {

            // Manually throwing ArithmeticException
            int a = 10, b = 0;

            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }

        System.out.println("Program continues normally...");
    }
}
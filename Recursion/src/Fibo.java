import java.util.*;
public class Fibo {
    static int fibbo(int n){
        if(n<2) return n;
        return fibbo(n-1) + fibbo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fibbo(4));
    }
}
import java.util.*;
public class cd {
    static int p;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        p=t;
       number(t);
    }

    static int number(int n){


        if(n!=p)  System.out.print((Math.abs(p-n) + " "));
        if(n==0) return 0;
        return number(n-1);
    }
}
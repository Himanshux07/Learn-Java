// 1st set bit from right

import java.util.Scanner;

public class firstBit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        while((n & 1)==0){
            n>>=1;
            count++;


        }

        System.out.println(count);

    }
}

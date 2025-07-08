import java.util.Scanner;
//fibonacci number
public class fibonacci {
    public static void main(String [] arg) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your First number ");
        int a = sc.nextInt();
        System.out.print("Enter Your Second number ");
        int b = sc.nextInt();
        System.out.print("Enter the Index you want ");
        int c = sc.nextInt();
        System.out.print(a + " " + b +" ");
        int d;
        for(int i=1; i<=c-2; i++){
            d = a + b;
            System.out.print(d + " ");
            a=b;
            b=d;
        }
        System.out.println(" ");
        System.out.println("Your number of given Index is : " + b);
    }
}

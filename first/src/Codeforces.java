import java.util.Scanner;

public class Codeforces {

    static boolean isPossible(int a, int b, int c) {

        int r1 = 2 * b - c;
        if (r1 > 0 && r1 % a == 0) return true;


        int sum = a + c;
        if (sum % 2 == 0) {
            int mid = sum / 2;
            if (mid > 0 && mid % b == 0) return true;
        }


        int r3 = 2 * b - a;
        if (r3 > 0 && r3 % c == 0) return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (isPossible(a, b, c)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}

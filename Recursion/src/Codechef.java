import java.util.*;

public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            String s = sc.next();

            Set<Character> u = new HashSet<>();
            long cnt = 0;

            for (int p = 0; p < s.length(); p++) {
                u.add(s.charAt(p));
                cnt += u.size();
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}
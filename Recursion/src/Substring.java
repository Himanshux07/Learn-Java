import java.util.*;
import java.lang.*;

class Substring {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            sub("", str.substring(i), list);
        }

        System.out.println(list);


    }

    static void sub(String pr, String unpr, ArrayList<String> list) {
        if (!pr.isEmpty()) {
            list.add(pr);
        }
        if (unpr.isEmpty()) {
            return;
        }
        sub(pr + unpr.charAt(0), unpr.substring(1), list);
    }
}

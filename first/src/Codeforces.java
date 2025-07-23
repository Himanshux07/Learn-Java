import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Codeforces {
    public static void main(String[] args)  {
        Scanner sc= new Scanner(System.in);

        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();

            String s1=sc.next();
            String s2=sc.next();

            while(q-->0){
                int l=sc.nextInt();
                int r=sc.nextInt();

                int [] f1= new int[26];
                int [] f2= new int[26];

                for(int i=l-1;i<r;i++){
                    f1[s1.charAt(i)-'a']++;
                    f2[s2.charAt(i)-'a']++;
                }
                int ans=0;
                for(int i=0;i<26;i++){
                    ans+=Math.abs(f1[i]-f2[i]);

                }

                System.out.println(ans/2);
            }
        }
    }
}

import java.util.*;
public class Codeforces
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int [] arr= new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int c1=0;
            int c2=0;
            for(int i=1;i<n;i++){
                if(arr[i]-arr[i-1]<=k) c1++;
                else {
                    c2=Math.max(c2,c1+1);
                    c1=0;
                }
            }
            c2=Math.max(c2,c1+1);
            System.out.println(n-c2);

        }

    }
}

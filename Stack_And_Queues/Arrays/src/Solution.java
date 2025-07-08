import java.util.*;

public class Solution {
    static int minimum (int [] arr,int n){
        int min=0;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[min]) min=i;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i=0;i<t;i++){
            int n= scanner.nextInt();
            int [] arr = new int[n];
            for(int j=0;j<n;j++){
                arr[j]= scanner.nextInt();
            }
            int min = minimum(arr,n);
            if(arr[min]<=(n-1-min)+n ){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}



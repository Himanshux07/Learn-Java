import java.util.Scanner;
import java.util.Arrays;
public class Sample {
    static void sort(int [] arr){
        for(int i=1;i<arr.length;i++){
            int ele = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>ele){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=ele;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}

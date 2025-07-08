import java.util.Arrays;

public class Quicksort {

    public static void sort(int [] arr, int low,int high){
        if(low>=high)
            return;
        int s=low;
        int e=high;
        int pivot=arr[(s+e)/2];

        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }

            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;

                s++;
                e--;
            }
        }
        sort(arr,low,e);
        sort(arr,s,high);
    }

    public static void main(String[] args) {
        int [] arr = {4,6,3,9,1,5};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

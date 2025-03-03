import java.util.Arrays;
public class MergeSort {

    public static int[] sort(int [] arr){
        if(arr.length==1)
            return arr;
        int mid=arr.length/2;

        int [] left=sort(Arrays.copyOfRange(arr,0,mid));
        int [] right=sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    public static int[] merge(int [] first, int[] second){
        int [] mix =new int[first.length + second.length];
        int s=0;
        int e=0;
        int k=0;
        while(s < first.length && e < second.length){
            if(first[s]<second[e]){
                mix[k]=first[s];
                s++;

            }
            else{
                mix[k]=second[e];
                e++;

            }
            k++;
        }
        while (s < first.length) {
            mix[k] = first[s];
            s++;
            k++;
        }

        while (e < second.length) {
            mix[k] = second[e];
            e++;
            k++;
        }
        return mix;
    }

    public static void main(String[] args) {
        int [] arr = {4,6,3,9,1,5,6,9,3,0};
        int [] arr2 = sort(arr);
        System.out.println(Arrays.toString(arr2));
    }
}

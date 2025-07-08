import java.util.Scanner;
public class OrderAgnosticBinay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter your array");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the array to search");
        int num = sc.nextInt();
        int ans=agnostic(arr,num);
        System.out.println("The number is at index " + ans);
    }
    static int agnostic(int[] arr, int number){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid= start-(start-end)/2;

            if(arr[mid]==number){
                return mid;
            }
             else if(arr[start]<arr[end])
            {
                if(arr[mid]>number)
                {
                    end=mid-1;
                }
                else if (arr[mid]<number)
                {
                    start= mid+1;
                }
            }
            else if (arr[start]<arr[end])
            {
                if(arr[mid]<number)
                {
                    end=mid-1;
                }
                else if (arr[mid]>number)
                {
                    start= mid+1;
                }
            }

        }
        return -1;
    }
}

import java.util.Scanner;
//ceiling of a numbers means that the smallest number greater than or equal to the target element
//for ascending return start
//for descending return end
//vice versa in floor
public class Ceiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter your array");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int num = sc.nextInt();
        int ans=agnostic(arr,num);
        System.out.println("The number is  " + arr[ans]);
    }
    static int agnostic(int[] arr, int number) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] < arr[end]) {    // for ascending order
            while (start <= end) {
                int mid = start - (start - end) / 2;

                if (arr[mid] > number) {
                    end = mid - 1;
                }
                else if (arr[mid] < number) {
                    start = mid + 1;
                }
            }
            return start;
        }
        else if (arr[start] > arr[end]) {   //descending order
            while (start <= end) {
                int mid = start - (start - end) / 2;

                if (arr[mid] < number) {
                    end = mid - 1;
                } else if (arr[mid] > number) {
                    start = mid + 1;
                }
            }
            return end;
        }
        return -1;                             // if target is greater than the last index element......
    }
}
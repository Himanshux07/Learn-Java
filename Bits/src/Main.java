import java.util.Scanner;

public class Main {

    // odd even
    static boolean isOdd(int n){

        return ((n & 1)==1);
    }

    // the Array element which is not repeated twice
    static int Single(int[] arr){

        int unique=0;
        for(int ele : arr){
            unique^=ele;         //XOR the array
        }
        return unique;
    }

    // ith bit of a number we use right shift instead of left shift;
    static int bit(int n,int i){

       return (n >> (i - 1)) & 1;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println(isOdd(6));

        int [] arr= {1,4,6,1,4,3,3};
        System.out.println(Single(arr));

        System.out.println(bit(5,3));

    }
}
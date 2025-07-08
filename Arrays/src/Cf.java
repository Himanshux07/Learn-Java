import java.util.*;
class Cf {
    public static void flipAndInvertImage(int[][] image) {
        for(int [] row : image){
            int start=0;
            int end=row.length-1;
            while(start<=end){
                int temp=row[start];
                row[start]=row[end]^1;
                row[end]=temp^1;
                start++;
                end--;
            }
            System.out.println(Arrays.toString(row));
        }

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int [] [] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        flipAndInvertImage(arr);
    }
}
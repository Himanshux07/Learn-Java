import java.util.ArrayList;
import java.util.Arrays;
public class IterationMethodSubset {

    public static void main(String[] args) {
        int [] arr ={1,2,3,4};
        ArrayList<ArrayList<Integer>> ans= subset(arr);
        for(ArrayList<Integer> list : ans){
            System.out.println(list);
        }

    }

    static ArrayList<ArrayList<Integer>> subset(int [] arr){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int ele : arr){
             int n=outer.size();
             for(int i=0;i<n;i++){
                 ArrayList<Integer> inner =new ArrayList<>(outer.get(i));
                 inner.add(ele);
                 outer.add(inner);
             }
        }
        return outer;
    }

    // for duplicate element
    static ArrayList<ArrayList<Integer>> subsetDuplicate(int [] arr){
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            for(int j=start;j<end;j++){
                ArrayList<Integer> inner =new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}


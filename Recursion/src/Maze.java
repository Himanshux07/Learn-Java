import java.util.ArrayList;
public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        path(3,3,"");
        System.out.println(pathret(3,3,""));
    }

    static int count (int row ,int col){
        if (row==1 || col ==1){
            return 1;
        }
        int left=count(row-1,col);
        int right=count(row,col-1);

        return left + right;
    }

    static void path(int row,int col,String process){
        if(row==1 && col==1){
            System.out.println(process);
            return;
        }
        if(row>1) {
            path(row - 1, col, process + "Down ");
        }
        if(col>1) {
            path(row, col - 1, process + "Right ");
        }
    }

    static ArrayList<String> pathret(int row,int col,String process){

        ArrayList<String> list=new ArrayList<>();
        if(row==1 && col==1){
            list.add(process);
            return list;
        }
        if(row>1) {
            list.addAll(pathret(row - 1, col, process + "Down "));
        }
        if(col>1) {
            list.addAll(pathret(row, col - 1, process + "Right "));
        }
        return list;
    }
}

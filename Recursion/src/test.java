public class test {
    static void pattern(int r,int c){
        if(r>c){
            System.out.print("*");
            pattern(r,c+1);
        }
        else if(c==r){
            System.out.println();
            pattern(r-1,0);
        }
        else
            return;
    }
    static void pattern2(int r,int c){
        if(r>c){
            pattern2(r,c+1);
            System.out.print("*");

        }
        else if(c==r){

            pattern2(r-1,0);
            System.out.println();
        }
        else
            return;
    }

    public static void main(String[] args) {
//        pattern(5,0);
        pattern2(5,0);
    }
}

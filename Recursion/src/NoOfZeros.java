public class NoOfZeros {
    static int count(int n,int c){
        if(n==0)
            return c;
        if(n%10==0)
            return count(n/10,c+1);
        else
            return count(n/10,c);

    }

    public static void main(String[] args) {
        System.out.print(count(31024009,0));
    }
}

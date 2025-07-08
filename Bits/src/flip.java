// minimum number of flip to change the number
public class flip {
    public static void main(String[] args) {
        int start=10;
        int goal=7;
        int ans=start^goal;
        int count=0;
        while(ans>0){
            if((ans & 1)==1) {
                count++;

            }
            ans>>=1;
        }
        System.out.println(count);
    }
}

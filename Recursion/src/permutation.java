public class permutation {
    public static void main(String[] args) {
        permu("","abc");
        System.out.println( countpermu("","abc"));

    }

    static void permu(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        for(int i=0;i<=p.length();i++){
            String a=p.substring(0,i);
            String b=p.substring(i);
            permu(a+up.charAt(0)+b,up.substring(1));
        }
    }

    static int countpermu(String p,String up){

        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        for(int i=0;i<=p.length();i++){
            String a=p.substring(0,i);
            String b=p.substring(i);
           count= count + countpermu(a+up.charAt(0)+b,up.substring(1));
        }
        return count;
    }
}

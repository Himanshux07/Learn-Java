public class permutation {
    public static void main(String[] args) {
        permu("","abc");


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


}

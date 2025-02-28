import java.util.ArrayList;

public class subset {

    public static void main(String[] args) {
//       subs("","abc");

         System.out.println(subsList("","himu"));



    }

    static void subs(String process,String unprocess){
        if(unprocess.isEmpty()){
            System.out.println(process);
            return;
        }
        subs(process,unprocess.substring(1));
        subs(process + unprocess.charAt(0),unprocess.substring(1));

    }

    static ArrayList<String> subsList(String process, String unprocess){
        ArrayList<String> list=new ArrayList<>();
        if(unprocess.isEmpty()){

            list.add(process);
            return list;
        }
        ArrayList<String> left=subsList(process,unprocess.substring(1));
        ArrayList<String> right=subsList(process + unprocess.charAt(0),unprocess.substring(1));

        list.addAll(left);
        list.addAll(right);

        return list;
    }


}

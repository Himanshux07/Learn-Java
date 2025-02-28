public class RemoveChar {

    public static void main(String[] args) {
        System.out.println(remove("aeroplane",""));
        skipString("I love apple and banana","");
    }

    static String remove(String opr,String str){
        if(opr.equals(""))
            return str;

        if(opr.charAt(0)=='a'){
           return remove(opr.substring(1),str);
        }
        else{
           return remove(opr.substring(1),str+opr.charAt(0));
        }
    }
    static void skipString (String opr,String str) {
        if (opr.equals("")){
            System.out.println(str);
            return;
          }

        if (opr.startsWith("apple")) {
            skipString(opr.substring(5), str);
        } else {
            skipString(opr.substring(1), str + opr.charAt(0));
        }
    }
}

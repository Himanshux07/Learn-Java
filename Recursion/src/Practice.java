import java.util.*;
import java.lang.*;
import java.io.*;

class Practice
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        String str = sc.next();

        char [] builder = str.toCharArray();

        int s=0;
        int e=str.length()-1;

        while(s<e){
            boolean c1=builder[s]=='a' || builder[s]=='e' || builder[s]=='i' || builder[s]=='o' || builder[s]=='u' ;
            boolean c2=builder[e]=='a' || builder[e]=='e' || builder[e]=='i' || builder[e]=='o' || builder[e]=='u' ;
            if(c1 && c2){
                char ch = builder[s];
                builder[s]= builder[e];
                builder[e]=ch;
            }
            if(c1 && !c2){
                e--;
            }
            else if(!c1 && c2 ){
                s++;
            }
            else{
                s++;
                e--;
            }
        }
        String ans = new String(builder);

        System.out.println(ans);
    }
}


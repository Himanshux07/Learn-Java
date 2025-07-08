import java.util.*;
public class Main{
    public static void main(String[] args) {
        LL list = new LL();

        list.InsertFirstEle(4);
        list.InsertFirstEle(5);
        list.InsertFirstEle(6);
        list.InsertFirstEle(7);


        list.Display();
        System.out.println(list.size);

    }
}
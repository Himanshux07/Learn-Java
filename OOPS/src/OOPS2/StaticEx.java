package OOPS2;

public class StaticEx {
    public static void main(String[] args) {
//        OOPS2.Human kunal = new OOPS2.Human(22, "Kunal", 10000, false);
//        OOPS2.Human rahul = new OOPS2.Human(34, "Rahul", 15000, true);
//        OOPS2.Human arpit = new OOPS2.Human(34, "arpit", 15000, true);
//
//        System.out.println(OOPS2.Human.population);
//        System.out.println(OOPS2.Human.population);
//        System.out.println(OOPS2.Human.population);

        StaticEx funn = new StaticEx();
        funn.fun2();

    }

    // this is not dependent on objects
    static void fun() {
//        greeting(); // you cant use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // you cannot access non static stuff without referencing their instances in
        // a static context

        // hence, here I am referencing it
        StaticEx obj = new StaticEx();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    // we know that something which is not static, belongs to an object
    void greeting() {
//        fun();
        System.out.println("Hello world");
    }
}

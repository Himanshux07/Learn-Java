package OOPS3.Inheritance;

public class Box {
    int length;
    int breadth;
    int width;

    Box(){
        this.length=-1;
        this.breadth=-1;
        this.width=-1;
    }

    Box(int l,int b,int w){
        this.length=l;
        this.breadth=b;
        this.width=w;
    }

    //cube
    Box(int side){
        this.length=side;
        this.width=side;
        this.breadth=side;
    }

    Box(Box old) {
        this.length = old.length;
        this.breadth = old.breadth;
        this.width = old.width;
    }

}

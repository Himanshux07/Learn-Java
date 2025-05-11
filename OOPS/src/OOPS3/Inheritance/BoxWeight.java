package OOPS3.Inheritance;

public class BoxWeight extends Box{
    int weight;

    public BoxWeight(){
        this.weight=-1;
    }

    public BoxWeight(int l,int b,int h,int w){
        super(l,b,h);

        this.weight=w;
    }

    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }

}

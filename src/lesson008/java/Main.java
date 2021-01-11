package lesson008.java;

public class Main {
    public static void main(String[] args) {
        One.divider(3,2);
        System.out.println(One.multi(1,2,3));
        One one = new One();
        System.out.println("Round square: "+one.roundSquare(4.5));
        System.out.println("Round length: " +One.roundLength(4.5));
        one.showAll(4.5);
    }
}

class One{
    static final double pi = 3.14;

    static int multi(int arg1, int arg2, int arg3){
        return arg1*arg2*arg3;
    }

    static void divider(int arg1, int arg2){
        System.out.println("Input "+arg1+", "+arg2+" - quotient of division: "+arg1/arg2+
                ", remainder:"+arg1%arg2);
    }

    double roundSquare(double r){
        return pi*r*r;
    }

    static double roundLength(double r){
        return 2*pi*r;
    }

    void showAll(double r){
        System.out.println("Radius: "+r);
        System.out.println("Round square: "+roundSquare(r));
        System.out.println("Round length: "+roundLength(r));
    }
}
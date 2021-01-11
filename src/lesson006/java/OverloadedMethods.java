package lesson006.java;

public class OverloadedMethods {
    public static void main(String[] args) {
        Overloaded overloaded = new Overloaded();
        System.out.println(overloaded.sumNumbers());
        System.out.println(overloaded.sumNumbers(1));
        System.out.println(overloaded.sumNumbers(1,2));
        System.out.println(overloaded.sumNumbers(1,2,3));
        System.out.println(overloaded.sumNumbers(1,2,3,4));
    }
}

class Overloaded{

    public int sumNumbers(){
        return 0;
    }

    public int sumNumbers(int arg1){
        return arg1;
    }

    public int sumNumbers(int arg1, int arg2){
        return arg1+arg2;
    }

    public int sumNumbers(int arg1, int arg2, int arg3){
        return arg1+arg2+arg3;
    }

    public int sumNumbers(int arg1, int arg2, int arg3, int arg4){
        return arg1+arg2+arg3+arg4;
    }
}


package lesson017.java;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println(EqualSBInner.checkEqual(sb1, sb2));
    }
}

class EqualSBInner{
    static boolean checkEqual(StringBuilder sb1, StringBuilder sb2){
        return sb1.toString().equals(sb2.toString());
    }
}


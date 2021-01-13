package lesson010.java.p4;

import lesson010.java.p1.A;
import static lesson010.java.p1.p2.B.*;
import lesson010.java.p1.p2.p3.C;
import lesson010.java.p4.p5.E;

public class D {
    int dInt = 4;
    String dString = "Class D";

    public D() {
    }

    public D(int dInt, String dString) {
        this.dInt = dInt;
        this.dString = dString;
    }

    public static void main(String[] args) {
        A a = new A();
        C c = new C();
        D d = new D();
        E e = new E();
        System.out.println(a.aString);
        System.out.println(a.aInt);
        System.out.println("-----------------------------");
        System.out.println(bString);
        System.out.println(bInt);
        System.out.println("-----------------------------");
        System.out.println(c.cString);
        System.out.println(c.cInt);
        System.out.println("-----------------------------");
        System.out.println(e.eString);
        System.out.println(e.eInt);
    }
}

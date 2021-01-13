package lesson013.java;

public class MonthTest {
    public static void main(String[] args) {
        System.out.println(showDaysInMonth(1));
        System.out.println(showDaysInMonth(2));
        System.out.println(showDaysInMonth(15));
    }

    static int showDaysInMonth(int month){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
                return 30;
        }
        return 0;
    }
}


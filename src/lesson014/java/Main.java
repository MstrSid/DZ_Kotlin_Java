package lesson014.java;

public class Main {
    public static void main(String[] args) {
        ShowTime.showTime();
    }
}


class ShowTime {
    static void showTime() {
        OUTER:
        for (int h = 0; h < 6; h++) {
            //MIDDLE:
            for (int m = 0; m < 60; m++) { //middle
                if (h > 1 && m % 10 == 0 && m > 0) {
                    break OUTER;
                }
                //INNER:
                for (int s = 0; s < 60; s++) { //inner
                    if (s * h > m) {
                        continue;
                    }
                    if (m < 10 && s < 10) {
                        System.out.println(h + ":0" + m + ":0" + s);
                    } else if (m < 10) {
                        System.out.println("0" + h + ":0" + m + ":" + s);
                    } else if (s < 10) {
                        System.out.println("0" + h + ":" + m + ":0" + s);
                    } else
                        System.out.println("0" + h + ":" + m + ":" + s);
                }
            }
        }
    }
}
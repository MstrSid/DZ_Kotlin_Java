package lesson015.java;

public class Main {
    public static void main(String[] args) {
        ShowTime.showTime();
    }
}


class ShowTime {
    static void showTime() {
        int h = 0, m = 0, s;
        OUTER:
        while (h < 6) {
            do {
                if (h > 1 && m % 10 == 0 && m > 0) {
                    break OUTER;
                }
                s = 0;
                while (s < 60) {
                    if (s * h <= m) {
                        if (m < 10 && s < 10) {
                            System.out.println("0" + h + ":0" + m + ":0" + s);
                        } else if (m < 10) {
                            System.out.println("0" + h + ":0" + m + ":" + s);
                        } else if (s < 10) {
                            System.out.println("0" + h + ":" + m + ":0" + s);
                        } else
                            System.out.println("0" + h + ":" + m + ":" + s);
                        s++;
                    } else break;
                }
                m++;
            } while (m < 60);
            h++;
            m = 0;
        }

    }
}
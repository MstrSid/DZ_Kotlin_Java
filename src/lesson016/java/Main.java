package lesson016.java;

public class Main {
    public static void main(String[] args) {
        Sender.email("a@tut.by;b@yahoo.com;");
    }
}


class Sender {
    static public void email(String mail) {
        int start, end, comma = 0;
        while (comma < mail.length() - 1) { //starts comma index from 0, nex indexes comma find in body cycle
            start = mail.indexOf('@', comma); //for @ find index, starts from comma index
            end = mail.indexOf('.', comma); //for . find index, starts from comma index
            comma = mail.indexOf(';', comma) + 1; //for next comma find index, starts from this comma index + 1
            System.out.println(mail.substring(start + 1, end));
        }
    }
}
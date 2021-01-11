package lesson005.java;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Mike", "Luis", 4055, 2010, 8.7, 7.9, 6.5);
        Student student2 = new Student("Nina", "Miss", 4177, 2009, 7.8, 6.5, 7.8);
        Student student3 = new Student("Leon", "Smith", 1452, 2010, 6.6, 7.9, 6.4);
        showAvg(student1);
        showAvg(student2);
        showAvg(student3);
    }

    static void showAvg(Student student) {
        double avg = (student.avgEconomics + student.avgForeignLang + student.avgMath) / 3;
        System.out.println("Average grade for " + student.numberTicket + ": " + student.name + " " + student.surname + " is " + String.format("%.2f", avg));
    }
}

class Student {
    final int numberTicket;
    final String name;
    final String surname;
    final int yearStudy;
    final double avgMath;
    final double avgEconomics;
    final double avgForeignLang;

    public Student(String name, String surname, int numberTicket, int yearStudy, double avgMath, double avgEconomics, double avgForeignLang) {
        this.numberTicket = numberTicket;
        this.name = name;
        this.surname = surname;
        this.yearStudy = yearStudy;
        this.avgMath = avgMath;
        this.avgEconomics = avgEconomics;
        this.avgForeignLang = avgForeignLang;
    }

}


package lesson006.java;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Mike", "Luis", 4055, 2, 8.7, 7.9, 6.5);
        Student student2 = new Student("Nina", "Miss", 4177, 3);
        Student student3 = new Student();
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
    int numberTicket = 0;
    String name = "NoName";
    String surname = "NoName";
    int course = 1;
    double avgMath = 0.0;
    double avgEconomics = 0.0;
    double avgForeignLang = 0.0;

    public Student() {
    }

    public Student(String name,
                   String surname,
                   int numberTicket,
                   int course) {
        this();
        this.numberTicket = numberTicket;
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public Student(String name,
                   String surname,
                   int numberTicket,
                   int course,
                   double avgMath,
                   double avgEconomics,
                   double avgForeignLang) {
        this(name, surname, numberTicket, course);
        this.avgMath = avgMath;
        this.avgEconomics = avgEconomics;
        this.avgForeignLang = avgForeignLang;
    }
}


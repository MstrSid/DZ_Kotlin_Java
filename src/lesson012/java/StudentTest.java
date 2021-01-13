package lesson012.java;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Mike", "Luis", 4055, 2, 8.7, 7.9, 6.5);
        Student student2 = new Student("Nick", "Smith", 5466, 3, 7.7, 7.8, 6.6);
        Student student3 = new Student("Mike", "Luis", 4055, 2, 8.7, 7.9, 6.5);
        showAvg(student1);
        showAvg(student2);
        showAvg(student3);
        eq1(student1, student2);
        eq2(student1, student2);

        eq1(student1, student3);
        eq2(student1, student3);

    }

    static void showAvg(Student student) {
        double avg = (student.avgEconomics + student.avgForeignLang + student.avgMath) / 3;
        System.out.println("Average grade for " + student.numberTicket + ": " + student.name + " " + student.surname + " is " + String.format("%.2f", avg));
    }

    static void eq1(Student st1, Student st2) {
        if (st1 == st2) {
            System.out.println("Students is equals.");
        } else {
            System.out.println("Students is different.");
        }
    }

    static void eq2(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.surname.equals(st2.surname)) {
                if (st1.numberTicket == st2.numberTicket) {
                    if (st1.course == st2.course) {
                        if (st1.avgMath == st2.avgMath) {
                            if (st1.avgEconomics == st2.avgEconomics) {
                                if (st1.avgForeignLang == st2.avgForeignLang) {
                                    System.out.println("Students is equals.");
                                } else
                                    System.out.println("Different avgForeignLang.");
                            } else
                                System.out.println("Different avgEconomic.");
                        } else
                            System.out.println("Different avgMath.");
                    } else
                        System.out.println("Different course.");
                } else
                    System.out.println("Different numberTicket.");
            } else System.out.println("Different surname.");
        } else System.out.println("Different name.");
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


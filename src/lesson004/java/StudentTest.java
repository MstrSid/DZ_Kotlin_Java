package lesson004.java;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Mike", "Luis", 4055, 2010, 8.7, 7.9, 6.5);
        Student student2 = new Student("Nina", "Miss", 4177, 2009, 7.8, 6.5, 7.8);
        Student student3 = new Student("Leon", "Smith", 1452, 2010, 6.6, 7.9, 6.4);
        student1.showAvg();
        student2.showAvg();
        student3.showAvg();
    }
}

class Student{
    private final int numberTicket;
    private final String name;
    private final String surname;
    private final int yearStudy;
    private final double avgMath;
    private final double avgEconomics;
    private final double avgForeignLang;

    public Student(String name, String surname, int numberTicket, int yearStudy, double avgMath, double avgEconomics, double avgForeignLang) {
        this.numberTicket = numberTicket;
        this.name = name;
        this.surname = surname;
        this.yearStudy = yearStudy;
        this.avgMath = avgMath;
        this.avgEconomics = avgEconomics;
        this.avgForeignLang = avgForeignLang;
    }

    void showAvg(){
        double avg = (avgEconomics+avgForeignLang+avgMath)/3;
        System.out.println("Average grade for "+numberTicket+": "+name+" "+surname+" is "+String.format("%.2f",avg));
    }
}


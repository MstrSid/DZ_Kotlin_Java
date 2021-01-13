package lesson012.kotlin

fun main(args: Array<String>) {
    val student1 = Student("Mike", "Luis", 4055, 2, 8.7, 7.9, 6.5)
    val student2 = Student("Nick", "Smith", 5466, 3, 7.7, 7.8, 6.6)
    val student3 = Student("Mike", "Luis", 4055, 2, 8.7, 7.9, 6.5)
    IfCompare.eq1(student1, student2)
    IfCompare.eq2(student1, student2)
    println("-------------------------------------")
    IfCompare.eq1(student1, student3)
    IfCompare.eq2(student1, student3)
}

class Student() {
    var numberTicket = 0
    var name = "NoName"
    var surname = "NoName"
    var course = 1
    var avgMath = 0.0
    var avgEconomics = 0.0
    var avgForeignLang = 0.0

    constructor(name: String,
                surname: String,
                numberTicket: Int,
                course: Int) : this() {
        this.numberTicket = numberTicket
        this.name = name
        this.surname = surname
        this.course = course
    }

    constructor(name: String,
                surname: String,
                numberTicket: Int,
                course: Int,
                avgMath: Double,
                avgEconomics: Double,
                avgForeignLang: Double) : this(name, surname, numberTicket, course) {
        this.avgMath = avgMath
        this.avgEconomics = avgEconomics
        this.avgForeignLang = avgForeignLang
    }
}

object IfCompare{
        fun eq1(st1: Student, st2: Student){
            if(st1 === st2){
                println("Students is equals.")
            } else println("Students is different.")
        }

        fun eq2(st1: Student, st2: Student){
            if (st1.name == st2.name) {
                if (st1.surname == st2.surname) {
                    if (st1.numberTicket == st2.numberTicket) {
                        if (st1.course == st2.course) {
                            if (st1.avgMath == st2.avgMath) {
                                if (st1.avgEconomics == st2.avgEconomics) {
                                    if (st1.avgForeignLang == st2.avgForeignLang) {
                                        println("Students is equals.")
                                    } else println("Different avgForeignLang.")
                                } else println("Different avgEconomic.")
                            } else println("Different avgMath.")
                        } else println("Different course.")
                    } else println("Different numberTicket.")
                } else println("Different surname.")
            } else println("Different name.")
        }
}
package lesson006.kotlin

fun main(args: Array<String>) {
    val student1 = Student("Mike", "Luis", 4055, 2, 8.7, 7.9, 6.5)
    val student2 = Student("Nina", "Miss", 4177, 3)
    val student3 = Student()
    fun showAvg(student: Student) =
            println({
                val avg = (student.avgMath + student.avgEconomics + student.avgForeignLang) / 3
                "Average grade for ${student.numberTicket} ${student.name} ${student.surname} is ${String.format(
                        "%.2f",
                        avg
                )}."
            }())
    showAvg(student1)
    showAvg(student2)
    showAvg(student3)
}

internal class Student() {
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
                course: Int)
            : this() {
        this.numberTicket = numberTicket
        this.name = name
        this.surname = surname
        this.course = course
    }

    constructor(
            name: String,
            surname: String,
            numberTicket: Int,
            course: Int,
            avgMath: Double,
            avgEconomics: Double,
            avgForeignLang: Double)
            : this(name,
            surname,
            numberTicket,
            course) {
        this.avgMath = avgMath
        this.avgEconomics = avgEconomics
        this.avgForeignLang = avgForeignLang
    }
}

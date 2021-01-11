package lesson005.kotlin

fun main(args: Array<String>) {
    val student1 = Student("Mike", "Luis", 4055, 2010, 8.7, 7.9, 6.5)
    val student2 = Student("Nina", "Miss", 4177, 2009, 7.8, 6.5, 7.8)
    val student3 = Student("Leon", "Smith", 1452, 2010, 6.6, 7.9, 6.4)
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


open class Student(
    var name: String,
    var surname: String,
    var numberTicket: Int,
    var yearStudy: Int,
    var avgMath: Double,
    var avgEconomics: Double,
    var avgForeignLang: Double
)

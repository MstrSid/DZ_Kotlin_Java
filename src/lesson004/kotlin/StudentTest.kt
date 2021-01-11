package lesson004.kotlin

fun main(args: Array<String>) {
    val show = StudentTest()
    show.show()
}

class StudentTest {
    private var my: String = "String"
    fun show() {
        var student1 = Student("Mike", "Luis", 4055, 2010, 8.7, 7.9, 6.5)
        var student2 = Student("Nina", "Miss", 4177, 2009, 7.8, 6.5, 7.8)
        var student3 = Student("Leon", "Smith", 1452, 2010, 6.6, 7.9, 6.4)
        student1.showAvg()
        student2.showAvg()
        student3.showAvg()
    }

    class Student(
        var name: String,
        var surname: String,
        var numberTicket: Int,
        var yearStudy: Int,
        var avgMath: Double,
        var avgEconomics: Double,
        var avgForeignLang: Double
    ) {
        fun showAvg() =
            println({
                val avg = (avgMath + avgEconomics + avgForeignLang) / 3
                "Average grade for $numberTicket $name $surname is ${String.format("%.2f", avg)}."
            }())
    }
}
package lesson013.kotlin

fun main(args: Array<String>) {
    println(showDaysInMonth(1))
    println(showDaysInMonth(2))
    println(showDaysInMonth(3))
    println(showDaysInMonth(15))
}

fun showDaysInMonth(month: Int): Int{
    when(month){
        1, 3, 5,7, 8,10,12-> return 31
        2 -> return 28
        4,6,9 -> return 30
    }
    return 0
}
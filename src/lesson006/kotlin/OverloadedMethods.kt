package lesson006.kotlin

fun main(args: Array<String>) {
    val over = Overloaded()
    println(over.sumNumbers())
    println(over.sumNumbers(1))
    println(over.sumNumbers(1,2))
    println(over.sumNumbers(1,2,3))
    println(over.sumNumbers(1,2,3,4))
}

class Overloaded() {
    fun sumNumbers() = 0
    fun sumNumbers(arg1: Int) = arg1
    fun sumNumbers(arg1: Int, arg2: Int) = arg1 + arg2
    fun sumNumbers(arg1: Int, arg2: Int, arg3: Int) = arg1 + arg2 + arg3
    fun sumNumbers(arg1: Int, arg2: Int, arg3: Int, arg4: Int) = arg1 + arg2 + arg3 + arg4
}
package lesson008.kotlin

fun main(args: Array<String>) {
    One.divider(2, 3)
    One.multi(1, 2, 3)
    val one = One()
    println("Round square: ${one.roundSquare(4.5)}")
    println("Round length: ${One.roundLength(4.5)}")
    one.showAll(4.5)
}

class One {
    companion object {
        val PI = 3.14
        fun multi(arg1: Int, arg2: Int, arg3: Int)= arg1 * arg2 * arg3
        fun divider(arg1: Int, arg2: Int) =
            println("Input $arg1, $arg2 - quotient of division: ${arg1 / arg2}, remainder: ${arg1 % arg2}")

        fun roundLength(r: Double)=2*PI*r
    }

    fun roundSquare(r: Double) = PI*r*r

    fun showAll(r: Double) = println("Radius: $r " +
            "\nRound square: ${roundSquare(r)} " +
            "\nRound length: ${roundLength(r)}")
}
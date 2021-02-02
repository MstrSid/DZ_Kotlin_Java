package lesson017.kotlin

fun main(args: Array<String>) {
    println(EqualSBInner.checkEqual(StringBuilder("Hello"), StringBuilder("Hello")))
}

class EqualSBInner{
    companion object{
        fun checkEqual(sb1: StringBuilder, sb2: StringBuilder) = sb1.toString() == sb2.toString()
    }
}
package lesson010.kotlin.p4
import lesson010.kotlin.p1.A
import lesson010.kotlin.p1.p2.B
import lesson010.kotlin.p1.p2.p3.C
import lesson010.kotlin.p4.p5.E

fun main(args: Array<String>) {
    val d = D()
    d.showAll()
}

class D {
    var dInt = 4
    var dString = "Class D"

    fun D() {}

    fun D(dInt: Int, dString: String) {
        this.dInt = dInt
        this.dString = dString
    }

    fun showAll(){
        val a = A()
        val c = C()
        val e = E()
        println("${a.aString} \n${a.aInt} \n------------------------")
        println("${B.bString} \n${B.bInt} \n------------------------")
        println("${c.cString} \n${c.cInt} \n------------------------")
        println("${e.eString} \n${e.eInt} \n------------------------")
    }
}
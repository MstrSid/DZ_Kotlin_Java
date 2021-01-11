package lesson005.kotlin

import java.text.NumberFormat
import java.util.*

private val FORMAT_US: NumberFormat = NumberFormat.getCurrencyInstance(Locale.US)

fun main(args: Array<String>) {
    val employee1 = Employee(1, "Mike", 35, 1500.00, "IT")
    val employee2 = Employee(2, "Ann", 34, 1500.00, "IT")
    println("${employee1.name} salary is ${FORMAT_US.format(employee1.salary)}.")
    println("${employee2.name} salary is ${FORMAT_US.format(employee2.salary)}.")
    println("After x2 salary ${employee1.name} is ${FORMAT_US.format(employee1.doubleSalary())}")
    println("After x2 salary ${employee2.name} is ${FORMAT_US.format(employee2.doubleSalary())}")
}

class Employee(
    var id: Int,
    var name: String,
    var age: Int,
    var salary: Double,
    var department: String
){
    fun doubleSalary():Double{
        salary *= 2
        return salary
    }
}
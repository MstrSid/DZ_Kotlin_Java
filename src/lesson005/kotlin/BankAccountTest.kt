package lesson005.kotlin

import java.text.NumberFormat
import java.util.*
private val FORMAT_US: NumberFormat = NumberFormat.getCurrencyInstance(Locale.US)


fun main(args: Array<String>) {
    val account = BankAccount(154, "Mike", 1500.00)
    println("Hello, ${account.name}. You id is ${account.id}. You balance is ${FORMAT_US.format(account.balance)}.")
    account.cashIn(150.00)
    account.cashOut(1500.00)
    account.cashOut(5000.00)

}

class BankAccount(
    var id: Int,
    var name: String,
    var balance: Double
){
    fun cashIn(cashSum: Double) = if(cashSum>0.0){
        balance+=cashSum
        println("Cash in successful. Now is ${FORMAT_US.format(balance)}")
    } else println("Incorrect cash value.")

    fun cashOut(cashSum: Double) = if (cashSum <= balance) {
        balance -= cashSum
        println("Cash out successful. Now is ${FORMAT_US.format(balance)}")
    } else println("You enter sum more than you balance. Now is ${FORMAT_US.format(balance)}")
}

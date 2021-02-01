package lesson016.kotlin

fun main(args: Array<String>) {
    Sender.email("a@tut.by;b@yahoo.com;")
}

class Sender {
    companion object {
        fun email(mail: String) {
            var start: Int
            var end: Int
            var comma = 0
            while (comma<mail.length-1){ //starts comma index from 0, nex indexes comma find in body cycle
                start = mail.indexOf('@', comma) //for @ find index, starts from comma index
                end = mail.indexOf('.', comma) //for . find index, starts from comma index
                comma = mail.indexOf(';', comma) + 1 //for next comma find index, starts from this comma index + 1
                println(mail.substring(start+1, end))
            }
        }
    }
}
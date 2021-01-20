package lesson014.kotlin

fun main(args: Array<String>) {
    ShowTime.showTime()
}

class ShowTime {
    companion object {
        fun showTime() {
            OUTER@ for (h in 0..5) {
                for (m in 0..59) {
                    if (h > 1 && m % 10 == 0 && m > 0) {
                        break@OUTER
                    }
                    for (s in 0..59) {
                        if (s * h > m) {
                            continue
                        }
                        if (m < 10 && s < 10) {
                            println("$h:0$m:0$s")
                        } else if (m < 10) {
                            println("0$h:0$m:$s")
                        } else if (s < 10) {
                            println("0$h:$m:0$s")
                        } else println("0$h:$m:$s")
                    }
                }
            }

        }
    }
}
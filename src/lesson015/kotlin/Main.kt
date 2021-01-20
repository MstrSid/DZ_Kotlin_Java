package lesson015.kotlin

fun main(args: Array<String>) {
    ShowTime.showTime()
}

class ShowTime(){
    companion object {
        fun showTime() {
            var h = 0
            var m = 0
            var s: Int
            OUTER@ while (h < 6) {
                do {
                    if (h > 1 && m % 10 == 0 && m > 0) {
                        break@OUTER
                    }
                    s = 0
                    while (s < 60) {
                        if (s * h <= m) {
                            if (m < 10 && s < 10) {
                                println("0$h:0$m:0$s")
                            } else if (m < 10) {
                                println("0$h:0$m:$s")
                            } else if (s < 10) {
                                println("0$h:$m:0$s")
                            } else println("0$h:$m:$s")
                            s++
                        } else break
                    }
                    m++
                } while (m < 60)
                h++
                m = 0
            }
        }
    }
}
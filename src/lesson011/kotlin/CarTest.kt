package lesson011.kotlin

fun main(args: Array<String>) {
    val car1 = Car(4, "red", "V8")
    val car2 = Car(3, "blue", "V4")
    val car3 = Car(5, "green", "V6")

    fun showInfo(car: Car) {
        println("Car doors: ${car.doors}, color: ${car.color}, engine: ${car.engine};")
    }

    fun changeDoors(car: Car, doors: Int){
        car.doors = doors
    }

    fun swapColor(car1: Car, car2: Car){
        val colorTemp = car1.color
        car1.color = car2.color
        car2.color = colorTemp
    }

    showInfo(car1)
    showInfo(car2)
    showInfo(car3)
    println("-------------------------------------")
    changeDoors(car1, 5)
    swapColor(car2, car3)
    showInfo(car1)
    showInfo(car2)
    showInfo(car3)

}

class Car(){
    var doors = 4
    var color = "white"
    var engine = "v4"

    constructor(doors: Int, color: String, engine: String): this(){
        this.doors = doors
        this.color = color
        this.engine = engine
    }
}
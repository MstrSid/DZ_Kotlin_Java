package lesson011.java;

public class CarTest {

    public static void main(String[] args) {
        Car car1 = new Car(4, "red", "v8");
        Car car2 = new Car(3, "blue", "v4");
        Car car3 = new Car(5, "green", "v6");

        showInfo(car1);
        showInfo(car2);
        showInfo(car3);
        System.out.println("-------------------------------------------");
        changeDoors(car1, 2);
        swapColors(car2, car3);
        System.out.println("-------------------------------------------");
        showInfo(car1);
        showInfo(car2);
        showInfo(car3);
    }

    static void showInfo(Car car){
        System.out.println("Car: doors: "+car.doors+", color: "+car.color+", engine: "+car.engine+";");
    }


    static void changeDoors(Car car, int doors){
        System.out.println("Before doors: "+car.doors);
        car.doors = doors;
        System.out.println("Now doors: "+car.doors);
    }

    static void swapColors(Car car1, Car car2){
        String colorTemp = car1.color;
        car1.color = car2.color;
        car2.color = colorTemp;
    }
}

class Car{
    public int doors;
    public String color;
    public String engine;

    public Car(){}

    public Car(int doors, String color, String engine) {
        this.doors = doors;
        this.color = color;
        this.engine = engine;
    }
}

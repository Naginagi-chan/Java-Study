class Car {
    String color;
    String gearType;
    int door;

    Car() {
        this("white", "auto", 4);
    }

    Car(String color) {
        this(color, "auto", 4);
    }

    Car(int door) {
        this("white", "auto", door);
    }

    Car(Car c)
    {
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

class CarTest2 {
    void main() {
        Car c1 = new Car();
        Car c2 = new Car("blue");
        Car c3 = new Car(200);
        Car c4 = new Car(c1);

        System.out.println("c1 의 color = " + c1.color + " gearType = " +
                c1.gearType + " door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + " gearType = " +
                c2.gearType + " door = " + c2.door);
        System.out.println("c3의 color = " + c3.color + " gearType = " +
                c3.gearType + " door = " + c3.door);
        c1.color = "black";
        System.out.println("c1.color = black 수행 후");
        System.out.println("c4의 color = " + c4.color + " gearType = " +
                c4.gearType + " door = " + c4.door);

    }
}
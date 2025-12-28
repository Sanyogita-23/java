package constructorExample;
//Calling One constructor from another using this()

class Car {
    String model;
    int year;

    Car() {
        this("Unknown", 0);
    }

    Car(String m, int y) {
        model = m;
        year = y;
    }

    public static void main(String[] args) {
        Car c = new Car();
        Car c1 = new Car("C123",2021); 
        System.out.println(c.model + "  " + c.year);
        System.out.println(c1.model + "  " + c1.year);
    }
}

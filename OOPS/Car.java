class Vehicle1 {
    int wheelCount;
    String model;

    public void start1() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle1 {
    @Override
    public void start1() {
        System.out.println("Car is Starting");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start1();
    }
}

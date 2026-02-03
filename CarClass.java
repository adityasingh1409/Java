class Car {
    String brand;
    int speed;

    void accelerate() {
        if (speed > 40) {
            System.out.println(brand + " is accelerating at speed " + speed);
        }
    }

    void display() {
        System.out.println("Car brand: " + brand);
        System.out.println("Car speed: " + speed);
    }
}
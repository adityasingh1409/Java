package inheritance;
class vehicle{
    int speed;

     vehicle(int speed) {
        this.speed = speed;
    }


    void move(){
        System.out.println("this vehicle is moving with speed"+speed);
    }
}
class Car extends vehicle{
    String Brand ;
    Car(String Brand,int speed){
        super(speed);
        this.Brand = Brand;
    }
    @Override
    void move(){
        System.out.println("the car of brand" + Brand + " is moving with speed" + speed);
    }
    void drive(){
        System.out.println("The car of brand "+ Brand +" is going...");
    }
}

public class VehicleCompany {
    public static void main(String[] args){
    Car car = new Car(" BMW",70);

    car.drive();
    car.move();

    }
}

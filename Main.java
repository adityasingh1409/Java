// import collections.MyList;

public class Main {
    public static void main(String[] args) {


        // MyList list = new MyList();

        // int[] input = {1,1,3,3,4,4,7,7,7,9,9,9,9};

        // for (int n : input) {
        //     list.addListElement(n);
        // }

        // MyList unique = list.removeDuplicates();
        // unique.display();
//        CarClass car = new CarClass();
//        car.brand="bmw";
//        car.sppeed=65;
//        CarClass car2 = new CarClass();
//        car2.brand="alto";
//        car2.sppeed=76;
//         car1.display();
//        car1.accelerate();
//
//        car2.display();
//        car2.accelerate();
        HotelRoom r1 = new HotelRoom();
        r1.roomNo = 101;

        HotelRoom r2 = new HotelRoom();
        r2.roomNo = 102;

        r1.bookRoom();

        System.out.println(r1.roomNo + " booked: " + r1.isBooked);
        System.out.println(r2.roomNo + " booked: " + r2.isBooked);
    }
}

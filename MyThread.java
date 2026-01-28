public class MyThread extends Thread {

    private String work;

    public MyThread(String work) {
        this.work = work;
    }

    void printHello() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
        }
    }

    void printNumber() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    void printName() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Aditya");
        }
    }

    @Override
    public void run() {
        if (work.equals("hello")) {
            printHello();
        } else if (work.equals("number")) {
            printNumber();
        } else if (work.equals("name")) {
            printName();
        }
    }
}

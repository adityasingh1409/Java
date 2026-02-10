class MyTask implements Runnable {

    public void run() {
        System.out.println("Runnable thread running");
    }
}

public class Thread {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyTask());
        t1.start();
    }
}

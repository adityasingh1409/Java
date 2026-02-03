class Employee1 {
    int id;
    String name;

    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee1 {
    void manage() {
        System.out.println("Manager is managing");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.id = 101;
        m.name = "Amit";
        m.work();    // inherited
        m.manage();  // own
    }
}

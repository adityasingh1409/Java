public class User {

    int id;
    String name;

    User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // method to be overridden
    void interact() {
        System.out.println("User is interacting");
    }

    // -------- STUDENT --------
    static class Student extends User {

        Student(int id, String name) {
            super(id, name);
        }

        @Override
        void interact() {
            System.out.println("Student " + name + " is attending class");
        }
    }

    // -------- TEACHER --------
    static class Teacher extends User {

        Teacher(int id, String name) {
            super(id, name);
        }

        @Override
        void interact() {
            System.out.println("Teacher " + name + " is teaching");
        }
    }

    // -------- MAIN --------
    public static void main(String[] args) {

        User user1 = new Student(1, "Aditya");
        User user2 = new Teacher(2, "Rahul");

        user1.interact();
        user2.interact();
    }
}

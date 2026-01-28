import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        int numberOfStudents;

        System.out.print("Enter number of students: ");
        numberOfStudents = scanner.nextInt();

        if (numberOfStudents > 0 && numberOfStudents <= 100) {

            Student[] studentArray = new Student[numberOfStudents];

            for (int i = 0; i < numberOfStudents; i++) {
                System.out.println("Enter student id:");
                int id = scanner.nextInt();

                scanner.nextLine(); // consume leftover newline

                System.out.println("Enter student name:");
                String name = scanner.nextLine();

                studentArray[i] = new Student(id, name);
            }

            // Display students
            System.out.println("\nStudent Details:");
            for (Student s : studentArray) {
                System.out.println(s);
            }

        } else {
            System.out.println("Invalid number of students");
        }

        scanner.close();*/
        MyThread t1 = new MyThread("hello");
        MyThread t2 = new MyThread("number");
        MyThread t3 = new MyThread("name");

        t1.start();
        t2.start();
        t3.start();
    }
}

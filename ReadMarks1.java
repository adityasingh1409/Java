import java.io.File;
import java.util.Scanner;

public class ReadMarks1 {
    public static void main(String[] args) {

        try {
            File file = new File("marks.txt");
            Scanner sc = new Scanner(file);

            int sum = 0;
            int count = 0;

            while (sc.hasNextLine()) {
                int mark = Integer.parseInt(sc.nextLine());
                sum += mark;
                count++;
            }

            double average = (double) sum / count;

            System.out.println("Total Marks = " + sum);
            System.out.println("Average = " + average);

            sc.close();

        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }
}

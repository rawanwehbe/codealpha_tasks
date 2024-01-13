import java.util.ArrayList;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter name for student " + (i + 1) + ":");
            String name = scanner.next();
            System.out.println("Enter grade for student " + (i + 1) + ":");
            double grade = scanner.nextDouble();
            students.add(new Student(name, grade));
        }

        System.out.println("Average grade: " + GradeCalculatorHelper.average(students));
        System.out.println("Highest grade: " + GradeCalculatorHelper.highest(students));
        System.out.println("Lowest grade: " + GradeCalculatorHelper.lowest(students));

        scanner.close();
    }
}

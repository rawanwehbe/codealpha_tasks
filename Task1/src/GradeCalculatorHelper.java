import java.util.ArrayList;

public class GradeCalculatorHelper {
    public static double sum(ArrayList<Student> students) {
        double sum = 0;
        for (Student student : students) {
            sum += student.getGrade();
        }
        return sum;
    }

    public static double average(ArrayList<Student> students) {
        double sum = sum(students);
        return sum / students.size();
    }

    public static double highest(ArrayList<Student> students) {
        return students.stream().mapToDouble(Student::getGrade).max().orElse(0);
    }

    public static double lowest(ArrayList<Student> students) {
        return students.stream().mapToDouble(Student::getGrade).min().orElse(0);
    }
}

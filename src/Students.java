import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> allStudents = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            String[] input = scanner.nextLine().split(" ");
            Student onePerson = new Student(input[0], input[1], Double.parseDouble(input[2]));
            allStudents.add(onePerson);
        }
      allStudents.stream()
              .sorted((s1,s2) -> Double.compare(s2.getGrade(),s1.getGrade()))
              .forEach(student -> System.out.println(student.toString()));
    }
    static class Student{
        String firstName;
        String lastName;
        double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public double getGrade() {
            return grade;
        }

        public void setGrade(double grade) {
            this.grade = grade;
        }
        public String toString(){
           return String.format("%s %s: %.2f", getFirstName(),getLastName(), getGrade());
        }
    }
}

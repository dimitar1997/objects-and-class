import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class opinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<personClass> allPersons = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            personClass nameAge = new personClass(name, age);
            allPersons.add(nameAge);

        }
        allPersons.stream()
                .filter(personClass -> personClass.getAge() > 30)
                .sorted((p1,p2) ->p1.getName().compareTo(p2.getName()))
                .forEach(personClass -> System.out.println(personClass.toString()));


    }
    static class personClass{
        String name;
        int age;

        public personClass(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public String toString(){
            return String.format("%s - %d", getName(), getAge());
        }
    }
}

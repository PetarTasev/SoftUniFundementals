package classesAndObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class opinionPoll {

    static class Person {
        String name;
        int age;

        Person (String name, int age) {
            this.name = name;
            this.age = age;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        List<String> goodPeople = new ArrayList <String> ();

        for (int n = 0; n < numberOfPeople; n++) {
            String personLine = scanner.nextLine();
            String[] personalInfo = personLine.split(" ");
            Person person = new Person (personalInfo[0], Integer.parseInt(personalInfo[1]));

            if (person.age > 30) {
                goodPeople.add(person.name + " - " + String.valueOf(person.age));
            }
        }
        goodPeople.stream().sorted().forEach(System.out::println);
    }
}

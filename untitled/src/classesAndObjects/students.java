package classesAndObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class students {

    static class Student {
        String first;
        String second;
        int age;
        String city;

        Student (String line) {
            String[] info = line.split(" ");
            this.first = info[0];
            this.second = info[1];
            this.age = Integer.parseInt(info[2]);
            this.city = info[3];
        }

        String getCity() {
            return this.city;
        }
        String getFirst() {
            return this.first;
        }
        String getSecond() {
            return this.second;
        }
        int getAge() {
            return this.age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<Student> list = new ArrayList<Student>();

        while(!line.equals("end")) {
            list.add( new Student(line));
            line = scanner.nextLine();
        }
        String city = scanner.nextLine();


        for (int n = 0; n < list.size(); n++) {
          for (int a = 0; a < list.size(); a++) {
              if (list.get(n).getFirst().equals(list.get(a).getFirst()) && list.get(n).getSecond().equals(list.get(a).getSecond()) && n != a) {
                  list.remove(n);
              }
          }
        }

        for (int n = 0; n < list.size(); n++) {
            if (city.equals(list.get(n).getCity())) {
                System.out.printf("%s %s is %s years old\n", list.get(n).getFirst(), list.get(n).getSecond(), list.get(n).getAge());
            }
        }
    }
}

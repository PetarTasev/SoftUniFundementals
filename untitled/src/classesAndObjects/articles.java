package classesAndObjects;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class articles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String phrase = scanner.nextLine();
        List<String> list = Arrays.stream(phrase.split(" ")).collect(Collectors.toList());

        Random random = new Random();
        int length = list.size();
        for (int n = 0; n < length; n++) {
            int randomPhrase = random.nextInt(list.size());
            System.out.println(list.get(randomPhrase));
            list.remove(randomPhrase);
        }
    }
}

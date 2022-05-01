package methodsExercises;

import java.util.Scanner;

public class countSomething {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vowels = new String[] {"A", "E", "I", "O", "U", "a" ,"e" ,"i" ,"o" ,"u"};
        String word = scanner.nextLine();

        System.out.println(vowelsCounter(word, vowels));
    }
    static int vowelsCounter (String word, String[] allVowels) {
        int total = 0;
        for (int n = 0; n < word.length(); n++) {
            for (int s = 0; s < allVowels.length; s++) {
                if ( String.valueOf(word.charAt(n)).equals(allVowels[s])) {
                    total++;
                }
            }
        }
        return total;
    }
}
//    contains()
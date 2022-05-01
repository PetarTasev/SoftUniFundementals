package lists;

import java.util.*;

public class fruitBasket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        List<String> fruit = new ArrayList<String>();

        for (int n = 0; n < length; n++) {
            String solo = scanner.nextLine();
            fruit.add(solo);

        }
        Collections.sort(fruit);

        for (int n = 0; n < length; n++) {
            System.out.printf("%s.%s\n", n + 1, fruit.get(n));
        }
    }
}

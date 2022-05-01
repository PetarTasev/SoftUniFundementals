package arrays;

import java.util.Scanner;

public class equalArrays {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String arrayOne = scanner.nextLine();
      String arrayTwo = scanner.nextLine();
      String [] One = arrayOne.split(" ");
      String [] Two= arrayTwo.split(" ");
      int sum = 0;
      boolean fax = true;
      int duff = 0;
      for (int n = 0; n < One.length; n++) {
          if (One[n].equals(Two[n])) {
              sum += Integer.parseInt(One[n]);
          } else {
             fax = false;
             duff = n;
             break;
          }
      }
      if (fax) {
          System.out.printf("Arrays are identical. Sum: %s", sum);
      } else {
          System.out.printf("Arrays are not identical. Found difference at %s index.", duff);
      }
    }
}

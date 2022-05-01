package arrays;

import java.util.Scanner;

public class condenseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String [] nums = line.split(" ");
        String [] newNum = new String[nums.length - 1];

        while (!(newNum.length == 0)) {
            for (int n = 0; n <= nums.length - 2; n++) {
                int n1 = Integer.parseInt(nums[n]);
                int yaiks = n + 1;
                int n2 = Integer.parseInt(nums[yaiks]);
                int newOne = n1 + n2;

                newNum[n] = String.valueOf(newOne);
            }
            nums = new String[newNum.length];
            for (int b = 0; b <= nums.length - 1; b++) {
                nums[b] = newNum[b];
            }
            newNum = new String[nums.length - 1];
        }
        System.out.println(nums[0]);
    }
}

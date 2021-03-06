package methodsExercises;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class arrayManiplaation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] stringArray = line.split(" ");
        int [] array = StringToIntConverter(stringArray);
        String word = scanner.nextLine();
        while (!word.equals("end")) {
            String[] command = word.split(" ");
            switch (command[0]) {
                case "exchange" :
                    exchange(array, Integer.parseInt(command[1]));
                    break;
                case "max" :
                    evenOrOddMaxElement(array, command[1]);
                    break;
                case "min" :
                    evenOrOddMinElement(array, command[1]);
                    break;
                case "first" :
                    firstEvenOrOdd(array, command[2], Integer.parseInt(command[1]));
                    break;
                case "last" :
                    lastEvenOrOdd(array, command[2], Integer.parseInt(command[1]));
                    break;
            }
            word = scanner.nextLine();
        }

        System.out.print("[");
        for (int n = 0; n < array.length; n++) {
            if (n == array.length - 1) {
                System.out.print(array[n]);
            } else {
                System.out.print(array[n] + ", ");
            }
        }
        System.out.print("]");
//----------------------------------------------------------------------------------------------------------------------
    }
//--------------------------------------------------works---------------------------------------------------------------
    static int[] StringToIntConverter (String[] array) {
        int [] temporary = new int[array.length];
        for (int n = 0; n < array.length; n++) {
            temporary[n] = Integer.parseInt(array[n]);
        }
        return temporary;
    }
//--------------------------------------------------works---------------------------------------------------------------
// -------------------------------------------------works---------------------------------------------------------------
    static int [] exchange (int[] array, int index) {
//        int[] dupe = new int[array.length];
//        for (int n = 0; n < array.length; n++) {
//            dupe[n] = array[n];
//        }
//        if (index > array.length - 1 | index < 0) {
//            System.out.println("Invalid index");
//            return array;
//        } else {
//            for (int n = 0; n < array.length; n++) {
//                if (n + index + 1 <= array.length ) {
//                    array[n] = dupe[n + index + 1];
//                } else {
//                    for (int b = 0; b < n; b++) {
//                        if (n > index) {
//                            array[b] = dupe[n - index];
//                        } else {
//                            array[b] = dupe[index - n];
//                        }
//
//                    }
//
//                }
//            }
//        }
//        return array;
        if (!(index <= array.length - 1 &&  index >= 0)){
            System.out.println("Invalid index");
            return array;
        }
        int[] one = new int[index + 1] ;
        int[] two = new int[array.length - (index + 1)] ;
        for (int n = index + 1; n < array.length; n++) {
            two[n - (index + 1)] = array[n];
        }
        for (int n = 0; n < index + 1; n++) {
            one[n] = array[n];
        }
        for (int n = 0; n < two.length; n++) {
            array[n] = two[n];
        }
        for (int n = two.length; n < two.length + one.length; n++) {
            array[n] = one[n - two.length];
        }
        return array;
    }
//-------------------------------------------------------works----------------------------------------------------------


    static void evenOrOddMaxElement (int[] array, String evenOrOdd) {
        int max = -999999;
        int maxIndex = 0;
        if (evenOrOdd.equals("even")) {
            for (int n = 0; n < array.length; n++) {
                if (array[n] % 2 == 0) {
                    if (array[n] > max) {
                        max = array[n];
                        maxIndex = n;
                    }
                    if (array[n] == max && n < maxIndex) {
                        maxIndex = n;
                    }
                }
            }
        } else {
            for (int n = 0; n < array.length; n++) {
                if (array[n] % 2 == 1) {
                    if (array[n] > max) {
                        max = array[n];
                        maxIndex = n;
                    }
                    if (array[n] == max && n > maxIndex) {
                        maxIndex = n;
                    }
                }
            }
        }
        if (max ==  -999999) {
            System.out.println("No matches");
        } else {
            System.out.println(maxIndex);;
        }
    }

    static void evenOrOddMinElement (int[] array, String evenOrOdd) {
        int max = 999999;
        int maxIndex = 0;
        if (evenOrOdd.equals("even")) {
            for (int n = 0; n < array.length; n++) {
                if (array[n] % 2 == 0) {
                    if (array[n] < max) {
                        max = array[n];
                        maxIndex = n;
                    }
                    if (array[n] == max && n > maxIndex) {
                        maxIndex = n;
                    }
                }
            }
        } else {
            for (int n = 0; n < array.length; n++) {
                if (array[n] % 2 == 1) {
                    if (array[n] < max) {
                        max = array[n];
                        maxIndex = n;
                    }
                    if (array[n] == max && n > maxIndex) {
                        maxIndex = n;
                    }
                }
            }

        }
        if (max ==  999999) {
            System.out.println("No matches");
        } else {
            System.out.println(maxIndex);;
        }
        return;
    }

    static void firstEvenOrOdd (int[] array, String evenOrOdd, int count) {
        if (count > array.length) {
            System.out.println("Invalid count");
            return;
        }
        int times = 0;
        if (evenOrOdd.equals("even")) {
            System.out.print("[");
            for (int n = 0; n < array.length; n++) {
                if (times >= count) {
                    System.out.println("]");
                    return;
                }
                if (array[n] % 2 == 0 || n == array.length - 1) {
                    times++;
                    times++;
                    if (times == 1) {
                        System.out.print(array[n]);
                    } else {
                        System.out.print(", " + array[n]);
                    }
                }
            }
                System.out.println("]");
        } else {
            System.out.print("[");
            for (int n = 0; n < array.length; n++) {
                if (times >= count) {
                    System.out.println("]");
                    return;
                }
                if (array[n] % 2 == 1) {
                    times++;
                    if (times == 1) {
                        System.out.print(array[n]);
                    } else {
                        System.out.print(", " + array[n]);
                    }
                }
            }
                System.out.println("]");
        }
    }

    public static void lastEvenOrOdd (int[] array, String evenOrOdd, int count) {
        if (count > array.length) {
            System.out.println("Invalid count");
            return;
        }
        int times = 0;
        if (evenOrOdd.equals("even")) {
            System.out.print("[");
            for (int n = array.length - 1; n >= 0; n--) {
                if (times >= count) {
                    System.out.println("]");
                    return;
                }
                if (array[n] % 2 == 0) {
                    times++;
                    if (times == 1) {
                        System.out.print(array[n]);
                    } else {
                        System.out.print(", " + array[n]);
                    }
                }
            }
            System.out.println("]");
        } else {
            System.out.print("[");
            for (int n = array.length - 1; n >= 0; n--) {
                if (times >= count) {
                    System.out.println("]");
                    return;
                }
                if (array[n] % 2 == 1) {
                    times++;
                    if (times == 1) {
                        System.out.print(array[n]);
                    } else {
                        System.out.print(", " + array[n]);
                    }
                }
            }
            System.out.println("]");
        }
    }
}

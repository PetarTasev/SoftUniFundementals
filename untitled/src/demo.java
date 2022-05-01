import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {

        int a = 10;
        double b = 5.5;
        a += b;
        System.out.println(a);

        boolean one = 5 > 'a';
        System.out.println(" one"  +one);
        boolean two = 100f == 100d;
        System.out.println(" two"  +two);
        boolean tree = "string".equals("String");
        System.out.println(" three"  +tree);
        boolean four = 100f != 100d;
        System.out.println(" 4"  +four);
    }
}
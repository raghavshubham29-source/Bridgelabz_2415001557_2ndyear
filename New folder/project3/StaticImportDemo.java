// File: StaticImportDemo.java
import static java.lang.Math.*;  // static import of all static members of Math class

public class StaticImportDemo {
    public static void main(String[] args) {
        double a = 9.0, b = -4.5, c = 2.0;

        System.out.println("Square root of " + a + " = " + sqrt(a));
        System.out.println(a + " raised to " + c + " = " + pow(a, c));
        System.out.println("Maximum of " + a + " and " + b + " = " + max(a, b));
        System.out.println("Minimum of " + a + " and " + b + " = " + min(a, b));
        System.out.println("Absolute value of " + b + " = " + abs(b));
    }
}

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        n = Math.abs(n) / 10;   // remove last digit
        int secondLast = n % 10;
        System.out.println(secondLast);
    }
}

class Printer {
    void print(String msg) { System.out.println("Printing: " + msg); }
}

class ColorPrinter extends Printer {
    @Override
    void print(String msg) { System.out.println("Printing in color: " + msg); }
}

public class OverloadingVsOverriding {
    public static void main(String[] args) {
        Printer p = new ColorPrinter();
        p.print("Hello"); // Calls overridden version
    }
}

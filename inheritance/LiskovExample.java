class Bird {
    void fly() { System.out.println("Flying in the sky"); }
}

class Sparrow extends Bird {
    @Override
    void fly() { System.out.println("Sparrow flying low"); }
}


class Penguin extends Bird {
    @Override
    void fly() { throw new UnsupportedOperationException("Penguins can’t fly!"); }
}

public class LiskovExample {
    public static void main(String[] args) {
        Bird b1 = new Sparrow();
        b1.fly();  // Works fine

        Bird b2 = new Penguin();
    }
}

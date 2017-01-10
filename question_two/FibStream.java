public class FibStream {
    public static int fib = 1;
    public static int previous = 0;

    public static int getNext() {
        if (fib == 1 && previous == 0) {
            previous = fib;
            return fib;
        }
        else {
            int tempHolding = previous;
            previous = fib;
            fib += tempHolding;
            return fib;
        }
    }
}

import java.util.stream.LongStream;

public class PrimeStream {
    public static long primeCandidate = 0;

    public static long getNext() {
        primeCandidate += 1;
        while (PrimeStream.isPrime(primeCandidate) != true) {
            primeCandidate += 1;
        }
        return primeCandidate;
    }

    private static boolean isPrime(long number) {
        return LongStream.rangeClosed(2, (long)(Math.sqrt(number)))
                .allMatch(n -> number % n != 0);
    }
}

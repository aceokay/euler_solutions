import java.util.stream.LongStream;

/**
  * The prime factors of 13195 are 5, 7, 13 and 29.
  *
  * What is the largest prime factor of the number 600851475143 ?
*/
public class QuestionThree {
    public static void main(String[] args) {
        long input = 600851475143l; // Added the 'L' since this was too big
        // System.out.println(QuestionThree.getPrimesStream(input).max());
        System.out.println(QuestionThree.getPrimesStream(input));
    }

    private static long getPrimesStream(long number) {
        return LongStream.range(2, number + 1)
                // .filter(x -> x % 2 != 0)
                .filter(QuestionThree::isPrime)
                .count();
                // .filter(x -> QuestionThree.factorOf(x, number));
    }
    // private static LongStream getPrimesStream(long number) {
    //     return LongStream.range(2, number + 1)
    //             .filter(x -> x % 2 != 0)
    //             .filter(QuestionThree::isPrime)
    //             .filter(x -> QuestionThree.factorOf(x, number));
    // }

    private static boolean isPrime(final long number) {
      return LongStream.range(2, (long) Math.ceil(Math.sqrt(number + 1)))
              .noneMatch(divisor -> number % divisor == 0);
    }

    // We don't care about all primes, so 2 is not required.
    // private static boolean isPrime(final long number) {
    //   System.out.println(number);
    //   return number == 2 || (number % 2 != 0 && LongStream
    //   .range(2, (long) Math.ceil(Math.sqrt(number + 1)))
    //   .filter(n -> n % 2 != 0)
    //   .noneMatch(divisor -> number % divisor == 0)
    //   );
    // }

    private static boolean factorOf(long prime, long number) {
        // System.out.println(number % prime == 0);
        return number % prime == 0;
    }

    // @FunctionalInterface
    // interface FactorInterface<Prime, Number, Return> {
    //     public Return apply(Prime prime, Number number);
    // }
}

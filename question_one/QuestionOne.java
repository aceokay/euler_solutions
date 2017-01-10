import java.util.stream.IntStream;

/**
  * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
  * get 3, 5, 6 and 9. The sum of these multiples is 23.
  *
  * Find the sum of all the multiples of 3 or 5 below 1000.
*/
public class QuestionOne {
    public static void main(String[] args) {
        int sum = IntStream.range(0, 1000)
                .filter(n -> n % 5 == 0 || n % 3 == 0)
                .sum();
        System.out.println(sum);
    }
}

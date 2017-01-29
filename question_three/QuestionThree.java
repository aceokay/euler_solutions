import java.util.stream.LongStream;
/**
  * The prime factors of 13195 are 5, 7, 13 and 29.
  *
  * What is the largest prime factor of the number 600851475143 ?
*/
public class QuestionThree {
    public static void main(String[] args) {
        long input = 600851475143l; // Added the 'l' since this was too big for int

        long prime = PrimeStream.getNext();
        long primeSelection = 0;
        while (prime < (input / prime)) { // Haha, the dividing by the prime is key
            if (input % prime == 0) {
                System.out.println(prime);
                primeSelection = prime;
            }
            prime = PrimeStream.getNext();
        }

        System.out.println(primeSelection);
    }
}

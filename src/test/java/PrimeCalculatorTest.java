import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class PrimeCalculatorTest {


    @Test
    void testGetPrimes10() throws InterruptedException {
        // Test for primes up to 10
        List<Integer> primes = PrimeCalculator.getPrimes(10);
        // Expected primes: 2, 3, 5, 7
        List<Integer> expectedPrimes = List.of(2, 3, 5, 7, 11);

        // Verify if the generated primes are correct
        Assertions.assertEquals(expectedPrimes, primes);
    }
/*
    @Test
    void testPrimeNumbersUpTo20() throws InterruptedException {
        // Test for primes up to 20
        List<Integer> primes = PrimeCalculator.getPrimes(20);
        // Expected primes: 2, 3, 5, 7, 11, 13, 17, 19
        List<Integer> expectedPrimes = List.of(2, 3, 5, 7, 11, 13, 17, 19);

        // Verify if the generated primes are correct
        Assertions.assertEquals(expectedPrimes, primes);
    }
*/
/*
    @Test
    void testPrimeNumbersUpTo100() throws InterruptedException {
        // Test for primes up to 100
        List<Integer> primes = PrimeCalculator.getPrimes(100);

        // Expected primes: Not empty list
        Assertions.assertTrue(!primes.isEmpty());
        List<Integer> expectedPrimes = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);

        // Verify if the generated primes are correct
        Assertions.assertEquals(expectedPrimes, primes);
    }
*/
/*
    @Test
    void testPrimeNumbersUpTo1000() throws InterruptedException {
        // Test for primes up to 1000
        List<Integer> primes = PrimeCalculator.getPrimes(1000);

        // Expected primes: Not empty list
        Assertions.assertTrue(!primes.isEmpty());
    }
*/
/*
    @Test
    void testPrimeNumbersUpTo8000() throws InterruptedException {
        // Test for primes up to 8000
        List<Integer> primes = PrimeCalculator.getPrimes(8000);

        // Expected primes: Not empty list
        Assertions.assertTrue(!primes.isEmpty());
    }
*/
/*
    @Test
    void testPrimeNumbersLoop() throws InterruptedException {
        // loop 100
        int l=0;
        for (int i = 0; i <= 100 ; i++) {
            List<Integer> primes = PrimeCalculator.getPrimes(100);
            l = i;
        }
        // Verify if the generated primes are correct
        Assertions.assertEquals(l, 100);
    }
*/
/*
    @Test
    void testPrimeNumbersUpTo80k() throws InterruptedException {
        // Test for primes up to 80k
        List<Integer> primes = PrimeCalculator.getPrimes(80000);
        // Expected primes: 2, 3, 5, 7, 11, 13, 17, 19
      //  List<Integer> expectedPrimes = List.of(2, 3, 5, 7, 11, 13, 17, 19);

        // Expected primes: Not empty list
        Assertions.assertTrue(!primes.isEmpty());
      //  System.out.println("Prime numbers up to : " + primes);
    }
*/

    /*
    @Test
    void testEmptyPrimesFor1() throws InterruptedException {
        // Test for primes up to 1 (no primes)
        List<Integer> primes = PrimeCalculator.getPrimes(1);
        // Expected primes: empty list
        Assertions.assertTrue(primes.isEmpty());
    }
*/


}

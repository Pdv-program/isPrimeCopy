import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrimeCalculator {
    public static void main(String[] args) throws InterruptedException {
        // Get the maximum prime limit from the input argument and generate primes
        for (Integer prime : getPrimes(Integer.parseInt(args[0]))) {
            System.out.print(prime + "\n"); // Print each prime number
        }
    }

    // Method to get the list of primes up to maxPrime
    public static List<Integer> getPrimes(int maxPrime) throws InterruptedException {
        // Prime numbers list starts empty
        List<Integer> primeNumbers = Collections.synchronizedList(new LinkedList<>());

        // CountDownLatch to manage the thread synchronization
        CountDownLatch latch = new CountDownLatch(maxPrime - 1); // from 2 to maxPrime inclusive

        // Executor service to manage threads, adjusting the pool size to the system's capacity
        ExecutorService executors = Executors.newFixedThreadPool(Math.max(maxPrime / 100, 10));

        // Loop from 2 up to maxPrime to check if each number is prime
        for (int candidate = 2; candidate <= maxPrime; candidate++) {
            int currentCandidate = candidate; // Capture candidate in final for lambda use

            executors.submit(() -> {
                if (isPrime(primeNumbers, currentCandidate)) {
                    synchronized (primeNumbers) {
                        primeNumbers.add(currentCandidate); // Add number to list if it is prime
                    }
                }
                latch.countDown(); // Signal task completion
            });
        }

        latch.await(); // Wait for all tasks to complete
        executors.shutdownNow(); // Shutdown the executor service
        Collections.sort(primeNumbers);
        return primeNumbers; // Return the list of prime numbers
    }

    // Method to check if the candidate is a prime number
    private static boolean isPrime(List<Integer> primeNumbers, int candidate) {
        synchronized (primeNumbers) {
            // If candidate is divisible by any prime number in primeNumbers list, it is not prime
            for (Integer prime : primeNumbers) {
              //  System.out.println("Candidate : " + candidate + " prime : " + prime);
                if (candidate % prime == 0) {
                    return false; // Return false if divisible by any smaller prime
                }
            }
        }
        return true; // Return true if candidate is prime
    }
}
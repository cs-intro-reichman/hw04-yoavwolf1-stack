public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n+1]; //an array that indicates if a number (represented by the index) is a prime
        int prime = 2; //starting from 2 - the smallest prime
        int counter = 0; //counting the amount of prime numbers between 2 and n
        int ratio;

        //initializing the entire array to be 'true' (prime numbers until proven otherwise)
        for(int i = 2; i < isPrime.length; i++)
            isPrime[i] = true;
        System.out.println("Prime numbers up to " + n + ":");

        //going over all the number until the square root of n - because all the numbers after 
        // that are matching coefficients of the numbers that came before the square root
        while(prime <= Math.sqrt(n)) {
            counter++;
            System.out.println(prime);
            //going over all the numbers after the current prime and checking if they're divisible by it (and therefore not prime)
            for(int i = prime + 1; i < isPrime.length; i++)
                if(i % prime == 0) isPrime[i] = false;
            prime++;
            //advancing the variablen "prime" to the next prime number in the array
            while(isPrime[prime] == false)
                prime++;
        }
        //going over the array starting from the sqare root of n (where we finished our last loop)
        //and checking what array cells are still 'true' and therefore prime numbers
        for(int i = prime; i < isPrime.length; i++)
            if(isPrime[i]) { // if(isPrime[i] == true)
                counter++;
                System.out.println(i);
            }
        //calculating the percentage of the prime numbers out of all the numbers between 1 and n
        ratio = 100 * counter / n;

        System.out.println("There are " + counter + " primes between 2 and " + n + " (" + ratio + "% are primes)");
    }
}
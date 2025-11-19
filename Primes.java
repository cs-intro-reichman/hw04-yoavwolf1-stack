public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n+1];
        int prime = 2;
        int counter = 0;
        int ratio;

        for(int i = 2; i < isPrime.length; i++)
            isPrime[i] = true;

        System.out.println("Prime numbers up to " + n + ":");
        while(prime <= Math.sqrt(n)) {
            counter++;
            System.out.println(prime);
            for(int i = prime + 1; i < isPrime.length; i++)
                if(i % prime == 0) isPrime[i] = false;
            prime++;
            while(isPrime[prime] == false)
                prime++;
        }
        for(int i = prime; i < isPrime.length; i++)
            if(isPrime[i]) { // if(isPrime[i] == true)
                counter++;
                System.out.println(i);
            }
        ratio = 100 * counter / n;

        System.out.println("There are " + counter + " primes between 2 and " + n + " (" + ratio + "% are primes)");
        char ch = 97;
        System.out.println(ch);
    }
}
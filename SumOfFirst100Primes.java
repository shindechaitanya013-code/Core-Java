class SumOfFirst100Primes {
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        long sum = 0;

        while(count < 100) {
            if (isPrime(number)) {
                sum += number;
                count++;
            }
            number++;
        }

        System.out.println("Sum of first 100 prime numbers = " + sum);
    }
}

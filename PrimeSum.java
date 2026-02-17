import java.io.*;

public class PrimeSum 
{
    static boolean isPrime(int num) 
	{
       	if (num <= 1) 
		{
    		return false; 
        }

    	for (int i = 2; i <= num - 1; i++)
		{
        	if (num % i == 0) 
			{
        		return false; 
        	}
		}
    	return true; 
    }

    static int SumPrimesUpToN(int n) 
    {
        int sum = 0;
                
        for (int i = 2; i <= n; i++) 
        {
            if (isPrime(i)) 
            {
                sum += i; 
            }
        }
        return sum;
    }

    public static void main(String[] args) 
    {
        int limit = 17; 

        int primeSum = SumPrimesUpToN(limit);

        System.out.println("Sum of prime numbers up to " + limit + ": " + primeSum);
    }
}

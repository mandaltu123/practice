package ds.misc;

public class CheckPrimeNumber
{

    public static boolean isPrimeNo(int n)
    {
        // corner case
        if (n < 1)
        {
            return false;
        }
        if(n == 1 || n == 2)
        {
            return true;
        }

        // check for 2 to n -1
        for(int i = 2; i < n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void printNPrimeNumbers(int n)
    {
        int i = 3, count, c;
        // since 1 and 2 are also prime numbers
        if(n >= 1)
        {
            System.out.print(1 + " " + 2 + " ");
        }
        for (count = 2; count < n; )
        {
            for (c = 2; c <= i -1; c++)
            {
                if(i % c == 0)
                {
                    break;
                }
            }
            if(c == i)
            {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }


    public static void main(String[] args) {
        boolean isPrime  = isPrimeNo(11);
        System.out.println(isPrime);
        System.out.println("10 is a prime number : " + isPrimeNo(10));
        // will be printing first n prime numbers
        printNPrimeNumbers(5);
    }
}

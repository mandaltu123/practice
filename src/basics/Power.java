package basics;

public class Power {

    /**
     * Power function for positive integer numbers
     * @param a
     * @param b
     * @return
     */
    public static double power(int a, int b)
    {
        double result = 1;
        if (a >= 0 && b >= 0)
        {
            for (int i = 0; i < b; i++)
            {
                result = result*a;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(2, -1));
    }
}

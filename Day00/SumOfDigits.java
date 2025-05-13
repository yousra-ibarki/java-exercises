

public class SumOfDigits { 
    public static int calculateSum(int nbr, int sum)
    {
        int digit = nbr % 10;
        sum += digit;
        if(nbr == 0)
            return sum;

        return calculateSum(nbr / 10, sum);
    }
    public static void main(String[] args) {
        int sum  = 0;
        // int nbr = 479598;
        int nbr = 100000 + (int)(Math.random() * 900000);
        System.out.println(nbr);
        sum = calculateSum(nbr, sum);
        System.out.println(sum);
    }
}

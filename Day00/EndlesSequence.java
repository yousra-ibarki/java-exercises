import java.util.Scanner;

public class EndlesSequence {
    
    public static int calculateSum(int nbr, int sum)
    {
        int digit = nbr % 10;
        sum += digit;
        if(nbr == 0)
            return sum;

        return calculateSum(nbr / 10, sum);
    }

    public static boolean isPrime(int nbr){
        
        if(nbr <= 1)
            return false;
        else if(nbr <= 3)
            return true;
        else if(nbr % 2 == 0 || nbr % 3 == 0)
            return false;
        for(int i = 5; i <= Math.sqrt(nbr); i+=6){
            if(nbr % i == 0 || nbr % (i + 2) == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int countPrime = 0;
            System.out.println("Enter Your Number");
            int sum = 0;
            String currStringNbr = "0";
            while(Integer.parseInt(currStringNbr) != 42)
            {
                currStringNbr = userInput.nextLine();
                int nbr = calculateSum(Integer.parseInt(currStringNbr), sum);
                if (isPrime(nbr))
                    countPrime++;
            }
            System.out.println("Count of coffee-request : " + countPrime);
    }
}

import java.util.Scanner;

public class ReallyPrimeNumber {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in); 
        System.out.println("Enter Your Number");
        int isPrimeNbr = Integer.parseInt(userInput.nextLine());
        if(isPrimeNbr <= 1){
            System.err.println("IllegalArgument");}
        else{
           int i;
           boolean isPrime = true;
           for(i = 2 ; i < Math.sqrt(isPrimeNbr); i++)
           {
                if(isPrimeNbr % i == 0){
                    isPrime = false;
                    break;
                }
           }
           System.out.println((isPrime ? "true " : "false ") + (i - 1));
        }
    }
}

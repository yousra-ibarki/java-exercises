import java.util.Scanner;

public class ReallyPrimeNumber {
    public static void main(String[] args){
        Scanner userInputObj = new Scanner(System.in); 
        System.out.println("Enter Your Sentence");
        String sentence = userInputObj.nextLine();
        System.out.println(sentence);



        userInputObj.close();
    }
}
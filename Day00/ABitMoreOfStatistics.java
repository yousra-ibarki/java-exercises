import java.util.Scanner;

public class ABitMoreOfStatistics {

    public static void calFrequency(String str){
        int[] frequency = new int[65536];
        int maxChar = 0;

        for(int i = 0; i < str.length() ; i++)
        {
            char singleChar = str.charAt(i);
            frequency[singleChar]++;
        }

        if(frequency[i] > maxChar){
                maxChar = frequency[i];
            }for(int i = 0; i < frequency.length; i++){
            if(frequency[i] > 0){
                System.out.println((char)i + ": " + frequency[i]);
            }
            if(frequency[i] > maxChar){
                maxChar = frequency[i];
            }
        }
        System.out.print("maxChar = " + maxChar);
        for(int i = 0; i < frequency.length; i++){
            System.out.println(frequency[i])
        }
        
    }

    public static void main (String[] args){
        Scanner userInput = new Scanner (System.in);
        System.out.print("Enter Your String: ");
        String str = userInput.nextLine();

        calFrequency(str);
    }
}



//origina range from 0 to 65535
//
//chart scale is from 0 to 10
//
//x = 47
// ((x - 0) / (36 - 0)) * (10 - 0) + 0
//
// (x / y) * 10
//
// (27 / 36) * 10
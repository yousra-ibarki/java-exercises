import java.util.Scanner;

public class LittleBitOfStatistics {
    public static int main(String[] args){

        Scanner userInput = new Scanner(System.in);
        int weekNbr = 0;
        int currWeek = 0;
            while(true){
                System.out.println("Enter your Week number");
                String str = userInput.nextLine().replaceAll("[^0-9]", "");
                if(str.equals("42"))
                    break;
                weekNbr = Integer.parseInt(str);

                if(weekNbr != currentWeek + 1){
                    System.err.println("IllegalArguments");
                    System.exit(-1);
                }
                currWeek = weekNbr;

                System.out.println("Enter your 5 grads: ");
                String grades = userInput.nextLine();
            }
            
            for(Map.Entry<String>, List<Integer>> entry : map.entrySet()){
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
            
    }
}



// if(studentGrade.getKey() > weekNbr)
//                {
//                    System.out.println("IllegalArgument");
//                    return -1;
//                }
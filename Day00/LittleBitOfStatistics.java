import java.util.Scanner;

public class LittleBitOfStatistics {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        String allGrades = "";
        int weekNbr = 0;
        int currWeek = 0;
            while(true){
                System.out.println("Enter your Week number");
                String str = userInput.nextLine().replaceAll("[^0-9]", "");
                if(str.equals("42"))
                    break;
                weekNbr = Integer.parseInt(str);

                if(weekNbr != currWeek + 1){
                    System.err.println("IllegalArguments");
                    System.exit(-1);
                }
                currWeek = weekNbr;

                System.out.println("Enter your 5 grads: ");
                String gradesInput = userInput.nextLine();

                String[] grades = gradesInput.split(" ");
                if(grades.length != 5){
                    System.err.println("IllegalArguments");
                    System.exit(-1);
                }
                int minGrade = 9;
                for(String grade : grades){
                    int gradeValue = 0;
                    try{
                        gradeValue = Integer.parseInt(grade);
                    }
                    catch(NumberFormatException e){
                        System.err.println("IllegalArguments");
                        System.exit(-1);
                    }
                    if(gradeValue < 1 || gradeValue > 9){
                        System.err.println("IllegalArguments");
                        System.exit(-1);
                    }
                    if(gradeValue < minGrade){
                        minGrade = gradeValue;
                    }
                }
                allGrades += minGrade;
            }

            for(int i = 0; i < allGrades.length(); i++){
                System.out.print("Week " + (i + 1) + " ");
                int minGrade = allGrades.charAt(i) - '0';
                for(int j = 0; j < minGrade; j++){
                    System.out.print("=");
                }
                System.out.println(">");
            }
            userInput.close();
            
            
    }
}



// if(studentGrade.getKey() > weekNbr)
//                {
//                    System.out.println("IllegalArgument");
//                    return -1;
//                }
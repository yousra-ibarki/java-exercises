import java.util.Scanner;

public class ABitMoreOfStatistics {

    public static void calFrequency(String str){
        int[] frequency = new int[65536];
        int maxChar = 0;
        char[] topChars = new char[10];
        int[] topCounts = new int[10];

        for(int i = 0; i < str.length() ; i++)
        {
            char singleChar = str.charAt(i);
            frequency[singleChar]++;
            if(frequency[singleChar] > maxChar){
                maxChar = frequency[singleChar];
            }
        }
        
        for(int i = 0; i < 65536; i++){
            int freq = frequency[i];
            if(freq == 0) continue;

            int pos = 0;
            while(pos < 10){
                if(freq > topCounts[pos] || (freq == topCounts[pos] && i < topChars[pos]))
                    break;
                pos++;
            }
            if(pos < 10)
            {
                for(int j = 9; j > pos; j--){
                    topCounts[j] = topCounts[j - 1];
                    topChars[j] = topChars[j - 1];
                }
                topCounts[pos] = freq;
                topChars[pos] = (char)i;
            }
        }
        
        int[] heights = new int[10];
        for(int i = 0; i < 10; i++){
            if(topCounts[i] == 0) break;
            heights[i] = maxChar > 10 ? (topCounts[i] * 10 + maxChar - 1) / maxChar : topCounts[i];
        }

        for(int lvl = 10; lvl > 0; lvl--){
            for(int i = 0; i < 10; i++){
                if(topCounts[i] == 0) break;
                if(heights[i] >= lvl)
                    System.out.print("# ");
                else
                    System.out.print(" ");
               // System.out.print(" " + topChars[i]);
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            if (topCounts[i] == 0) break;
            System.out.print(topChars[i] + " ");
        }
        System.out.println();
        
    }

    public static void main (String[] args){
        Scanner userInput = new Scanner (System.in);
        System.out.print("Enter Your String: ");
        String str = userInput.nextLine().trim();
        userInput.close();

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




//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAASSSSSSSSSSSSSSSSSSSSSSSSDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDWEWWKFKKDKKD
//SKAKLSLDKSKALLLLLLLLLLRTRTETWTWWWWWWWWWWOOOOOOO42
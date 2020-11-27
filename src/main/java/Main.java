import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> data = readData("input.txt");
        int len = searchBiggestPalindrome(data);
        writeAnswer(len);

    }

    public static List readData(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        List<String> data = new ArrayList();
        while (scanner.hasNext())
            data.add(scanner.nextLine());
        return data;
    }

    public static int searchBiggestPalindrome(List<String> data){
        int length = 0;
        for (int i=0; i < data.size(); i++) {
            String word = data.get(i);
            for (int j = 0; j < word.length()/2; j++) {

                if(isPalindrome(word)){
                    if(word.length() > length)
                        length = word.length();
                }
                word = word.substring(1, word.length()-1);
            }
        }
        return length;
    }



    public static boolean isPalindrome(String s){
        char[] letters = s.toCharArray();
        for (int i = 0; i < letters.length/2; i++) {
            if(letters[i]!=letters[letters.length-i-1])
                return false;
        }
        return true;
    }

    public static void writeAnswer(int i){
        PrintWriter writer = null;
        try {
             writer = new PrintWriter("answer.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        writer.println(i);
        
    }
}

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        String sentence = "A quick brown fox jumps over the lazy dog";
        List<String> wordList = new ArrayList<>();

       
        String[] words = sentence.split(" ");

    
        for (String word : words) {
            wordList.add(word);
        }

        
        String[] wordArray = wordList.toArray(new String[0]);

        for (String word : wordArray) {
            System.out.println(word);
        }
    }
}

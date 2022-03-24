import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class CountWords {
    public static void main (String[]args){
        {
            String ToLowerCase= Text.TEXT.toLowerCase(Locale.ROOT);
            String[] WordsArr = ToLowerCase.split("\\s+");
            Set<String> StringSet= new HashSet<>(Arrays.asList(WordsArr));
            System.out.println("Total number of unique words is:" +StringSet.size());
        }
    }
}

import java.util.Arrays;
public class RecursiveCapitalization {
    public static String[] capitalizeWords(String[] words) {
        return capitalizeWordsHelper(words, 0);
    }
    private static String[] capitalizeWordsHelper(String[] words, int index)
    {
        if (index == words.length)
        {
            return new String[0];
        }
        String currentWord = words[index];
        String[] remainingWords = capitalizeWordsHelper(words, index + 1);
        String[] result = new String[remainingWords.length + 1];
        result[0] = currentWord.toUpperCase();
        System.arraycopy(remainingWords, 0, result, 1, remainingWords.length);
        return result;
    }
    public static void main(String[] args) {
        String[] words = { "apple", "banana", "cherry", "date" };
        String[] capitalizedWords = capitalizeWords(words);
        System.out.println("Capitalized words: " + Arrays.toString(capitalizedWords));
    }
}
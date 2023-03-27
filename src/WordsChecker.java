import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class WordsChecker {
    protected Set<String> words = new HashSet<>();

    public WordsChecker(String text) {
        this.words = Arrays.stream(text.split("\\P{IsAlphabetic}+")).collect(Collectors.toSet());
    }

    public boolean hasWord(String word) {
        return this.words.contains(word);
    }
}

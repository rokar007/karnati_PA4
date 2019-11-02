import java.io.IOException;
import java.io.FileNotFoundException;

public class Application {
    public static void main(String[] args) throws IOException
    {
        DuplicateCounter d = new DuplicateCounter();
        d.count("problem2.txt");
        d.write("unique_word_counts.txt");
    }
}

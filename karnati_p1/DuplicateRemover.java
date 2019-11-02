import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


class DuplicateRemover
{
    ArrayList<String> uniqueWords = new ArrayList<String>();

    public void remove(String dataFile) throws IOException {
    BufferedReader buffer = new BufferedReader(new FileReader(dataFile));
    String lines = buffer.readLine();
    while(line1 != null)
    {
        String temp[] = line1.split(" ");
        for(String s:temp)
        {
            if(!uniqueWords.contains(i))uniqueWords.add(s);
        }
        line1 = buffer.readLine();
    }
    buffer.close();
}

   public void write(String outputFile) throws FileNotFoundException {
       PrintWriter print = new PrintWriter(outputFile);
       for(String s:uniqueWords)
       {
       print.println(s);
   }
       print.close();
   }
}
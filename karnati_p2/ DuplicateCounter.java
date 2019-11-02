
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class DuplicateCounter
{
    Map<String, Integer> wordCounter = new HashMap<String, Integer> ();
    public void count(String dataFile) throws IOException {
    BufferedReader buffer = new BufferedReader(new FileReader(dataFile));
    String str = buffer.readLine();
    while(str != null)
    {
        String temp[] = str.split(" ");
        for(String st :temp)
        {
            if (!wordCounter.containsKey(st))
            {
                wordCounter.put(st, 1);
            }
            else
            {
                int count = wordCounter.get(st);
                wordCounter.put(st, count + 1);
            }
        }
        str = buffer.readLine();
    }

    buffer.close();
}
    public void write(String outputFile) throws FileNotFoundException
    {
       PrintWriter write = new PrintWriter(outputFile);
       for (Map.Entry<String, Integer> entry : wordCounter.entrySet()) 
       {
            write.println(entry.getKey()+" "+entry.getValue());
        }
        write.close();
    }
}
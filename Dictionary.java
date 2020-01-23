package Dictionari;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Dictionary {
    private Map<String,String> map;
    //private Map<String,String> map;

    public Dictionary() {
        this.map = new HashMap<>();
    }

    public void loadFromFile(String fName){
        List<String> strings = null;
        int k = 0;
        try {
            strings = Files.readAllLines(Paths.get(fName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String s : strings) {
            String[] words = s.split(";"); // "cat;kit"  -> ["cat", "kit"]
            map.put(words[0],words[1]);
            k++;
        }
        System.out.println(k + " words!");

    }

    public void addWord(String eng, String ukr){
        map.put(eng,ukr);
    }

    public String translate(String eng){
        return map.get(eng);
    }
}

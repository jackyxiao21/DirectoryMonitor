import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
public class FileOperate {
 
    public void ReplaceWord(Path path, String find, String replace) {
        try {
            Stream <String> lines = Files.lines(path);
            int occurance = lines.collect(Collectors.summingInt(line -> WordCount(line, find)));
            System.out.println("Occurance of " + find + ": "+occurance);
            lines.close();
            Stream <String> lines2 = Files.lines(path);
            List <String> replaced = lines2.map(line -> line.replaceAll(find, replace)).collect(Collectors.toList());
            Files.write(path, replaced);
            lines2.close();
            System.out.println("Find and Replace done!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int WordCount(String source, String find) {
        return (source.length()-source.replaceAll(find, "").length())/find.length();
    }

}



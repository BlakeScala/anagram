import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Enter multiple words to check if any are anagrams. (Separate by single space)");
    String userWords = console.readLine();

    Anagram anagram = new Anagram();
    List<String> anagramList = anagram.manyWordCheck(userWords);

    String outputLine = "Anagram set: ";
    for(String anagramListWord: anagramList){
      if(!anagramListWord.equals("|")){
        outputLine += anagramListWord + " ";
      } else if (outputLine.length() > 13){
        System.out.println(outputLine);
        outputLine = "Anagram set: ";
      }
    }
  }
}

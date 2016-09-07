import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Enter multiple words to check if any are anagrams. (Separate by single space)");
    String userWords = console.readLine();

    Anagram anagram = new Anagram();
    ArrayList<String> anagramList = anagram.manyWordCheck(userWords);

    System.out.println(anagramList);
  }
}

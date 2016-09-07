import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Anagram {
  public boolean anagramCheck(String wordOne, String wordTwo){
    String[] firstWord = wordOne.toLowerCase().split("");
    String[] secondWord = wordTwo.toLowerCase().split("");

    ArrayList<String> firstWordList = new ArrayList<String>(Arrays.asList(firstWord));
    ArrayList<String> secondWordList = new ArrayList<String>(Arrays.asList(secondWord));

    Collections.sort(firstWordList);
    Collections.sort(secondWordList);

    if (firstWordList.equals(secondWordList)) {
      return true;
    } else {
      return false;
    }
  }

  public ArrayList<String> manyWordCheck(String words){
    String[] wordsArray = words.split(" ");
    ArrayList<String> wordsArrayList = new ArrayList<String>(Arrays.asList(wordsArray));
    ArrayList<String> anagramWords = new ArrayList<String>();
    boolean addI = false;
    for(int i = 0; i < wordsArrayList.size()-1; i++){
      for(int j = i+1; j < wordsArrayList.size(); j++){
        if(anagramCheck(wordsArrayList.get(i), wordsArrayList.get(j))){
          anagramWords.add(wordsArrayList.get(j));
          wordsArrayList.remove(j);
          addI = true;
        }
      }
      if(addI){
        anagramWords.add(wordsArrayList.get(i));
        addI = false;
      }
    }
    return anagramWords;
  }
}

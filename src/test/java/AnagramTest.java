import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class AnagramTest{
  @Test
  public void anagramCheck_checkIfSameWord_true() {
    Anagram anagram = new Anagram();
    assertEquals(true, anagram.anagramCheck("dog", "dog"));
  }
  @Test
  public void anagramCheck_checkIfAnagram_true() {
    Anagram anagram = new Anagram();
    assertEquals(true, anagram.anagramCheck("dog", "god"));
  }
  @Test
  public void anagramCheck_checkIfAnagramWithDifferentCase_true() {
    Anagram anagram = new Anagram();
    assertEquals(true, anagram.anagramCheck("dog", "GOD"));
  }
  @Test
  public void manyWordCheck_checkIfAnagramWithMultipleWords_true() {
    Anagram anagram = new Anagram();
    ArrayList<String> expectedOutput = new ArrayList<String>();
    expectedOutput.add("god");
    expectedOutput.add("dog");
    assertEquals(expectedOutput, anagram.manyWordCheck("dog god cat cake"));
  }
}

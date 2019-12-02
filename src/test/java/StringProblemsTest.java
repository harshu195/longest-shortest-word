import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringProblemsTest {

    @Test
    public void getLongestWord() {
        LongestAndShortestWordInASentence longestAndShortestWordInASentence = new LongestAndShortestWordInASentence();
        StringProblems.getLongestAndShortestWordInASentence("The cow jumped over the moon", longestAndShortestWordInASentence);
        System.out.println("Longest word :" + longestAndShortestWordInASentence.getLongestWord());
        assertEquals("jumped", longestAndShortestWordInASentence.getLongestWord());
    }

    @Test
    public void getLongestWordLength() {
        LongestAndShortestWordInASentence longestAndShortestWordInASentence = new LongestAndShortestWordInASentence();
        StringProblems.getLongestAndShortestWordInASentence("The cow jumped over the moon", longestAndShortestWordInASentence);
        System.out.println("Longest word Length :" + longestAndShortestWordInASentence.getLongestWordLength());
        assertEquals(6, longestAndShortestWordInASentence.getLongestWordLength());
    }

    @Test
    public void getShortestWord() {
        LongestAndShortestWordInASentence longestAndShortestWordInASentence = new LongestAndShortestWordInASentence();
        StringProblems.getLongestAndShortestWordInASentence("The cow jumped over the moon", longestAndShortestWordInASentence);
        System.out.println("Shortest word :" + longestAndShortestWordInASentence.getShortestWord());
        assertEquals("The", longestAndShortestWordInASentence.getShortestWord());
    }

    @Test
    public void getShortestWordLength() {
        LongestAndShortestWordInASentence longestAndShortestWordInASentence = new LongestAndShortestWordInASentence();
        StringProblems.getLongestAndShortestWordInASentence("The cow jumped over the moon", longestAndShortestWordInASentence);
        System.out.println("Shortest word Length :" + longestAndShortestWordInASentence.getShortestWordLength());
        assertEquals(3, longestAndShortestWordInASentence.getShortestWordLength());
    }

    @Test
    public void testForNullString() {
        LongestAndShortestWordInASentence longestAndShortestWordInASentence = new LongestAndShortestWordInASentence();
        StringProblems.getLongestAndShortestWordInASentence("", longestAndShortestWordInASentence);
        System.out.println("shortestWordLength = " + longestAndShortestWordInASentence.getShortestWordLength() + " shortestWord = " + longestAndShortestWordInASentence.getShortestWord());
        System.out.println("longestWordLength = " + longestAndShortestWordInASentence.getLongestWordLength() + " longestWord = " + longestAndShortestWordInASentence.getLongestWord());
        assertEquals("", longestAndShortestWordInASentence.getLongestWord());
        assertEquals(0, longestAndShortestWordInASentence.getLongestWordLength());
        assertEquals("", longestAndShortestWordInASentence.getShortestWord());
        assertEquals(0, longestAndShortestWordInASentence.getShortestWordLength());
    }

    @Test
    public void testForSingleSpaceString() {
        LongestAndShortestWordInASentence longestAndShortestWordInASentence = new LongestAndShortestWordInASentence();
        StringProblems.getLongestAndShortestWordInASentence(" ", longestAndShortestWordInASentence);
        System.out.println("shortestWordLength = " + longestAndShortestWordInASentence.getShortestWordLength() + " shortestWord = " + longestAndShortestWordInASentence.getShortestWord());
        System.out.println("longestWordLength = " + longestAndShortestWordInASentence.getLongestWordLength() + " longestWord = " + longestAndShortestWordInASentence.getLongestWord());
        assertEquals("", longestAndShortestWordInASentence.getLongestWord());
        assertEquals(0, longestAndShortestWordInASentence.getLongestWordLength());
        assertEquals("", longestAndShortestWordInASentence.getShortestWord());
        assertEquals(0, longestAndShortestWordInASentence.getShortestWordLength());
    }

    @Test
    public void testForMultiSpaceString() {
        LongestAndShortestWordInASentence longestAndShortestWordInASentence = new LongestAndShortestWordInASentence();
        StringProblems.getLongestAndShortestWordInASentence("     ", longestAndShortestWordInASentence);
        System.out.println("shortestWordLength = " + longestAndShortestWordInASentence.getShortestWordLength() + " shortestWord = " + longestAndShortestWordInASentence.getShortestWord());
        System.out.println("longestWordLength = " + longestAndShortestWordInASentence.getLongestWordLength() + " longestWord = " + longestAndShortestWordInASentence.getLongestWord());
        assertEquals("", longestAndShortestWordInASentence.getLongestWord());
        assertEquals(0, longestAndShortestWordInASentence.getLongestWordLength());
        assertEquals("", longestAndShortestWordInASentence.getShortestWord());
        assertEquals(0, longestAndShortestWordInASentence.getShortestWordLength());
    }

    @Test
    public void testForSingleWord() {
        LongestAndShortestWordInASentence longestAndShortestWordInASentence = new LongestAndShortestWordInASentence();
        StringProblems.getLongestAndShortestWordInASentence("test", longestAndShortestWordInASentence);
        System.out.println("shortestWordLength = " + longestAndShortestWordInASentence.getShortestWordLength() + " shortestWord = " + longestAndShortestWordInASentence.getShortestWord());
        System.out.println("longestWordLength = " + longestAndShortestWordInASentence.getLongestWordLength() + " longestWord = " + longestAndShortestWordInASentence.getLongestWord());
        assertEquals("test", longestAndShortestWordInASentence.getLongestWord());
        assertEquals(4, longestAndShortestWordInASentence.getLongestWordLength());
        assertEquals("test", longestAndShortestWordInASentence.getShortestWord());
        assertEquals(4, longestAndShortestWordInASentence.getShortestWordLength());
    }
    @Test
    public void testForASingleChar() {
        LongestAndShortestWordInASentence longestAndShortestWordInASentence = new LongestAndShortestWordInASentence();
        StringProblems.getLongestAndShortestWordInASentence("t", longestAndShortestWordInASentence);
        System.out.println("shortestWordLength = " + longestAndShortestWordInASentence.getShortestWordLength() + " shortestWord = " + longestAndShortestWordInASentence.getShortestWord());
        System.out.println("longestWordLength = " + longestAndShortestWordInASentence.getLongestWordLength() + " longestWord = " + longestAndShortestWordInASentence.getLongestWord());
        assertEquals("t", longestAndShortestWordInASentence.getLongestWord());
        assertEquals(1, longestAndShortestWordInASentence.getLongestWordLength());
        assertEquals("t", longestAndShortestWordInASentence.getShortestWord());
        assertEquals(1, longestAndShortestWordInASentence.getShortestWordLength());
    }

    @Test
    public void testForSpecialChar() {
        LongestAndShortestWordInASentence longestAndShortestWordInASentence = new LongestAndShortestWordInASentence();
        StringProblems.getLongestAndShortestWordInASentence("Testing Special character I@m", longestAndShortestWordInASentence);
        System.out.println("shortestWordLength = " + longestAndShortestWordInASentence.getShortestWordLength() + " shortestWord = " + longestAndShortestWordInASentence.getShortestWord());
        System.out.println("longestWordLength = " + longestAndShortestWordInASentence.getLongestWordLength() + " longestWord = " + longestAndShortestWordInASentence.getLongestWord());
        assertEquals("character", longestAndShortestWordInASentence.getLongestWord());
        assertEquals(9, longestAndShortestWordInASentence.getLongestWordLength());
        assertEquals("I@m", longestAndShortestWordInASentence.getShortestWord());
        assertEquals(3, longestAndShortestWordInASentence.getShortestWordLength());
    }
    @Test
    public void testForApostrophe() {
        LongestAndShortestWordInASentence longestAndShortestWordInASentence = new LongestAndShortestWordInASentence();
        StringProblems.getLongestAndShortestWordInASentence("Testing a Apostrophe's ", longestAndShortestWordInASentence);
        System.out.println("shortestWordLength = " + longestAndShortestWordInASentence.getShortestWordLength() + " shortestWord = " + longestAndShortestWordInASentence.getShortestWord());
        System.out.println("longestWordLength = " + longestAndShortestWordInASentence.getLongestWordLength() + " longestWord = " + longestAndShortestWordInASentence.getLongestWord());
        assertEquals("Apostrophe's", longestAndShortestWordInASentence.getLongestWord());
        assertEquals(12, longestAndShortestWordInASentence.getLongestWordLength());
        assertEquals("a", longestAndShortestWordInASentence.getShortestWord());
        assertEquals(1, longestAndShortestWordInASentence.getShortestWordLength());
    }

    @Test
    public void testForPunctuation() {
        LongestAndShortestWordInASentence longestAndShortestWordInASentence = new LongestAndShortestWordInASentence();
        StringProblems.getLongestAndShortestWordInASentence("Testing Punctuation Mr. ", longestAndShortestWordInASentence);
        System.out.println("shortestWordLength = " + longestAndShortestWordInASentence.getShortestWordLength() + " shortestWord = " + longestAndShortestWordInASentence.getShortestWord());
        System.out.println("longestWordLength = " + longestAndShortestWordInASentence.getLongestWordLength() + " longestWord = " + longestAndShortestWordInASentence.getLongestWord());
        assertEquals("Punctuation", longestAndShortestWordInASentence.getLongestWord());
        assertEquals(11, longestAndShortestWordInASentence.getLongestWordLength());
        assertEquals("Mr.", longestAndShortestWordInASentence.getShortestWord());
        assertEquals(3, longestAndShortestWordInASentence.getShortestWordLength());
    }

}
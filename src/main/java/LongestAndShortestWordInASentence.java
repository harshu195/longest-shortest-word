public class LongestAndShortestWordInASentence {

    String shortestWord="";

    public String getLongestWord() {
        return longestWord;
    }

    public void setLongestWord(String longestWord) {
        this.longestWord = longestWord;
    }

    String longestWord="";
    int shortestWordLength=0;
    int longestWordLength=0;


    public String getShortestWord() {
        return shortestWord;
    }

    public void setShortestWord(String shortestWord) {
        this.shortestWord = shortestWord;
    }


    public int getShortestWordLength() {
        return shortestWordLength;
    }

    public void setShortestWordLength(int shortestWordLength) {
        this.shortestWordLength = shortestWordLength;
    }

    public int getLongestWordLength() {
        return longestWordLength;
    }

    public void setLongestWordLength(int longestWordLength) {
        this.longestWordLength = longestWordLength;
    }

}

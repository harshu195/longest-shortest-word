import java.util.Scanner;

public class StringProblems {


    public static LongestAndShortestWordInASentence longestAndShortestWordInASentence = new LongestAndShortestWordInASentence();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any sentence : ");
        String inputSentence = sc.nextLine();
        sc.close();
        getLongestAndShortestWordInASentence(inputSentence, longestAndShortestWordInASentence);

        System.out.println("shortestWordLength = " + longestAndShortestWordInASentence.getShortestWordLength() + " shortestWord = " + longestAndShortestWordInASentence.getShortestWord());
        System.out.println("longestWordLength = " + longestAndShortestWordInASentence.getLongestWordLength() + " longestWord = " + longestAndShortestWordInASentence.getLongestWord());

    }

    public static void getLongestAndShortestWordInASentence(String sentence, LongestAndShortestWordInASentence longestAndShortestWordInASentence){
        int tempLength = 0;
        String[] eachWordArray = sentence.split(" ");
        boolean firstTime = false;
        for (String eachWord : eachWordArray) {
            tempLength = eachWord.length();
            if (firstTime == false) {
                firstTime = true;
                longestAndShortestWordInASentence.setShortestWordLength(tempLength);
                longestAndShortestWordInASentence.setShortestWord(eachWord);
                longestAndShortestWordInASentence.setLongestWordLength(tempLength);
                longestAndShortestWordInASentence.setLongestWord(eachWord);
            }

            if (tempLength > 0) {
                if (tempLength < longestAndShortestWordInASentence.getShortestWordLength()) {
                    longestAndShortestWordInASentence.setShortestWordLength(tempLength);
                    longestAndShortestWordInASentence.setShortestWord(eachWord);
                } else if (tempLength > longestAndShortestWordInASentence.getLongestWordLength()) {
                    longestAndShortestWordInASentence.setLongestWordLength(tempLength);
                    longestAndShortestWordInASentence.setLongestWord(eachWord);
                }
            }
        }

    }
}

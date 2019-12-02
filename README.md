# longest-shortest-word

  Write a method or function in the major programming language of your choice that returns the longest word in a sentence and its length. 
  For example, “The cow jumped over the moon.” should return “jumped” and 6. 
  Write unit tests, reworking code as needed Add a method that returns the shortest word and length with unit tests 
  Create a README documenting any assumptions you made and including instructions on how to build and execute your tests.  


Assumptions

	-	Only Valid String words would be given in the input
	-	If there is any recurrance the first occurance of the longest and shortest word would be returned and displayed.
	-	Null String and Empty or blank spaces are consider as 0 in length

Build

	-	This java project which can be easily imported into IntelliJ IDE as a maven project
	-	Then using the Maven Lifecylce Clean - Test - Install can be perfomed 
	-	After the install within the IDE the jar can be executed as a standalone JAR appication.
	-	Also have added a jar file for standalone exectuion location - longest-shortest-word/jar/longest-shortest-word-1.0-SNAPSHOT.jar

Junit

	-	Unit test can be ran indepedently using maven clean test or by loading the project into IDE and executing each test cases indepedently
	-	Test cases are written for getting both the shortest and longest word and its corresponding length
	
Algo/Method/Function 



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

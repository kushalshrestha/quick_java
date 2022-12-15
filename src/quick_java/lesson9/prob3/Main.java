package quick_java.lesson9.prob3;

import java.util.Arrays;
import java.util.List;

/*Task:
 * which counts the number of words in the input list words that have length equal to len, that
 * contain the character c, and that do not contain the character d. 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> wordList = Arrays.asList("cardio", "card", "cat", "gym", "container");
		long count = countWords(wordList, 'c', 'd', 3);
		System.out.println(count);
	}

	public static int countWords(List<String> words, char c, char d, int len) {
		return (int) words.stream().filter(x -> x.contains("" + c) && !x.contains("" + d) && x.length() == len).count();
	}

}

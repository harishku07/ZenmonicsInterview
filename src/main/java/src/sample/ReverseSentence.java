package src.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseSentence {

	public static void main(String[] args) {

		String sentence = "India is Best";
		String sentence = "India is Best";

		String[] words = sentence.split(" ");
		List<String> splitWords = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			String string = words[i];
			splitWords.add(string);
		}
		Collections.reverse(splitWords);
		String reverseSentence = "";
		for (String string : splitWords) {
			reverseSentence=reverseSentence+string+" ";
		}
		System.out.println(reverseSentence);
	}

}

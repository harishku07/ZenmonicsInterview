package src.sample;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Anagram {

	public LinkedHashMap<String, String> findAnagramWords(String paragraph) {

		String[] words = paragraph.split(" ");
		LinkedHashMap<String, String> anagramMatches = new LinkedHashMap<String, String>();
		for (String word1 : words) {
			for (String word2 : words) {
				if (word1.length() == word2.length()) {
					String sortedWord1 = "";
					String sortedWord2 = "";
					sortedWord1 = sortWord(sortedWord1);
					sortedWord2 = sortWord(sortedWord2);
					if (sortedWord1.equals(sortedWord2)) {
						anagramMatches.put(word1, word2);
					}
				}
			}
		}
		for (String string : anagramMatches.keySet()) {
			System.out.print(string);
			System.out.print(" == ");
			System.out.print(anagramMatches.get(string));
			System.out.println(" ");
		}
		return anagramMatches;
	}

	public String sortWord(String str) {

		char[] letters = str.toCharArray();
		char[] sortedletters = new char[letters.length];

		for (int i = 0; i < letters.length; i++) {
			int count = 0;
			for (int j = 0; j < letters.length; j++) {
				if (letters[i] < letters[j]) {
					count++;
				}
			}
			sortedletters[count] = letters[i];
		}
		String sorted = "";
		for (char c : sortedletters) {
			sorted = sorted + c;
		}
		return sorted;
	}

	public static void main(String[] args) {

		new Anagram().findAnagramWords("dsds sadsd asds adss");
	}
}

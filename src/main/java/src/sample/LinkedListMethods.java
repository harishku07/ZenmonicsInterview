package src.sample;

import java.util.LinkedList;

public class LinkedListMethods {
	public static void main(String[] args) {

		LinkedList<String> strings = new LinkedList<String>();

		strings.add("a");
		strings.add("b");
		strings.add("c");
		strings.add("d");
		strings.add("e");
		strings.add("f");
		strings.add("g");
		strings.add("f");
		strings.add("f1");

		
		strings.add("f1");
		String thirdElement = strings.get(strings.indexOf(strings.getLast()) - 2);
		System.out.println(thirdElement);
		String thirdElement1 = strings.get(strings.size() - 3);
		System.out.println(thirdElement1);
	}

}

package ua.com.rtim.anagram;

public class Anagram {
	public final String TEXT_DELIMETER = "";

	public String createAnagram(String text) {
		StringBuilder anagram = new StringBuilder();
		String[] words = text.split(TEXT_DELIMETER);
		for (String word : words) {
			anagram.append(reverseWord(word));
		}
		return anagram.toString();
	}

	private String reverseWord(String word) {
		char[] chars = word.toCharArray();
		int leftIndex = 0;
		int rightIndex = chars.length - 1;
		while (leftIndex < rightIndex) {
			if (!Character.isLetter(chars[rightIndex])) {
				rightIndex--;
			} else if (!Character.isLetter(chars[leftIndex])) {
				leftIndex++;
			} else {
				char symbol = chars[leftIndex];
				chars[leftIndex] = chars[rightIndex];
				chars[rightIndex] = symbol;
				leftIndex++;
				rightIndex--;
			}
		}
		return String.valueOf(chars);
	}
}

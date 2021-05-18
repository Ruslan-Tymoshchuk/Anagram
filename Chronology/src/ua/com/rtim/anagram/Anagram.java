package ua.com.rtim.anagram;

public class Anagram {

	public static final String TEXT_DELIMETER = " ";

	public String createAnagram(String text) {
		String[] words = text.split(TEXT_DELIMETER);
		int i = 0;
		for (String word : words) {
			words[i] = new StringBuilder(reverseWord(word)).toString();
			i++;
		}
		return String.join(TEXT_DELIMETER, words);
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

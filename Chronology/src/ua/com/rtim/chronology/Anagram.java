package ua.com.rtim.chronology;

public class Anagram {

	public String createAnagram(String text) {

		String anagram = "";
		String[] words = text.split(" ");
		for (String word : words) {
			String space = " ";
			anagram += reverseWord(word) + space;
		}

		return anagram;
	}

	private String reverseWord(String word) {

		char[] chars = word.toCharArray();
		int leftIndex = 0;
		int rightIndex = chars.length - 1;
		while (leftIndex < rightIndex) {
			if (Character.isLetter(chars[leftIndex]) &&
					(Character.isLetter(chars[rightIndex]))) {
				char array = chars[leftIndex];
				chars[leftIndex] = chars[rightIndex];
				chars[rightIndex] = array;
				leftIndex++;
				rightIndex--;
			} else if (Character.isLetter(chars[leftIndex]) && 
					(!Character.isLetter(chars[rightIndex]))) {
				rightIndex--;
			} else if (!Character.isLetter(chars[leftIndex]) &&
					(Character.isLetter(chars[rightIndex]))) {
				leftIndex++;
			} else {
				leftIndex++;
				rightIndex--;
			}
		}

		return String.valueOf(chars);
	}

}


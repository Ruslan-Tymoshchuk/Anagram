package ua.com.rtim.anagram;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		scanner.close();
		Anagram anagram = new Anagram();
		System.out.println("You'll get: " + anagram.createAnagram(text));
	}

}

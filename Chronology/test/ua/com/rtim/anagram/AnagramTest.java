package ua.com.rtim.anagram;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AnagramTest {

	@Test
	void createAnagram() {
		Anagram createAnagram = new Anagram();
		assertEquals("d1cba hgf!e", createAnagram.createAnagram("a1bcd efg!h"));
	}
}

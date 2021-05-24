package ua.com.rtim.anagram;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AnagramTest {

	public Anagram anagram = new Anagram();

	@Test
	void checkNull() {
		assertNotNull(anagram.createAnagram("text"));
	}

	@Test
	void checkEmpty() {
		assertNotEquals("", anagram.createAnagram("text"));
	}

	@Test
	void word() {
		assertEquals("dlrow", anagram.createAnagram("world"));
	}

	@Test
	void someNonLetter() {
		assertEquals("hgf!e", anagram.createAnagram("efg!h"));
	}

	@Test
	void nonLetter() {
		assertEquals("!1230!", anagram.createAnagram("!1230!"));
	}

	@Test
	void text() {
		assertEquals("dcba hgfe mlkji", anagram.createAnagram("abcd efgh ijklm"));
	}

	@Test
	void textSomeNonLetter() {
		assertEquals("olleh margan!a hgf!e", anagram.createAnagram("hello anagra!m efg!h"));
	}

	@Test
	void textNonLetter() {
		assertEquals("5454 1!234! 7887 3?4!5", anagram.createAnagram("5454 1!234! 7887 3?4!5"));
	}
}

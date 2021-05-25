package ua.com.rtim.anagram;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AnagramTest {

	Anagram anagram = new Anagram();

	@Test
	void givenNull_whenCreateAnagram_thenException() {
		Throwable exception = assertThrows(NullPointerException.class, () -> anagram.createAnagram(null));
		assertEquals(null, exception.getMessage());
	}

	@Test
	void givenEmptyString_whenCreateAnagram_thenEmptyString() {
		assertEquals("", anagram.createAnagram(""));
	}

	@Test
	void givenWord_whenCreateAnagram_thenReversedWord() {
		assertEquals("dlrow", anagram.createAnagram("world"));
	}

	@Test
	void givenSomeNonLetterWord_whenCreateAnagram_thenReversedLetterWord() {
		assertEquals("hgf!e", anagram.createAnagram("efg!h"));
	}

	@Test
	void givenNonLetterWord_whenCreateAnagram_thenNonLetterWord() {
		assertEquals("!1230!", anagram.createAnagram("!1230!"));
	}

	@Test
	void givenText_whenCreateAnagram_thenReversedText() {
		assertEquals("dcba hgfe mlkji", anagram.createAnagram("abcd efgh ijklm"));
	}

	@Test
	void givenSomeNonLetterText_whenCreateAnagram_thenReversedLetterText() {
		assertEquals("olleh margan!a hgf!e", anagram.createAnagram("hello anagra!m efg!h"));
	}

	@Test
	void givenNonLetterText_whenCreateAnagram_thenNonLetterText() {
		assertEquals("5454 1!234! 7887 3?4!5", anagram.createAnagram("5454 1!234! 7887 3?4!5"));
	}
}

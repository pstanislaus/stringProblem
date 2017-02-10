package com.apple.itunes.util;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/*Define a Java class to solve this problem:
Given a String and a Character, remove all instances of the Character in the String

Solve this two ways:
1. Iterate through the String, one character at a time
2. Find a method in the String class that can solve this in one line

Write methods for each solution.

Afterwards, write a TestNG or JUnit class for each solution which tests these methods.
Include both positive and negative cases for validations.*/

public class StringUtilsTest {

	@Test
	public void shouldRemoveCharOccurrencesFromString() throws Exception {
		String inputString = "TEST";
		String expectedResult = "ES";
		String actaulResult = StringUtils.removeChar(inputString, 'T');
		assertThat(actaulResult, is(equalTo(expectedResult)));
	}
	
	@Test
	public void OnlineCodeRemoveCharOccurrencesFromString() throws Exception {
		String inputString = "TEST";
		String expectedResult = "ES";
		String actaulResult = StringUtils.removeCharOneLine(inputString, 'T');
		assertThat(actaulResult, is(equalTo(expectedResult)));
	}
		
	@Test
	public void shouldNotRemoveCharOccurrencesFromString() throws Exception {
		String inputString = "TEST";
		String expectedResult = "TEST";
		String actaulResult = StringUtils.removeChar(inputString, 'A');
		assertThat(actaulResult, is(equalTo(expectedResult)));
	}
	
	@Test
	public void emptyCharOccurrencesFromString() throws Exception {
		String inputString = "TEST";
		String expectedResult = "TEST";
		String actaulResult = StringUtils.removeChar(inputString, ' ');
		assertThat(actaulResult, is(equalTo(expectedResult)));
	}
	
	@Test
	public void nullInputStringCheck() throws Exception {
		String inputString = null;
		String expectedResult = null;
		String actaulResult = StringUtils.removeChar(inputString, 'A');
		assertThat(actaulResult, is(equalTo(expectedResult)));
	}
}

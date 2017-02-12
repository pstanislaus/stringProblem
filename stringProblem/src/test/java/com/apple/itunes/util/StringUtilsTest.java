package com.apple.itunes.util;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void shouldRemoveCharOccurrencesFromString() throws Exception {
		String inputString = "TEST";
		String expectedResult = "es";
		String actualResult = StringUtils.removeChar(inputString, 'T');
		assertThat(actualResult, is(equalTo(expectedResult)));
	}
	
	@Test
	public void oneLineCodeRemoveCharOccurrencesFromString() throws Exception {
		String inputString = "TEST";
		String expectedResult = "es";
		String actualResult = StringUtils.removeCharOneLine(inputString, 'T');
		assertThat(actualResult, is(equalTo(expectedResult)));
	}
	
	@Test
	public void caseSensitiveTest() throws Exception {
		String inputString = "TESt";
		String expectedResult = "es";
		String actualResult = StringUtils.removeChar(inputString, 't');
		assertThat(actualResult, is(equalTo(expectedResult)));
	}
		
	@Test
	public void shouldNotRemoveCharOccurrencesFromString() throws Exception {
		String inputString = "TEST";
		String expectedResult = "test";
		String actualResult = StringUtils.removeChar(inputString, 'A');
		assertThat(actualResult, is(equalTo(expectedResult)));
	}
	
	@Test
	public void emptyCharOccurrencesFromString() throws Exception {
		String inputString = "TEST";
		String expectedResult = "test";
		String actualResult = StringUtils.removeChar(inputString, ' ');
		assertThat(actualResult, is(equalTo(expectedResult)));
	}
	
	@Test
	public void nullInputStringCheck() throws Exception {
		String inputString = null;
		String expectedResult = null;
		String actualResult = StringUtils.removeChar(inputString, 'A');
		assertThat(actualResult, is(equalTo(expectedResult)));
	}
	
	@Test
	public void emptyInputStringCheck() throws Exception {
		String inputString = "";
		String expectedResult = "";
		String actualResult = StringUtils.removeChar(inputString, 'z');
		assertThat(actualResult, is(equalTo(expectedResult)));
	}
	
	@Test
	public void specialCharInputStringCheck() throws Exception {
		String inputString = "!@#$%^&*()";
		String expectedResult = "!@#$^&*()";
		String actualResult = StringUtils.removeChar(inputString, '%');
		assertThat(actualResult, is(equalTo(expectedResult)));
	}
}

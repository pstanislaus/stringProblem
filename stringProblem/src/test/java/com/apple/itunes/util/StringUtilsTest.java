package com.apple.itunes.util;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

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

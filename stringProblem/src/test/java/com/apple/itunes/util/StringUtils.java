package com.apple.itunes.util;

public class StringUtils {

	public static String removeChar(final String str, final char charToRemove) {
		if (str == null)
			return null;
		final StringBuilder builder = new StringBuilder();
		for (char character : str.toCharArray()) {
			if (character != charToRemove) {
				builder.append(character);
			}
		}
		return builder.toString();
	}

	public static String removeCharOneLine(final String str, final char charToRemove) {
		if (str == null)
			return null;
		return str.replaceAll(String.valueOf(charToRemove), "");
	}

}

package com.apple.itunes.util;

public class StringUtils {

	public static String removeChar(final String str, final char charToRemove) {
		if (str == null)
			return null;
		char cLower = Character.toLowerCase(charToRemove);
		final StringBuilder builder = new StringBuilder();
		for (char character : str.toLowerCase().toCharArray()) {
			if (character != cLower) {
				builder.append(character);
			}
		}
		return builder.toString();
	}

	public static String removeCharOneLine(final String str, final char charToRemove) {
		if (str == null)
			return null;
		char cLower = Character.toLowerCase(charToRemove);
		return str.toLowerCase().replaceAll(String.valueOf(cLower), "");
	}

}

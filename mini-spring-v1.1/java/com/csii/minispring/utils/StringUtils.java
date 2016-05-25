package com.csii.minispring.utils;

public abstract class StringUtils {

	public static String cleanPath(String path) {

		int prefixIndex = path.indexOf(":");
		if (prefixIndex != -1) {
			path = path.substring(prefixIndex + 1);
		}
		return path;
	}

	/**
	 * genarate setter method by property name.
	 * @param prop, property name.
	 * @return ,setter method name.
	 */
	public static String prop2SetMethodName(String prop) {
		AssertUtils.notEmpty(prop, "prop must not be null or empty.");
		StringBuilder builder = new StringBuilder(prop);
		builder.setCharAt(0, Character.toUpperCase(builder.charAt(0)));
		return "set" + builder.toString();
	}
}

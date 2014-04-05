package by.falc0n.util;

/**
 * Contains a set of extension methods for working with strings.
 * 
 * @author falc0n
 * @version 1.0
 * 
 */
public final class StringExt {

	/**
	 * Checks whether the specified string value is blank: contains only
	 * whitespace characters or is empty. The value shouldn't be {@code null}.
	 * 
	 * @param value
	 *            - a string value to check
	 * @return {@code true} - if the value is blank; {@code false} - otherwise
	 * 
	 * @since 1.0
	 */
	public static final boolean isBlank(String value) {
		boolean blank = true;

		for (int i = 0; i < value.length(); i++) {
			if (!Character.isWhitespace(value.charAt(i))) {
				blank = false;
				break;
			}
		}
		return blank;
	}

	private StringExt() {
		super();
	}

}

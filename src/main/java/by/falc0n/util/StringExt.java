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
	 * Trims the specified string value. If the result is an empty string -
	 * returns {@code null} instead. The value can be {@code null}.
	 * 
	 * @param value
	 *            - a string value to trim
	 * @return a trimmed value or {@code null}
	 * 
	 * @since 1.0
	 */
	public static final String trimToNull(String value) {
		if (value != null) {
			value = value.trim();
			value = (value.equals("")) ? null : value;
		}
		return value;
	}

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

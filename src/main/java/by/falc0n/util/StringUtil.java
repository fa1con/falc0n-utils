package by.falc0n.util;

/**
 * Contains a set of utility methods for working with java strings.
 * 
 * @author falc0n
 * @version 1.0
 * 
 */
public final class StringUtil {

	/**
	 * Checks whether the specified value is blank: contains only whitespace
	 * characters.
	 * 
	 * @param value
	 *            - a value to check
	 * @return {@code true} - if the value is blank; {@code false} - otherwise
	 * 
	 * @since 1.0
	 */
	public static final boolean isBlank(CharSequence value) {
		boolean blank = true;
		int length = value.length();

		for (int i = 0; i < length; i++) {
			if (!Character.isWhitespace(value.charAt(i))) {
				blank = false;
				break;
			}
		}
		return blank;
	}

	private StringUtil() {
		super();
	}

}

package by.falc0n.util;

/**
 * Contains a set of extension methods related to pure operations with objects.
 * 
 * @author falc0n
 * @version 1.0
 * 
 */
public final class ObjectExt {

	/**
	 * Checks whether the specified objects are equal or both {@code null}.
	 * 
	 * @param obj1
	 *            - the first object
	 * @param obj2
	 *            - the second object
	 * @return {@code true} - if the objects are equal or both {@code null};
	 *         {@code false} - otherwise
	 * 
	 * @since 1.0
	 */
	public static final boolean equalOrNull(Object obj1, Object obj2) {
		return ((obj1 != null) && (obj2 != null)) ? obj1.equals(obj2)
				: (obj1 == obj2);
	}

	private ObjectExt() {
		super();
	}

}

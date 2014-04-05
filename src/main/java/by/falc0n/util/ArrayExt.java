package by.falc0n.util;

/**
 * Contains a set of extension methods and constants to operate with arrays
 * (primitive and object).
 * 
 * @author falc0n
 * @version 1.0
 * 
 */
public final class ArrayExt {

	/**
	 * An empty {@code byte} array.
	 * 
	 * @since 1.0
	 */
	public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

	/**
	 * An empty {@code short} array.
	 * 
	 * @since 1.0
	 */
	public static final short[] EMPTY_SHORT_ARRAY = new short[0];

	/**
	 * An empty {@code int} array.
	 * 
	 * @since 1.0
	 */
	public static final int[] EMPTY_INT_ARRAY = new int[0];

	/**
	 * An empty {@code long} array.
	 * 
	 * @since 1.0
	 */
	public static final long[] EMPTY_LONG_ARRAY = new long[0];

	/**
	 * An empty {@code float} array.
	 * 
	 * @since 1.0
	 */
	public static final float[] EMPTY_FLOAT_ARRAY = new float[0];

	/**
	 * An empty {@code double} array.
	 * 
	 * @since 1.0
	 */
	public static final double[] EMPTY_DOUBLE_ARRAY = new double[0];

	/**
	 * An empty {@code char} array.
	 * 
	 * @since 1.0
	 */
	public static final char[] EMPTY_CHAR_ARRAY = new char[0];

	/**
	 * An empty {@code boolean} array.
	 * 
	 * @since 1.0
	 */
	public static final boolean[] EMPTY_BOOLEAN_ARRAY = new boolean[0];

	/**
	 * An empty {@link Byte} array.
	 * 
	 * @since 1.0
	 */
	public static final Byte[] EMPTY_BYTE_OBJECT_ARRAY = new Byte[0];

	/**
	 * An empty {@link Short} array.
	 * 
	 * @since 1.0
	 */
	public static final Short[] EMPTY_SHORT_OBJECT_ARRAY = new Short[0];

	/**
	 * An empty {@link Integer} array.
	 * 
	 * @since 1.0
	 */
	public static final Integer[] EMPTY_INT_OBJECT_ARRAY = new Integer[0];

	/**
	 * An empty {@link Long} array.
	 * 
	 * @since 1.0
	 */
	public static final Long[] EMPTY_LONG_OBJECT_ARRAY = new Long[0];

	/**
	 * An empty {@link Float} array.
	 * 
	 * @since 1.0
	 */
	public static final Float[] EMPTY_FLOAT_OBJECT_ARRAY = new Float[0];

	/**
	 * An empty {@link Double} array.
	 * 
	 * @since 1.0
	 */
	public static final Double[] EMPTY_DOUBLE_OBJECT_ARRAY = new Double[0];

	/**
	 * An empty {@link Character} array.
	 * 
	 * @since 1.0
	 */
	public static final Character[] EMPTY_CHAR_OBJECT_ARRAY = new Character[0];

	/**
	 * An empty {@link Boolean} array.
	 * 
	 * @since 1.0
	 */
	public static final Boolean[] EMPTY_BOOLEAN_OBJECT_ARRAY = new Boolean[0];

	/**
	 * An empty object array.
	 * 
	 * @since 1.0
	 */
	public static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];

	/**
	 * Checks whether the {@code byte} array contains the specified value. The
	 * array shouldn't be {@code null}.
	 * 
	 * @param array
	 *            - an array to check
	 * @param value
	 *            - a value to search for
	 * @return {@code true} - if the array contains the value; {@code false} -
	 *         otherwise
	 * 
	 * @since 1.0
	 */
	public static final boolean contains(byte[] array, byte value) {
		boolean result = false;

		for (int i = 0; i < array.length; i++) {
			if (value == array[i]) {
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * Checks whether the {@code short} array contains the specified value. The
	 * array shouldn't be {@code null}.
	 * 
	 * @param array
	 *            - an array to check
	 * @param value
	 *            - a value to search for
	 * @return {@code true} - if the array contains the value; {@code false} -
	 *         otherwise
	 * 
	 * @since 1.0
	 */
	public static final boolean contains(short[] array, short value) {
		boolean result = false;

		for (int i = 0; i < array.length; i++) {
			if (value == array[i]) {
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * Checks whether the {@code int} array contains the specified value. The
	 * array shouldn't be {@code null}.
	 * 
	 * @param array
	 *            - an array to check
	 * @param value
	 *            - a value to search for
	 * @return {@code true} - if the array contains the value; {@code false} -
	 *         otherwise
	 * 
	 * @since 1.0
	 */
	public static final boolean contains(int[] array, int value) {
		boolean result = false;

		for (int i = 0; i < array.length; i++) {
			if (value == array[i]) {
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * Checks whether the {@code long} array contains the specified value. The
	 * array shouldn't be {@code null}.
	 * 
	 * @param array
	 *            - an array to check
	 * @param value
	 *            - a value to search for
	 * @return {@code true} - if the array contains the value; {@code false} -
	 *         otherwise
	 * 
	 * @since 1.0
	 */
	public static final boolean contains(long[] array, long value) {
		boolean result = false;

		for (int i = 0; i < array.length; i++) {
			if (value == array[i]) {
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * Checks whether the {@code float} array contains the specified value. The
	 * array shouldn't be {@code null}.
	 * 
	 * @param array
	 *            - an array to check
	 * @param value
	 *            - a value to search for
	 * @return {@code true} - if the array contains the value; {@code false} -
	 *         otherwise
	 * 
	 * @since 1.0
	 */
	public static final boolean contains(float[] array, float value) {
		boolean result = false;

		for (int i = 0; i < array.length; i++) {
			if (value == array[i]) {
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * Checks whether the {@code double} array contains the specified value. The
	 * array shouldn't be {@code null}.
	 * 
	 * @param array
	 *            - an array to check
	 * @param value
	 *            - a value to search for
	 * @return {@code true} - if the array contains the value; {@code false} -
	 *         otherwise
	 * 
	 * @since 1.0
	 */
	public static final boolean contains(double[] array, double value) {
		boolean result = false;

		for (int i = 0; i < array.length; i++) {
			if (value == array[i]) {
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * Checks whether the {@code char} array contains the specified value. The
	 * array shouldn't be {@code null}.
	 * 
	 * @param array
	 *            - an array to check
	 * @param value
	 *            - a value to search for
	 * @return {@code true} - if the array contains the value; {@code false} -
	 *         otherwise
	 * 
	 * @since 1.0
	 */
	public static final boolean contains(char[] array, char value) {
		boolean result = false;

		for (int i = 0; i < array.length; i++) {
			if (value == array[i]) {
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * Checks whether the {@code boolean} array contains the specified value.
	 * The array shouldn't be {@code null}.
	 * 
	 * @param array
	 *            - an array to check
	 * @param value
	 *            - a value to search for
	 * @return {@code true} - if the array contains the value; {@code false} -
	 *         otherwise
	 * 
	 * @since 1.0
	 */
	public static final boolean contains(boolean[] array, boolean value) {
		boolean result = false;

		for (int i = 0; i < array.length; i++) {
			if (value == array[i]) {
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * Checks whether the object array contains the specified value. "Contains"
	 * means that the array has an element which equals (see
	 * {@link #equals(Object)} ) to the value or they're both {@code null}. The
	 * array shouldn't be {@code null}.
	 * 
	 * @param array
	 *            - an array to check
	 * @param value
	 *            - a value to search for
	 * @return {@code true} - if the array contains the value; {@code false} -
	 *         otherwise
	 * 
	 * @since 1.0
	 */
	public static final boolean contains(Object[] array, Object value) {
		boolean result = false;

		for (int i = 0; i < array.length; i++) {
			if (ObjectExt.equalOrNull(array[i], value)) {
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * Converts the {@code byte} array to an array of corresponding objects. If
	 * the input array is {@code null}, then {@code null} will be returned.
	 * 
	 * @param array
	 *            - an array to convert
	 * @return an array of objects or {@code null}
	 * 
	 * @since 1.0
	 */
	public static final Byte[] toObjectArray(byte[] array) {
		Byte[] objArray = null;

		if (array != null) {
			if (array.length > 0) {
				objArray = new Byte[array.length];
				for (int i = 0; i < array.length; i++) {
					objArray[i] = array[i];
				}
			} else {
				objArray = EMPTY_BYTE_OBJECT_ARRAY;
			}
		}
		return objArray;
	}

	/**
	 * Converts the {@code short} array to an array of corresponding objects. If
	 * the input array is {@code null}, then {@code null} will be returned.
	 * 
	 * @param array
	 *            - an array to convert
	 * @return an array of objects or {@code null}
	 * 
	 * @since 1.0
	 */
	public static final Short[] toObjectArray(short[] array) {
		Short[] objArray = null;

		if (array != null) {
			if (array.length > 0) {
				objArray = new Short[array.length];
				for (int i = 0; i < array.length; i++) {
					objArray[i] = array[i];
				}
			} else {
				objArray = EMPTY_SHORT_OBJECT_ARRAY;
			}
		}
		return objArray;
	}

	/**
	 * Converts the {@code int} array to an array of corresponding objects. If
	 * the input array is {@code null}, then {@code null} will be returned.
	 * 
	 * @param array
	 *            - an array to convert
	 * @return an array of objects or {@code null}
	 * 
	 * @since 1.0
	 */
	public static final Integer[] toObjectArray(int[] array) {
		Integer[] objArray = null;

		if (array != null) {
			if (array.length > 0) {
				objArray = new Integer[array.length];
				for (int i = 0; i < array.length; i++) {
					objArray[i] = array[i];
				}
			} else {
				objArray = EMPTY_INT_OBJECT_ARRAY;
			}
		}
		return objArray;
	}

	/**
	 * Converts the {@code long} array to an array of corresponding objects. If
	 * the input array is {@code null}, then {@code null} will be returned.
	 * 
	 * @param array
	 *            - an array to convert
	 * @return an array of objects or {@code null}
	 * 
	 * @since 1.0
	 */
	public static final Long[] toObjectArray(long[] array) {
		Long[] objArray = null;

		if (array != null) {
			if (array.length > 0) {
				objArray = new Long[array.length];
				for (int i = 0; i < array.length; i++) {
					objArray[i] = array[i];
				}
			} else {
				objArray = EMPTY_LONG_OBJECT_ARRAY;
			}
		}
		return objArray;
	}

	/**
	 * Converts the {@code float} array to an array of corresponding objects. If
	 * the input array is {@code null}, then {@code null} will be returned.
	 * 
	 * @param array
	 *            - an array to convert
	 * @return an array of objects or {@code null}
	 * 
	 * @since 1.0
	 */
	public static final Float[] toObjectArray(float[] array) {
		Float[] objArray = null;

		if (array != null) {
			if (array.length > 0) {
				objArray = new Float[array.length];
				for (int i = 0; i < array.length; i++) {
					objArray[i] = array[i];
				}
			} else {
				objArray = EMPTY_FLOAT_OBJECT_ARRAY;
			}
		}
		return objArray;
	}

	/**
	 * Converts the {@code double} array to an array of corresponding objects.
	 * If the input array is {@code null}, then {@code null} will be returned.
	 * 
	 * @param array
	 *            - an array to convert
	 * @return an array of objects or {@code null}
	 * 
	 * @since 1.0
	 */
	public static final Double[] toObjectArray(double[] array) {
		Double[] objArray = null;

		if (array != null) {
			if (array.length > 0) {
				objArray = new Double[array.length];
				for (int i = 0; i < array.length; i++) {
					objArray[i] = array[i];
				}
			} else {
				objArray = EMPTY_DOUBLE_OBJECT_ARRAY;
			}
		}
		return objArray;
	}

	/**
	 * Converts the {@code char} array to an array of corresponding objects. If
	 * the input array is {@code null}, then {@code null} will be returned.
	 * 
	 * @param array
	 *            - an array to convert
	 * @return an array of objects or {@code null}
	 * 
	 * @since 1.0
	 */
	public static final Character[] toObjectArray(char[] array) {
		Character[] objArray = null;

		if (array != null) {
			if (array.length > 0) {
				objArray = new Character[array.length];
				for (int i = 0; i < array.length; i++) {
					objArray[i] = array[i];
				}
			} else {
				objArray = EMPTY_CHAR_OBJECT_ARRAY;
			}
		}
		return objArray;
	}

	/**
	 * Converts the {@code boolean} array to an array of corresponding objects.
	 * If the input array is {@code null}, then {@code null} will be returned.
	 * 
	 * @param array
	 *            - an array to convert
	 * @return an array of objects or {@code null}
	 * 
	 * @since 1.0
	 */
	public static final Boolean[] toObjectArray(boolean[] array) {
		Boolean[] objArray = null;

		if (array != null) {
			if (array.length > 0) {
				objArray = new Boolean[array.length];
				for (int i = 0; i < array.length; i++) {
					objArray[i] = array[i];
				}
			} else {
				objArray = EMPTY_BOOLEAN_OBJECT_ARRAY;
			}
		}
		return objArray;
	}
	
	public static final byte[] toPrimitiveArray(Byte[] array) {
		byte[] primArray = null;

		if (array != null) {
			if (array.length > 0) {
				primArray = new byte[array.length];
				for (int i = 0; i < array.length; i++) {
					primArray[i] = array[i];
				}
			} else {
				primArray = EMPTY_BYTE_ARRAY;
			}
		}
		return primArray;
	}

	public static final byte[] toPrimitiveArray(Byte[] array, byte nullValue) {
		byte[] primArray = null;

		if (array != null) {
			if (array.length > 0) {
				primArray = new byte[array.length];
				for (int i = 0; i < array.length; i++) {
					primArray[i] = (array[i] != null) ? array[i] : nullValue;
				}
			} else {
				primArray = EMPTY_BYTE_ARRAY;
			}
		}
		return primArray;
	}

	private ArrayExt() {
		super();
	}

}

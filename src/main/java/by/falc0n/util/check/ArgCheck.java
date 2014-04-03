package by.falc0n.util.check;

import by.falc0n.util.ArrayUtil;
import by.falc0n.util.StringUtil;



/**
 * Contains a set of utility methods to validate arguments. All the methods are
 * intended to throw an {@link IllegalArgumentException} exception if a
 * validation condition of a method is not met.
 * 
 * @author falc0n
 * @version 1.0
 * 
 */
public final class ArgCheck {

	public static final void condition(boolean result, String msg) {
		if (!result) {
			throw new IllegalArgumentException(msg);
		}
	}

	public static final void condition(boolean result, String msg, byte arg) {
		if (!result) {
			throw new IllegalArgumentException(String.format(msg, arg));
		}
	}

	public static final void condition(boolean result, String msg, byte... args) {
		if (!result) {
			throw new IllegalArgumentException(String.format(msg,
					(Object[]) ArrayUtil.toObjArray(args)));
		}
	}

	public static final void condition(boolean result, String msg, short arg) {
		if (!result) {
			throw new IllegalArgumentException(String.format(msg, arg));
		}
	}

	public static final void condition(boolean result, String msg,
			short... args) {
		if (!result) {
			throw new IllegalArgumentException(String.format(msg,
					(Object[]) ArrayUtil.toObjArray(args)));
		}
	}

	public static final void condition(boolean result, String msg, int arg) {
		if (!result) {
			throw new IllegalArgumentException(String.format(msg, arg));
		}
	}

	public static final void condition(boolean result, String msg, int... args) {
		if (!result) {
			throw new IllegalArgumentException(String.format(msg,
					(Object[]) ArrayUtil.toObjArray(args)));
		}
	}

	public static final void condition(boolean result, String msg, long arg) {
		if (!result) {
			throw new IllegalArgumentException(String.format(msg, arg));
		}
	}

	public static final void condition(boolean result, String msg, long... args) {
		if (!result) {
			throw new IllegalArgumentException(String.format(msg,
					(Object[]) ArrayUtil.toObjArray(args)));
		}
	}

	public static final void condition(boolean result, String msg, float arg) {
		if (!result) {
			throw new IllegalArgumentException(String.format(msg, arg));
		}
	}

	public static final void condition(boolean result, String msg,
			float... args) {
		if (!result) {
			throw new IllegalArgumentException(String.format(msg,
					(Object[]) ArrayUtil.toObjArray(args)));
		}
	}

	public static final void condition(boolean result, String msg, double arg) {
		if (!result) {
			throw new IllegalArgumentException(String.format(msg, arg));
		}
	}

	public static final void condition(boolean result, String msg,
			double... args) {
		if (!result) {
			throw new IllegalArgumentException(String.format(msg,
					(Object[]) ArrayUtil.toObjArray(args)));
		}
	}

	public static final void condition(boolean result, String msg, char arg) {
		if (!result) {
			throw new IllegalArgumentException(String.format(msg, arg));
		}
	}

	public static final void condition(boolean result, String msg, char... args) {
		if (!result) {
			throw new IllegalArgumentException(String.format(msg,
					(Object[]) ArrayUtil.toObjArray(args)));
		}
	}

	public static final void objCondition(boolean result, String msg, Object arg) {
		if (!result) {
			throw new IllegalArgumentException(String.format(msg, arg));
		}
	}

	public static final void objCondition(boolean result, String msg,
			Object... args) {
		if (!result) {
			throw new IllegalArgumentException(String.format(msg, args));
		}
	}

	public static final void min(byte arg, byte min, String msg) {
		if (arg < min) {
			throw new IllegalArgumentException(String.format(msg, arg, min));
		}
	}

	public static final void min(short arg, short min, String msg) {
		if (arg < min) {
			throw new IllegalArgumentException(String.format(msg, arg, min));
		}
	}

	public static final void min(int arg, int min, String msg) {
		if (arg < min) {
			throw new IllegalArgumentException(String.format(msg, arg, min));
		}
	}

	public static final void min(long arg, long min, String msg) {
		if (arg < min) {
			throw new IllegalArgumentException(String.format(msg, arg, min));
		}
	}

	public static final void min(float arg, float min, String msg) {
		if (arg < min) {
			throw new IllegalArgumentException(String.format(msg, arg, min));
		}
	}

	public static final void min(double arg, double min, String msg) {
		if (arg < min) {
			throw new IllegalArgumentException(String.format(msg, arg, min));
		}
	}

	public static final void min(char arg, char min, String msg) {
		if (arg < min) {
			throw new IllegalArgumentException(String.format(msg, arg, min));
		}
	}

	public static final <T> void min(Comparable<T> arg, T min, String msg) {
		if (arg.compareTo(min) < 0) {
			throw new IllegalArgumentException(String.format(msg, arg, min));
		}
	}

	public static final void min(byte[] arg, byte min, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] < min) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						min, i));
			}
		}
	}

	public static final void min(short[] arg, short min, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] < min) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						min, i));
			}
		}
	}

	public static final void min(int[] arg, int min, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] < min) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						min, i));
			}
		}
	}

	public static final void min(long[] arg, long min, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] < min) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						min, i));
			}
		}
	}

	public static final void min(float[] arg, float min, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] < min) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						min, i));
			}
		}
	}

	public static final void min(double[] arg, double min, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] < min) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						min, i));
			}
		}
	}

	public static final void min(char[] arg, char min, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] < min) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						min, i));
			}
		}
	}

	public static final <T> void min(Comparable<T>[] arg, T min, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i].compareTo(min) < 0) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						min, i));
			}
		}
	}

	public static final <T> void min(Iterable<? extends Comparable<T>> arg,
			T min, String msg) {
		int i = 0;

		for (Comparable<T> element : arg) {
			if (element.compareTo(min) < 0) {
				throw new IllegalArgumentException(String.format(msg, element,
						min, i));
			}
			i++;
		}
	}

	public static final void max(byte arg, byte max, String msg) {
		if (arg > max) {
			throw new IllegalArgumentException(String.format(msg, arg, max));
		}
	}

	public static final void max(short arg, short max, String msg) {
		if (arg > max) {
			throw new IllegalArgumentException(String.format(msg, arg, max));
		}
	}

	public static final void max(int arg, int max, String msg) {
		if (arg > max) {
			throw new IllegalArgumentException(String.format(msg, arg, max));
		}
	}

	public static final void max(long arg, long max, String msg) {
		if (arg > max) {
			throw new IllegalArgumentException(String.format(msg, arg, max));
		}
	}

	public static final void max(float arg, float max, String msg) {
		if (arg > max) {
			throw new IllegalArgumentException(String.format(msg, arg, max));
		}
	}

	public static final void max(double arg, double max, String msg) {
		if (arg > max) {
			throw new IllegalArgumentException(String.format(msg, arg, max));
		}
	}

	public static final void max(char arg, char max, String msg) {
		if (arg > max) {
			throw new IllegalArgumentException(String.format(msg, arg, max));
		}
	}

	public static final <T> void max(Comparable<T> arg, T max, String msg) {
		if (arg.compareTo(max) > 0) {
			throw new IllegalArgumentException(String.format(msg, arg, max));
		}
	}

	public static final void max(byte[] arg, byte max, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] > max) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						max, i));
			}
		}
	}

	public static final void max(short[] arg, short max, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] > max) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						max, i));
			}
		}
	}

	public static final void max(int[] arg, int max, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] > max) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						max, i));
			}
		}
	}

	public static final void max(long[] arg, long max, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] > max) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						max, i));
			}
		}
	}

	public static final void max(float[] arg, float max, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] > max) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						max, i));
			}
		}
	}

	public static final void max(double[] arg, double max, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] > max) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						max, i));
			}
		}
	}

	public static final void max(char[] arg, char max, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] > max) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						max, i));
			}
		}
	}

	public static final <T> void max(Comparable<T>[] arg, T max, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i].compareTo(max) > 0) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						max, i));
			}
		}
	}

	public static final <T> void max(Iterable<? extends Comparable<T>> arg,
			T max, String msg) {
		int i = 0;

		for (Comparable<T> element : arg) {
			if (element.compareTo(max) > 0) {
				throw new IllegalArgumentException(String.format(msg, element,
						max, i));
			}
			i++;
		}
	}

	public static final void less(byte arg, byte greater, String msg) {
		if (arg >= greater) {
			throw new IllegalArgumentException(String.format(msg, arg, greater));
		}
	}

	public static final void less(short arg, short greater, String msg) {
		if (arg >= greater) {
			throw new IllegalArgumentException(String.format(msg, arg, greater));
		}
	}

	public static final void less(int arg, int greater, String msg) {
		if (arg >= greater) {
			throw new IllegalArgumentException(String.format(msg, arg, greater));
		}
	}

	public static final void less(long arg, long greater, String msg) {
		if (arg >= greater) {
			throw new IllegalArgumentException(String.format(msg, arg, greater));
		}
	}

	public static final void less(float arg, float greater, String msg) {
		if (arg >= greater) {
			throw new IllegalArgumentException(String.format(msg, arg, greater));
		}
	}

	public static final void less(double arg, double greater, String msg) {
		if (arg >= greater) {
			throw new IllegalArgumentException(String.format(msg, arg, greater));
		}
	}

	public static final void less(char arg, char greater, String msg) {
		if (arg >= greater) {
			throw new IllegalArgumentException(String.format(msg, arg, greater));
		}
	}

	public static final <T> void less(Comparable<T> arg, T greater, String msg) {
		if (arg.compareTo(greater) >= 0) {
			throw new IllegalArgumentException(String.format(msg, arg, greater));
		}
	}

	public static final void less(byte[] arg, byte greater, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] >= greater) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						greater, i));
			}
		}
	}

	public static final void less(short[] arg, short greater, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] >= greater) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						greater, i));
			}
		}
	}

	public static final void less(int[] arg, int greater, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] >= greater) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						greater, i));
			}
		}
	}

	public static final void less(long[] arg, long greater, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] >= greater) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						greater, i));
			}
		}
	}

	public static final void less(float[] arg, float greater, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] >= greater) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						greater, i));
			}
		}
	}

	public static final void less(double[] arg, double greater, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] >= greater) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						greater, i));
			}
		}
	}

	public static final void less(char[] arg, char greater, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] >= greater) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						greater, i));
			}
		}
	}

	public static final <T> void less(Comparable<T>[] arg, T greater, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i].compareTo(greater) >= 0) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						greater, i));
			}
		}
	}

	public static final <T> void less(Iterable<? extends Comparable<T>> arg,
			T greater, String msg) {
		int i = 0;

		for (Comparable<T> element : arg) {
			if (element.compareTo(greater) >= 0) {
				throw new IllegalArgumentException(String.format(msg, element,
						greater, i));
			}
			i++;
		}
	}

	public static final void greater(byte arg, byte less, String msg) {
		if (arg <= less) {
			throw new IllegalArgumentException(String.format(msg, arg, less));
		}
	}

	public static final void greater(short arg, short less, String msg) {
		if (arg <= less) {
			throw new IllegalArgumentException(String.format(msg, arg, less));
		}
	}

	public static final void greater(int arg, int less, String msg) {
		if (arg <= less) {
			throw new IllegalArgumentException(String.format(msg, arg, less));
		}
	}

	public static final void greater(long arg, long less, String msg) {
		if (arg <= less) {
			throw new IllegalArgumentException(String.format(msg, arg, less));
		}
	}

	public static final void greater(float arg, float less, String msg) {
		if (arg <= less) {
			throw new IllegalArgumentException(String.format(msg, arg, less));
		}
	}

	public static final void greater(double arg, double less, String msg) {
		if (arg <= less) {
			throw new IllegalArgumentException(String.format(msg, arg, less));
		}
	}

	public static final void greater(char arg, char less, String msg) {
		if (arg <= less) {
			throw new IllegalArgumentException(String.format(msg, arg, less));
		}
	}

	public static final <T> void greater(Comparable<T> arg, T less, String msg) {
		if (arg.compareTo(less) <= 0) {
			throw new IllegalArgumentException(String.format(msg, arg, less));
		}
	}

	public static final void greater(byte[] arg, byte less, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] <= less) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						less, i));
			}
		}
	}

	public static final void greater(short[] arg, short less, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] <= less) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						less, i));
			}
		}
	}

	public static final void greater(int[] arg, int less, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] <= less) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						less, i));
			}
		}
	}

	public static final void greater(long[] arg, long less, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] <= less) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						less, i));
			}
		}
	}

	public static final void greater(float[] arg, float less, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] <= less) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						less, i));
			}
		}
	}

	public static final void greater(double[] arg, double less, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] <= less) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						less, i));
			}
		}
	}

	public static final void greater(char[] arg, char less, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i] <= less) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						less, i));
			}
		}
	}

	public static final <T> void greater(Comparable<T>[] arg, T less, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if (arg[i].compareTo(less) <= 0) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						less, i));
			}
		}
	}

	public static final <T> void greater(Iterable<? extends Comparable<T>> arg,
			T less, String msg) {
		int i = 0;

		for (Comparable<T> element : arg) {
			if (element.compareTo(less) <= 0) {
				throw new IllegalArgumentException(String.format(msg, element,
						less, i));
			}
			i++;
		}
	}

	public static final void unequal(byte arg, byte value, String msg) {
		if (arg == value) {
			throw new IllegalArgumentException(String.format(msg, arg, value));
		}
	}

	public static final void unequal(short arg, short value, String msg) {
		if (arg == value) {
			throw new IllegalArgumentException(String.format(msg, arg, value));
		}
	}

	public static final void unequal(int arg, int value, String msg) {
		if (arg == value) {
			throw new IllegalArgumentException(String.format(msg, arg, value));
		}
	}

	public static final void unequal(long arg, long value, String msg) {
		if (arg == value) {
			throw new IllegalArgumentException(String.format(msg, arg, value));
		}
	}

	public static final void unequal(float arg, float value, String msg) {
		if (arg == value) {
			throw new IllegalArgumentException(String.format(msg, arg, value));
		}
	}

	public static final void unequal(double arg, double value, String msg) {
		if (arg == value) {
			throw new IllegalArgumentException(String.format(msg, arg, value));
		}
	}

	public static final void unequal(char arg, char value, String msg) {
		if (arg == value) {
			throw new IllegalArgumentException(String.format(msg, arg, value));
		}
	}

	public static final void unequal(Object arg, Object value, String msg) {
		if (arg.equals(value)) {
			throw new IllegalArgumentException(String.format(msg, arg, value));
		}
	}
	
	/*
	public static final void unequal(byte arg, String msg, byte... values) {
		if (ArrayUtil.contains(values, arg)) {
			throw new IllegalArgumentException(String.format(msg, arg,
					(Object[]) ArrayUtil.toObjArray(values))); // Doesn't work: ArrayUtil.add needed
		}
	}
   */

	public static final void range(byte arg, byte min, byte max, String msg) {
		if ((arg < min) || (arg > max)) {
			throw new IllegalArgumentException(
					String.format(msg, arg, min, max));
		}
	}

	public static final void range(short arg, short min, short max, String msg) {
		if ((arg < min) || (arg > max)) {
			throw new IllegalArgumentException(
					String.format(msg, arg, min, max));
		}
	}

	public static final void range(int arg, int min, int max, String msg) {
		if ((arg < min) || (arg > max)) {
			throw new IllegalArgumentException(
					String.format(msg, arg, min, max));
		}
	}

	public static final void range(long arg, long min, long max, String msg) {
		if ((arg < min) || (arg > max)) {
			throw new IllegalArgumentException(
					String.format(msg, arg, min, max));
		}
	}

	public static final void range(float arg, float min, float max, String msg) {
		if ((arg < min) || (arg > max)) {
			throw new IllegalArgumentException(
					String.format(msg, arg, min, max));
		}
	}

	public static final void range(double arg, double min, double max,
			String msg) {
		if ((arg < min) || (arg > max)) {
			throw new IllegalArgumentException(
					String.format(msg, arg, min, max));
		}
	}

	public static final void range(char arg, char min, char max, String msg) {
		if ((arg < min) || (arg > max)) {
			throw new IllegalArgumentException(
					String.format(msg, arg, min, max));
		}
	}

	public static final <T> void range(Comparable<T> arg, T min, T max,
			String msg) {
		if ((arg.compareTo(min) < 0) || (arg.compareTo(max) > 0)) {
			throw new IllegalArgumentException(
					String.format(msg, arg, min, max));
		}
	}

	public static final void range(byte[] arg, byte min, byte max, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if ((arg[i] < min) || (arg[i] > max)) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						min, max, i));
			}
		}
	}

	public static final void range(short[] arg, short min, short max, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if ((arg[i] < min) || (arg[i] > max)) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						min, max, i));
			}
		}
	}

	public static final void range(int[] arg, int min, int max, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if ((arg[i] < min) || (arg[i] > max)) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						min, max, i));
			}
		}
	}

	public static final void range(long[] arg, long min, long max, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if ((arg[i] < min) || (arg[i] > max)) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						min, max, i));
			}
		}
	}

	public static final void range(float[] arg, float min, float max, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if ((arg[i] < min) || (arg[i] > max)) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						min, max, i));
			}
		}
	}

	public static final void range(double[] arg, double min, double max,
			String msg) {
		for (int i = 0; i < arg.length; i++) {
			if ((arg[i] < min) || (arg[i] > max)) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						min, max, i));
			}
		}
	}

	public static final void range(char[] arg, char min, char max, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if ((arg[i] < min) || (arg[i] > max)) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						min, max, i));
			}
		}
	}

	public static final <T> void range(Comparable<T>[] arg, T min, T max,
			String msg) {
		for (int i = 0; i < arg.length; i++) {
			if ((arg[i].compareTo(min) < 0) || (arg[i].compareTo(max) > 0)) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						min, max, i));
			}
		}
	}

	public static final <T> void range(Iterable<? extends Comparable<T>> arg,
			T min, T max, String msg) {
		int i = 0;

		for (Comparable<T> element : arg) {
			if ((element.compareTo(min) < 0) || (element.compareTo(max) > 0)) {
				throw new IllegalArgumentException(String.format(msg, element,
						min, max, i));
			}
			i++;
		}
	}

	public static final void between(byte arg, byte less, byte greater,
			String msg) {
		if ((arg <= less) || (arg >= greater)) {
			throw new IllegalArgumentException(String.format(msg, arg, less,
					greater));
		}
	}

	public static final void between(short arg, short less, short greater,
			String msg) {
		if ((arg <= less) || (arg >= greater)) {
			throw new IllegalArgumentException(String.format(msg, arg, less,
					greater));
		}
	}

	public static final void between(int arg, int less, int greater, String msg) {
		if ((arg <= less) || (arg >= greater)) {
			throw new IllegalArgumentException(String.format(msg, arg, less,
					greater));
		}
	}

	public static final void between(long arg, long less, long greater,
			String msg) {
		if ((arg <= less) || (arg >= greater)) {
			throw new IllegalArgumentException(String.format(msg, arg, less,
					greater));
		}
	}

	public static final void between(float arg, float less, float greater,
			String msg) {
		if ((arg <= less) || (arg >= greater)) {
			throw new IllegalArgumentException(String.format(msg, arg, less,
					greater));
		}
	}

	public static final void between(double arg, double less, double greater,
			String msg) {
		if ((arg <= less) || (arg >= greater)) {
			throw new IllegalArgumentException(String.format(msg, arg, less,
					greater));
		}
	}

	public static final void between(char arg, char less, char greater,
			String msg) {
		if ((arg <= less) || (arg >= greater)) {
			throw new IllegalArgumentException(String.format(msg, arg, less,
					greater));
		}
	}

	public static final <T> void between(Comparable<T> arg, T less, T greater,
			String msg) {
		if ((arg.compareTo(less) <= 0) || (arg.compareTo(greater) >= 0)) {
			throw new IllegalArgumentException(String.format(msg, arg, less,
					greater));
		}
	}

	public static final void between(byte[] arg, byte less, byte greater,
			String msg) {
		for (int i = 0; i < arg.length; i++) {
			if ((arg[i] <= less) || (arg[i] >= greater)) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						less, greater, i));
			}
		}
	}

	public static final void between(short[] arg, short less, short greater,
			String msg) {
		for (int i = 0; i < arg.length; i++) {
			if ((arg[i] <= less) || (arg[i] >= greater)) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						less, greater, i));
			}
		}
	}

	public static final void between(int[] arg, int less, int greater,
			String msg) {
		for (int i = 0; i < arg.length; i++) {
			if ((arg[i] <= less) || (arg[i] >= greater)) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						less, greater, i));
			}
		}
	}

	public static final void between(long[] arg, long less, long greater,
			String msg) {
		for (int i = 0; i < arg.length; i++) {
			if ((arg[i] <= less) || (arg[i] >= greater)) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						less, greater, i));
			}
		}
	}

	public static final void between(float[] arg, float less, float greater,
			String msg) {
		for (int i = 0; i < arg.length; i++) {
			if ((arg[i] <= less) || (arg[i] >= greater)) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						less, greater, i));
			}
		}
	}

	public static final void between(double[] arg, double less, double greater,
			String msg) {
		for (int i = 0; i < arg.length; i++) {
			if ((arg[i] <= less) || (arg[i] >= greater)) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						less, greater, i));
			}
		}
	}

	public static final void between(char[] arg, char less, char greater,
			String msg) {
		for (int i = 0; i < arg.length; i++) {
			if ((arg[i] <= less) || (arg[i] >= greater)) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						less, greater, i));
			}
		}
	}

	public static final <T> void between(Comparable<T>[] arg, T less,
			T greater, String msg) {
		for (int i = 0; i < arg.length; i++) {
			if ((arg[i].compareTo(less) <= 0)
					|| (arg[i].compareTo(greater) >= 0)) {
				throw new IllegalArgumentException(String.format(msg, arg[i],
						less, greater, i));
			}
		}
	}

	public static final <T> void between(Iterable<? extends Comparable<T>> arg,
			T less, T greater, String msg) {
		int i = 0;

		for (Comparable<T> element : arg) {
			if ((element.compareTo(less) <= 0)
					|| (element.compareTo(greater) >= 0)) {
				throw new IllegalArgumentException(String.format(msg, element,
						less, greater, i));
			}
			i++;
		}
	}

	public static final void notBlank(CharSequence arg, String msg) {
		objCondition(!StringUtil.isBlank(arg), msg, arg);
	}

	private ArgCheck() {
		super();
	}

}

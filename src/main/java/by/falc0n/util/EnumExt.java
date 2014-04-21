package by.falc0n.util;

public final class EnumExt {

	public static final <E extends Enum<E>> boolean existsAs(
			Class<E> enumClass, String value) {
		boolean exists = false;
		E[] elements = enumClass.getEnumConstants();

		for (E element : elements) {
			if (value.equals(element.toString())) {
				exists = true;
				break;
			}
		}
		return exists;
	}

	private EnumExt() {
		super();
	}

}

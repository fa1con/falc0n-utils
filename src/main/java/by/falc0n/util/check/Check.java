package by.falc0n.util.check;

public final class Check {
	
	public static final void notNull(Object obj, String msg) {
		if (obj == null) {
			throw new NullPointerException(msg);
		}
	}

	private Check() {
		super();
	}

}

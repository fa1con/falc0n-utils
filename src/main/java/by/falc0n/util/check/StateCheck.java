package by.falc0n.util.check;

public final class StateCheck {
	
	public static final void notNull(Object obj, String msg) {
		if (obj == null) {
			throw new IllegalStateException(msg);
		}
	}
	
	public static final void condition(boolean result, String msg) {
		if (!result) {
			throw new IllegalStateException(msg);
		}
	}

	private StateCheck() {
		super();
	}

}

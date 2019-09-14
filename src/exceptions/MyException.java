package exceptions;

public class MyException extends Exception {

	/**
	 * Added to solve a warning
	 */
	private static final long serialVersionUID = 1L;

	public MyException(Throwable arg0) {
		super(arg0);
	}

}

package edu.cccti.gspork.exception;

public class GSporkException extends Exception {


	public GSporkException(Throwable e) {
		this.initCause(e);
	}

	private static final long serialVersionUID = 1L;

}

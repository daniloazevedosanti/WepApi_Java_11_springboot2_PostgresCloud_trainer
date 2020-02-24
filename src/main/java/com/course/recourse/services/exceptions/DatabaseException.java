package com.course.recourse.services.exceptions;

public class DatabaseException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DatabaseException(String err) {
		super(err);
	}
}

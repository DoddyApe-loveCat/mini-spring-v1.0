package com.csii.minispring.exceptions;

/**
 * used to indicate bean exception.
 * 
 * @author CSII Rongbo
 * 
 */
public class BeansException extends RuntimeException {

	private static final long serialVersionUID = -8324680803517538538L;

	public BeansException(String msg) {
		super(msg);
	}

	public BeansException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public BeansException(Class clazz, String msg) {
		this(clazz, msg, null);
	}

	public BeansException(Class clazz, String string, Throwable ex) {
		super("Could not instantiate bean class [" + clazz.getName() + "]: ", ex);
	}

}

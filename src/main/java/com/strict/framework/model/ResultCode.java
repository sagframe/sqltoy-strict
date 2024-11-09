package com.strict.framework.model;

import java.io.Serializable;

/**
 * 
 * @author zhong
 *
 */
public class ResultCode implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5661446538382994600L;

	public static String ERROR = "000";

	public static String SUCCESS = "001";

	public static String ARG_NOT_VALID = "002";

	public static String MULTI_ERROR = "003";

}

package com.example.demo.exception;

public class ResourcrNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resourcename;
	private String fieldname;
	private Object fieldvalue;
	public ResourcrNotFoundException(String resourcename, String fieldname, Object fieldvalue) {
		super();
		this.resourcename = resourcename;
		this.fieldname = fieldname;
		this.fieldvalue = fieldvalue;
	}
	
	public String getResoucename()
	{
		return resourcename;
	}
	public String getFieldname()
	{
		return fieldname;
	}
	public Object getFieldvalue()
	{
		return fieldvalue;
	}
}

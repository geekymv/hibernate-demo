package com.geekymv.base;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

public abstract class BaseDomain implements Serializable {
	private static final long serialVersionUID = -8373648201980699677L;

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}

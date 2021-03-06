package com.csii.minispring.beans;

import java.util.List;

/**
 * used to describe the config infomation of bean.
 * 
 * @author CSII Rongbo
 * 
 */
public class BeanDefinition {
	private String id;
	private String className;
	private List<PropertyDefinition> properties;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<PropertyDefinition> getProperties() {
		return properties;
	}

	public void setProperties(List<PropertyDefinition> properties) {
		this.properties = properties;
	}

}

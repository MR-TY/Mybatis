package com.qfedu.esys.entity;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Dictionary {
	
	private final static Logger LOG = LogManager.getLogger(Dictionary.class);

	private String id;
	
	private String description;
	
	private String dicType;
	
	private String name;
	
	private String val;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDicType() {
		return dicType;
	}

	public void setDicType(String dicType) {
		this.dicType = dicType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	@Override
	public String toString() {
		return "Dictionary [id=" + id + ", description=" + description + ", dicType=" + dicType + ", name=" + name
				+ ", val=" + val + "]";
	}

}

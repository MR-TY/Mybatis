package com.qfedu.esys.entity;

import java.util.List;

public class Menu {

	private String id;
	
	private String name;
	
	private String no;
	
	private String icon;
	
	private String resource;
	
	private String resourceType;
	
	private Menu parent;

	private List<Menu> children;
	
	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public List<Menu> getChildren() {
		return children;
	}

	public void setChildren(List<Menu> children) {
		this.children = children;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Menu getParent() {
		return parent;
	}

	public void setParent(Menu parent) {
		this.parent = parent;
	}
}

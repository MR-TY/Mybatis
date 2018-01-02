package com.qfedu.esys.entity;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4826243346924750684L;

	private String id;
	
	private String loginName;

	private String password = "123456";

	private String headImage;
	
	private Date createTime;
	
	private List<Role> roles;
	
	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getHeadImage() {
		return headImage;
	}

	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * @return
	 */
	public Boolean isAdmin () {
		return "admin".equals(this.getLoginName());
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", loginName=" + loginName + ", password=" + password + ", headImage=" + headImage
				+ ", createTime=" + createTime + ", roles=" + roles + "]";
	}
	
	
}

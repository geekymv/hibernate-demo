package com.geekymv.pojo;

/**
 * 用户信息
 * 
 * @desc: hibernate-demo
 * @author: miying
 * @createTime: 2016年11月10日 下午1:03:13
 * @history:
 * @version: v1.0
 */
public class User {
	
	private Integer id;
	
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
}

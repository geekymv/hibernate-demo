package com.geekymv.pojo;

import com.geekymv.base.BaseDomain;

/**
 * 用户信息
 * 
 * @desc: hibernate-demo
 * @author: miying
 * @createTime: 2016年11月10日 下午1:03:13
 * @history:
 * @version: v1.0
 */
public class User extends BaseDomain {
	private static final long serialVersionUID = -6439653743010565702L;
	/**
	 * 用户id
	 */
	private Integer id;

	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 昵称
	 */
	private String nickName;

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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}

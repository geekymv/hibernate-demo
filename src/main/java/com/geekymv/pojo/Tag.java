package com.geekymv.pojo;

import java.util.Set;

/**
 * 标签
 * 
 * @desc: hibernate-demo
 * @author: miying
 * @createTime: 2016年11月10日 下午1:31:12
 * @history:
 * @version: v1.0
 */
public class Tag {
	/**
	 * 标签主键
	 */
	private Integer id;
	/**
	 * 标签名称
	 */
	private String name;
	/**
	 * 所属用户
	 * 多个标签对应一个用户，一个用户对应多个标签，多对一
	 */
	private User user;
	
	/**
	 * 一篇文章有多个标签，一个标签对应多篇文章
	 */
	private Set<Article> articles;
	
	public Tag() {
	}
	
	public Tag(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Set<Article> getArticles() {
		return articles;
	}
	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}
	@Override
	public String toString() {
		return "Tag [id=" + id + ", name=" + name + ", user=" + user + "]";
	}
}

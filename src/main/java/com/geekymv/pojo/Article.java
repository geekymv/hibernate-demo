package com.geekymv.pojo;

import java.util.Date;
import java.util.Set;

import com.geekymv.base.BaseDomain;
import com.geekymv.common.enums.Status.ArticleStatus;
/**
 * 文章
 * @desc: hibernate-demo
 * @author: miying
 * @createTime: 2016年11月10日 下午1:40:33
 * @history:
 * @version: v1.0
 */
public class Article extends BaseDomain {
	private static final long serialVersionUID = -4517822068785233906L;

	/**
	 * 主键
	 */
	private Integer id;
	/**
	 * 作者
	 */
	private User author;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 内容
	 */
	private String content;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 发布时间
	 */
	private Date publicTime;
	/**
	 * 更新时间
	 */
	private Date modifyTime;
	
	/**
	 * 状态
	 */
//	private Integer state;
	private ArticleStatus articleStatus;
	
	/**
	 * 一篇文章有多个标签，一个标签对应多篇文章
	 */
	private Set<Tag> tags;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getPublicTime() {
		return publicTime;
	}
	public void setPublicTime(Date publicTime) {
		this.publicTime = publicTime;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
//	public Integer getState() {
//		return state;
//	}
//	public void setState(Integer state) {
//		this.state = state;
//	}
	
	public ArticleStatus getArticleStatus() {
		return articleStatus;
	}
	public void setArticleStatus(ArticleStatus articleStatus) {
		this.articleStatus = articleStatus;
	}
	
	public Set<Tag> getTags() {
		return tags;
	}
	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}
	
}

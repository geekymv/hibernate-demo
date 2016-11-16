package com.geekymv.common.enums;

public interface Status {

	public enum UserStatus {

		ACTIVE("正常", 0), PENDING("审核中", 1), 
		INACTIVE("禁用", -1), DELETED("删除", -2), ALL("全部", 2);

	    private String text;
	    private int value;

	    private UserStatus(String text, int value) {
	    	this.text = text;
	    	this.value = value;
	    }

		public String getText() {
			return text;
		}
		public int getValue() {
			return value;
		}
		
		@Override
		public String toString() {
			return this.text + "," + this.value;
		}
	}
	
	public enum ArticleStatus {

		ACTIVE("草稿", 0), PUBLISHED("已发布", 1), 
		DELETED("已删除", -1), ALL("全部", 2);

		private String text;
		private int value;
		
		private ArticleStatus(String text, int value) {
			this.text = text;
			this.value = value;
		}

		public String getText() {
			return text;
		}
		public int getValue() {
			return value;
		}
		
		@Override
		public String toString() {
			return this.text + "," + this.value;
		}
	}
}

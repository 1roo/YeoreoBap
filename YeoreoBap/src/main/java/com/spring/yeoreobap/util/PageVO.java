package com.spring.yeoreobap.util;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PageVO {

	private int pageNum;
	private int cpp;
	
	//�˻� ��û�� �ʿ��� �ʵ带 �߰�
	private String keyword;
	private String condition;
	
	
	//myPage���� ����¡�� �����ϱ� ���� �ʵ带 �߰�
	private String loginId;
	
	public PageVO() {
		this.pageNum = 1;
		this.cpp = 10;
	}
	
	public int getPageStart() {
		/*
		 pageNum: 1 -> return 0
		 pageNum: 2 -> return 10
		 pageNum: 3 -> return 20
		 pageNum: n -> return (n-1) * cpp
		 */
		return (pageNum - 1) * cpp;
	}
}

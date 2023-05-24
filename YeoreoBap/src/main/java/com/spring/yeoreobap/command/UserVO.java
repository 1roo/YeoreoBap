package com.spring.yeoreobap.command;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserVO {
	
	private String userId;
	private String userPw;
	private String userName;
	private String userPhone1;
	private String userPhone2;
	private String userEmail1;
	private String userEmail2;
	private String addrBasic;
	private String addrDetail;
	private String addrZipNum;
	private LocalDateTime regDate;
	
	/*
	 �� ���� ȸ���� ���� ������ �ۼ��� �� �ִ�.
	 MyPage���� Ư�� ȸ���� �ۼ��� �� ����� ��Ÿ���� �Ѵ�.
	 ȸ�� ������ �� ����� ���� �ٸ� ���̺�� �̷���� �ִ�.
	 MyPage���� �ش� ������ �� ���� DB�������� ������ �� �ֵ��� �ϱ� ����
	 JOIN �������� ���̺� ��ģ �� ���ϴ� �÷��� �����ؼ� ������ �����̴�.
	 */
	
	//1�� UserVO �̱� ������ UserVO �ȿ� N�� ���� ���ϴ� 
	//FreeBoardVO ��ü�� ������ ������ �� �ִ� ����Ʈ ����
	//1 : N ������ ���̺��� list ���·� ����
//	private List<FreeBoardVO> userBoardList;
}

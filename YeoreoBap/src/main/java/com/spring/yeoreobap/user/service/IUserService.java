package com.spring.yeoreobap.user.service;

import com.spring.yeoreobap.command.UserVO;
import com.spring.yeoreobap.util.PageVO;

public interface IUserService {

	//���̵� �ߺ� Ȯ��
	int idCheck(String userId);
	
	//ȸ�� ����
	void join(UserVO vo);
	
	//�α���
	String login(String userId, String userPw);
	
	//ȸ�� ���� ���
	UserVO getInfo(String userId, PageVO vo);
	
	//ȸ�� ���� ����
	void updateUser(UserVO vo);
}

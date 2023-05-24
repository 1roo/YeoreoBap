package com.spring.yeoreobap.user.mapper;

import org.apache.ibatis.annotations.Param;

import com.spring.yeoreobap.command.UserVO;
import com.spring.yeoreobap.util.PageVO;

public interface IUserMapper {
	//���̵� �ߺ� Ȯ��
	int idCheck(String userId);

	//ȸ�� ����
	void join(UserVO vo);

	//�α���
	/*
		 - MyBatis�� DB���� ������ �� �Ķ���� ���� 2�� �̻��� �� ���� �߻��Ѵ�.
		 1. @Param�� �̿��ؼ� �̸� �ٿ��ִ� ���(xml ���Ͽ��� �ش� ���� ������ �� �ִ� �̸� ���̱�)
		 2. Map���� ����
		 3. Ŭ���� �������ؼ� ��ü �ϳ��� �Ű������� ������ ���(VO)
		 															�� �ϳ� ����*/
	String login(String userId);

	//ȸ�� ���� ���
	UserVO getInfo(@Param("userId") String userId, @Param("paging") PageVO vo);

	//ȸ�� ���� ����
	void updateUser(UserVO vo);

}

package com.spring.yeoreobap.user.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.spring.yeoreobap.command.UserVO;
import com.spring.yeoreobap.util.PageVO;

import lombok.extern.slf4j.Slf4j;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/db-config.xml")
@Slf4j
public class UserMapperTest {

	@Autowired
	private IUserMapper mapper;
	
	@Test
	@DisplayName("ȸ�������� �������� �� ȸ�����Կ� �����ؾ� �Ѵ�.")
	void registTest() {
		UserVO vo = new UserVO();
		vo.setUserId("abc1234");
		vo.setUserPw("aaa1111!");
		vo.setUserName("ȫ�浿");
		
		mapper.join(vo);
	}
	
	@Test
	@DisplayName("�����ϴ� ȸ�� ���̵� ��ȸ�ϸ� 1�� ���ϵǾ�� �Ѵ�.")
	void checkIdTest() {
		
		String userId = "abc1234";	
//		assertEquals(id, vo.getUserId());
		assertEquals(1, mapper.idCheck(userId));
	}
	

	@Test
	@DisplayName("�����ϴ� ȸ�� ���̵�� �ùٸ� ��й�ȣ�� �Է��ϸ� ȸ���� ������ ���ϵǾ�� �Ѵ�.")
	void loginTest() {
		String userId = "abc1234";
		String userPw = "aaa1111!";
//		UserVO vo = mapper.login(id, pw);
		assertNotNull(mapper.login(userId));

	}

	
	@Test
	@DisplayName("�������� �ʴ� ȸ�� ���̵� �Է��ϸ� null�� �´�.")
	void getInfoTest() {
//		String id = "abc1234";
//		UserVO vo = new UserVO(); 

		PageVO paging = new PageVO();
		UserVO vo = mapper.getInfo("abc1234", paging);
		log.info(vo.toString());
		
//		assertNull(mapper.getInfo("qweasdzxc"));
	}

	
	@Test
	@DisplayName("���̵� ������ ȸ���� ������ ������ �� �ִ�.")
	void updateTest() {
		UserVO vo = new UserVO();
		vo.setUserId("abc1234");
		vo.setUserPw("aaa1111!");
		vo.setUserName("���� �̸�");
		vo.setUserPhone1("���� ��1");
		vo.setUserPhone2("���� ��2");
		vo.setUserEmail1("���� �̸���1");
		vo.setUserEmail2("���� �̸���2");
		vo.setAddrBasic("���� �ּ�");
		vo.setAddrDetail("���� �ּ� ��");
		vo.setAddrZipNum("�ּ� ����");
		mapper.updateUser(vo);
//		assertEquals(mapper.getInfo("abc1234").getUserName(),vo.getUserName());
	}
	
}

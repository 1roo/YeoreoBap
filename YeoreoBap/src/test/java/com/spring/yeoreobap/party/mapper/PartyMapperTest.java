package com.spring.yeoreobap.party.mapper;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.spring.yeoreobap.command.PartyVO;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/config/db-config.xml"
})
public class PartyMapperTest {

	@Autowired
	private IPartyMapper mapper;
	
	@Test
	@DisplayName("�۵��")
	void registTest() {
		for(int i=0; i< 100; i++) {
		PartyVO vo = new PartyVO();
		vo.setRestId("3007-10-12312312");
		vo.setWriter("����");
		vo.setTitle("��Ƽ����" + i);
		vo.setContent("��Ƽ������~~~" + i);
		mapper.regist(vo);
		}
	}
	
	@Test
	@DisplayName("�۸���Ʈ")
	void getListTest() {
		List<PartyVO> list = mapper.getList();
		
		for(PartyVO vo : list) {
			System.out.println(vo);
		}
	}
	
}
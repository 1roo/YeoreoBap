package com.spring.yeoreobap.party.mapper;

import java.util.List;

import com.spring.yeoreobap.command.PartyVO;

public interface IPartyMapper {
	
	//�� ���
	void regist(PartyVO vo);
	//�� ���
	List<PartyVO> getList();
	//�󼼺���
	PartyVO getarticle(int partyNo);
	//����
	
	//����
	
	//����

}
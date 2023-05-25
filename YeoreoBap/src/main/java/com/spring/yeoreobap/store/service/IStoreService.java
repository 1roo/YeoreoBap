package com.spring.yeoreobap.store.service;

import java.util.List;

import com.spring.yeoreobap.command.StoreVO;
import com.spring.yeoreobap.util.PageVO;

public interface IStoreService {

	//���
	List<StoreVO> getList(PageVO vo);
	
	//��
	StoreVO getContent(int sno);
	
	//��ü �Խù� ���ϱ�
	int getTotal(PageVO vo);
}

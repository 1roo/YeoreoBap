package com.spring.yeoreobap.store.mapper;

import java.util.List;

import com.spring.yeoreobap.command.StoreVO;
import com.spring.yeoreobap.util.PageVO;

public interface IStoreMapper {

	//���
	List<StoreVO> getList(PageVO vo);

	//��
	StoreVO getContent(int sno);

	//��ü �Խù� ��
	int getTotal(PageVO vo);

}

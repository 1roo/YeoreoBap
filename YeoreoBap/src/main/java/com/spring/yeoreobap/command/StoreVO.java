package com.spring.yeoreobap.command;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/*
 CREATE TABLE store(
	sno INT PRIMARY KEY AUTO_INCREMENT,
    siteTel VARCHAR(100) NOT NULL,
    rdnWhlAddr VARCHAR(300) NOT NULL,
    bplcNm VARCHAR(50) NOT NULL,
    uptaeNm VARCHAR(20) NOT NULL,
    x long NOT NULL, 
    y long NOT NULL
); 
*/
@Getter @Setter @ToString
public class StoreVO {
	
	//���������� ������Ƽ��� ���� �̸����� �����߽��ϴ�.
	
	private int sno; //����� ��ȣ(��ȭ��ȣX)
	private String siteTel;	//��������ȭ
	private String rdnWhlAddr;	//���θ���ü�ּ�
	private String bplcNm;	//������
	private String uptaeNm;	//���±��и�
	private long x;	//x��ǥ
	private long y;	//y��ǥ
	
}

package com.kostech.test;

public class RedDuck extends Duck {

	
	public RedDuck(GagI gag, FlyI fly) {
		fly=new GoodFlyI();
		gag=new GoodGagI();
	}
	
	//����ģʽ���ֱ��װ��Ϊ�ӿڣ�ʵ���㷨�壬���������Ϊ�ӿڶ���������������趨��Ϊ����
	//ԭ����ǣ�����仯���֣���װ�ӿڣ����ڽӿڱ�̸��ֹ��ܡ�
	//��ģʽ����Ϊ�㷨�ı仯�������㷨��ʹ���ߡ�

}

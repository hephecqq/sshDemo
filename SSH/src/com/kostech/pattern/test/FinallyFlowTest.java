package com.kostech.pattern.test;

public class FinallyFlowTest {

	public static void main(String[] args) {
		int a = test();
		System.out.println(a);
	}

	@SuppressWarnings("finally")
	public static int test() {
		int count = 5;
		try {
			// ��Ϊfinally���а�����return���
			// �������return��䲻����������
			return ++count;
		} finally {
			System.out.println(count);
			System.out.println("finally�鱻ִ����");
			//return 8;
		}
	}
}

/**
 * 6 finally�鱻ִ���� 6
 * 
 */
package com.kostech.pattern.test;

public class FinallyFlowTest2 {

	public static void main(String[] args) {
		int a=test();
		System.out.println(a);
	}

	private static int test() {
		int count=5;
		try{
			//��Ϊfinally���а�����return���
			//�������return��䲻����������
			throw new RuntimeException("�����쳣");
		}
		finally{
			System.out.println("finally�鱻ִ��");
			return count;
		}
	}
	
}

package com.kostech.pattern.test;

public class FinallyFlowTest2 {

	public static void main(String[] args) {
		int a=test();
		System.out.println(a);
	}

	private static int test() {
		int count=5;
		try{
			//因为finally块中包含了return语句
			//则下面的return语句不会立即返回
			throw new RuntimeException("测试异常");
		}
		finally{
			System.out.println("finally块被执行");
			return count;
		}
	}
	
}

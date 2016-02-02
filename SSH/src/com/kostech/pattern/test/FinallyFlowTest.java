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
			// 因为finally块中包含了return语句
			// 则下面的return语句不会立即返回
			return ++count;
		} finally {
			System.out.println(count);
			System.out.println("finally块被执行了");
			//return 8;
		}
	}
}

/**
 * 6 finally块被执行了 6
 * 
 */
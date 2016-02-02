package com.kostech.pattern.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExitFinally {

	public static void main(String[] args) throws FileNotFoundException {
		final FileOutputStream fos;
		fos = new FileOutputStream("a.bin");
		System.out.println("程序打开物理资源");
		// 为系统注册关闭钩子
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {

				// 使用finally块关闭资源
				if (fos != null) {
					try {
						System.out.println(fos);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				System.out.println("程序关闭了物理资源...");
			}

		});
	}
}

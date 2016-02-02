package com.kostech.pattern.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExitFinally {

	public static void main(String[] args) throws FileNotFoundException {
		final FileOutputStream fos;
		fos = new FileOutputStream("a.bin");
		System.out.println("�����������Դ");
		// Ϊϵͳע��رչ���
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {

				// ʹ��finally��ر���Դ
				if (fos != null) {
					try {
						System.out.println(fos);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				System.out.println("����ر���������Դ...");
			}

		});
	}
}

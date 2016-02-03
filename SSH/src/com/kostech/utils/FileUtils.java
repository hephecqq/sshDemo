package com.kostech.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FileUtils {

	/***
	 * 
	 */
	public static FileUtils fileUtils = new FileUtils();
	/***
	 * 
	 */
	public static ThreadLocal<FileUtils> fileLocal = new ThreadLocal<FileUtils>();

	private FileUtils() {
	}

	/***
	 * 
	 * @return
	 */
	public static FileUtils getInstance() {
		fileUtils = fileLocal.get();
		if (fileUtils == null) {
			fileUtils = new FileUtils();
			fileLocal.set(fileUtils);
			return fileUtils;
		}
		return fileLocal.get();
	}

	/***
	 * 
	 * @throws FileNotFoundException
	 */
	public static void wrintReadmeFile() throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("readme.txt");
		PrintStream ps = new PrintStream(fos);
		ps.println("this is readme.txt");
		ps.println("information follows...");
		ps.close();
	}
}

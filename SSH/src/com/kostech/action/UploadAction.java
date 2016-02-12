package com.kostech.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {

	
	private static final long serialVersionUID = 1L;
	private File upload;
	private String uploadFileName;
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	@Override
	public String execute() throws Exception {
		if(upload!=null){
			InputStream in=new FileInputStream(upload);
			OutputStream os=new 
					FileOutputStream("d:\\fileUpload\\"+uploadFileName);
			//读取并写入文件...
		}
		return SUCCESS;
	}
}

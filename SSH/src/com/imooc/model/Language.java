package com.imooc.model;

public class Language {

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getLanguageDisplay() {
		return languageDisplay;
	}

	public void setLanguageDisplay(String languageDisplay) {
		this.languageDisplay = languageDisplay;
	}

	private String languageCode;
	private String languageDisplay;

	public Language() {
	}

	public Language(String languageCode, String languageDisplay) {
		super();
		this.languageCode = languageCode;
		this.languageDisplay = languageDisplay;
	}
}

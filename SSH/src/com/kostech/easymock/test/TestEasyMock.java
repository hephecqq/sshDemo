package com.kostech.easymock.test;

public class TestEasyMock {
	private Collaborator listener;
    // ...
    public void setListener(Collaborator listener) {
        this.listener = listener;
    }
    public void addDocument(String title, byte[] document) { 
        // ... 
    }
    public boolean removeDocument(String title) {
		return false;
        // ... 
    }
    public boolean removeDocuments(String[] titles) {
		return false;
        // ... 
    }
}

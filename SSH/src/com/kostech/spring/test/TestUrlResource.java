package com.kostech.spring.test;

import java.io.IOException;
import java.util.List;

import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.core.io.UrlResource;

public class TestUrlResource {

	public static void main(String[] args) throws DocumentException, IOException {
		// ����һ��Resource����,ָ�����ļ�ϵͳ���ȡ��Դ
		UrlResource urlResource = new UrlResource("file:book.xml");
		// ��ȡ����Դ�ļ���Ϣ
		System.out.println("filename:" + urlResource.getFilename());
		System.out.println("description:" + urlResource.getDescription());
		// ��������SAX��DOM4j������
		SAXReader reader = new SAXReader();
		// ������Դ���ڵ�File����
		org.dom4j.Document doc = reader.read(urlResource.getFile());
		Element elem = doc.getRootElement();
		List<Element> elemList = elem.elements();
		// ������Ԫ�ص�ȫ����Ԫ��
		for (java.util.Iterator<Element> it = elemList.iterator(); it.hasNext();) {
			// ÿ���ڵ㶼��<��>�ڵ�
			Element book = it.next();
			List list = book.elements();
			// ����<��>�ڵ��ȫ���ӽڵ�
			for (java.util.Iterator it2 = list.iterator(); it2.hasNext();) {
				Element ee = (Element) it2.next();
				System.out.println(ee.getText());
			}
		}

	}

}

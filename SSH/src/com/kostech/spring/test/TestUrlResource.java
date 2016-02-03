package com.kostech.spring.test;

import java.io.IOException;
import java.util.List;

import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.core.io.UrlResource;

public class TestUrlResource {

	public static void main(String[] args) throws DocumentException, IOException {
		// 创建一个Resource对象,指定从文件系统里读取资源
		UrlResource urlResource = new UrlResource("file:book.xml");
		// 获取该资源的简单信息
		System.out.println("filename:" + urlResource.getFilename());
		System.out.println("description:" + urlResource.getDescription());
		// 创建基于SAX的DOM4j解析器
		SAXReader reader = new SAXReader();
		// 返回资源对于的File对象
		org.dom4j.Document doc = reader.read(urlResource.getFile());
		Element elem = doc.getRootElement();
		List<Element> elemList = elem.elements();
		// 遍历根元素的全部子元素
		for (java.util.Iterator<Element> it = elemList.iterator(); it.hasNext();) {
			// 每个节点都是<书>节点
			Element book = it.next();
			List list = book.elements();
			// 遍历<书>节点的全部子节点
			for (java.util.Iterator it2 = list.iterator(); it2.hasNext();) {
				Element ee = (Element) it2.next();
				System.out.println(ee.getText());
			}
		}

	}

}

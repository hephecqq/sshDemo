package com.kostech.pattern.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Wolf implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;

	public Wolf(String name) {
		System.out.println("�����в����Ĺ�����");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Wolf [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wolf other = (Wolf) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

public class CloseResource {
	public static void main(String[] args) throws Exception {
		Wolf w = new Wolf("��̫��");
		System.out.println("Wolf���󴴽����");
		Wolf w2 = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
			// �������������
			oos = new ObjectOutputStream(new FileOutputStream("a.bin"));
			// ��������������
			ois = new ObjectInputStream(new FileInputStream("a.bin"));
			// ���л����java����
			oos.writeObject(w);
			oos.flush();
			// �����л��ָ�java����
			w2 = (Wolf) ois.readObject();
			System.out.println(w2);
		} finally {
			// ʹ��finally����������Դ
			oos.close();
			ois.close();
		}
	}
}

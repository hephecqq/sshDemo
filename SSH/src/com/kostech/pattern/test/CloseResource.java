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
		System.out.println("调用有参数的构造器");
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
		Wolf w = new Wolf("灰太狼");
		System.out.println("Wolf对象创建完成");
		Wolf w2 = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
			// 创建对象输出流
			oos = new ObjectOutputStream(new FileOutputStream("a.bin"));
			// 创建对象输入流
			ois = new ObjectInputStream(new FileInputStream("a.bin"));
			// 序列化输出java对象
			oos.writeObject(w);
			oos.flush();
			// 反序列化恢复java对象
			w2 = (Wolf) ois.readObject();
			System.out.println(w2);
		} finally {
			// 使用finally块来回收资源
			oos.close();
			ois.close();
		}
	}
}

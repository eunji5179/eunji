package package02_generics;

import java.util.ArrayList;

class Asia {
	public String toString() {
		return "�ƽþ�";
	}
}
class Korea extends Asia {
	public String toString() {
		return "���ѹα�";
	}
}
class Vietnam extends Asia {
	public String toString() {
		return "��Ʈ��";
	}
}
class America {
	public String toString() {
		return "�̱�";
	}
}

// ���ѵ� ���׸� �Ķ���� Ÿ���� ������ �� �ִ�.
class Box<T extends Asia> {
	// Asia�� Asia�� �ڽ� Ŭ������ �Ķ���� Ÿ�� ���
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {
		list.add(item);
		// ������(������) �߰�
	}
	T get(int i) {
		return list.get(i);
		// �ε����� �̿��� ������(������) ��ȯ
	}
	ArrayList<T> getList(){
		return list;
		// ����Ʈ ��ü�� ��ȯ
	}
	int size() {
		return list.size();
		// ������(������) ������ ��ȯ
	}
	public String toString() {
		return list.toString();
		// ����Ʈ�� ������(������)���� ���ڿ��� ��ȯ
	}
}

public class Example03 {
	public static void main(String[] args) {
	 // Box<America> amBox = new Box<America>();
		Box<Asia> aBox = new Box<Asia>();
		Box<Korea> kBox = new Box<Korea>();
		Box<Vietnam> vBox = new Box<Vietnam>();
		
	}
}

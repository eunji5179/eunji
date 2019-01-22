package package03_generics;

import java.util.ArrayList;

class Asia {
	public String toString() {
		return "�ƽþ�";
	}
}
class Korea extends Asia implements Exportable{
	// �ƽþ� �����̸鼭 ������ ������ ����
	public String toString() {
		return "���ѹα�";
	}
}
class Vietnam extends Asia {
	// �ƽþ� �����̸鼭 ������ �Ұ����� ����
	public String toString() {
		return "��Ʈ��";
	}
}
class America implements Exportable{
	// �ƽþ� ������ �ƴϰ� ������ ������ ����
	public String toString() {
		return "�̱�";
	}
}

interface Exportable { // ���� ������
	
}

// ���ѵ� ���׸� �Ķ���� Ÿ���� ������ �� �ִ�.
// class Box< T extends Exportable> 
// : ������ ������ Ŭ���� Ÿ�Ը� ����
class Box<T extends Asia & Exportable> {
	// Asia�̸鼭 ������ ������ Ŭ���� ��
	// Asia�� �ڽ� Ŭ�����̸鼭 ������ ������ Ŭ���� Ÿ�Ը� ����
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

public class Example04 {
	public static void main(String[] args) {
	 // Box<Asia> aBox =  new Box<Asia>();
		Box<Korea> aBox =  new Box<Korea>();
	 // Box<Vietnam> aBox =  new Box<Vietnam>();
	 // Box<America> aBox =  new Box<America>();
	}

}

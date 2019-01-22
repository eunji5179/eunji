package package04_generics;

import java.util.ArrayList;

class Asia {
	public String toString() {
		return "�ƽþ�";
	}
}
class Korea extends Asia{
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

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {
		list.add(item);
	}
	T get(int i) {
		return list.get(i);
	}
	ArrayList<T> getList() {
		return list;
	}
	int size() {
		return list.size();
	}
	public String toString() {
		return list.toString();
	}
}

class PacificOcean { // ����� Ŭ����
	Box<? extends Asia> box = new Box<Asia>(); 
	// �ڽ� �ʵ�
	
	void setBox (Box<? extends Asia> box) {
		this.box = box;
	}
	// �ڽ� ����
	
	Box<? extends Asia> getBox() {
		return box;
	}
	// �ڽ� ��ȯ
	
// �Ű� ������ ���׸��� ���Ե� Ŭ���� Ÿ���� ��
// ���׸��� �Ķ���� Ÿ�Ը����δ� �����ε��� ������� �ʴ´�.
//	String toString(Box<Asia> box) {
		// �Ű� ������ ���׸��� ���Ե� Ŭ���� Ÿ���� ��
//		return box.toString() + " �����";
//	}
//	String toString(Box<America>box) {
//		return box.toString() + " �����"
//	}
	
	// ? 
	// : ���ϵ� ī�� 
	// : (��� �Ķ���� Ÿ���� �� �� ������ �� ���� ������)
	// <? super Asia> 
	// : �Ķ���� Ÿ���� Asia �Ǵ� Asia ���� Ŭ������ �� �� �ִ�.
	// <? extends Asia>
	// : �Ķ���� Ÿ���� Asia �Ǵ� Asia �ڼ� Ŭ������ �� �� �ִ�.
	String toStirng(Box<? extends Asia> box) {
		return box.toString() + " �����";
	}
	
}
public class Exmaple05 {
	public static void main(String[] args) {
		PacificOcean po = new PacificOcean();
		
		Box<Asia> abox = new Box<Asia> ();
		abox.add(new Asia());
		System.out.println(po.toStirng(abox));
		
		Box<Korea> kbox = new Box<Korea> ();
		kbox.add(new Korea());
		System.out.println(po.toStirng(kbox));
		// �ƽþ��� �ڼ��̹Ƿ� ����
		
		Box<America> ambox = new Box<America>();
		ambox.add(new America());
	 // System.out.println(po.toStirng(ambox));
		// �ƽþ��� �ڼ��� �ƴϹǷ� �Ұ���
	}
}

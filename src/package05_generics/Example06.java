package package05_generics;

import java.util.LinkedList;

class Hyundai {
	public String toString() {
		return "�����ڵ���";
	}
}
class Sonata extends Hyundai {
	public String toString() {
		return "�Ÿ";
	}
}
class Cona extends Hyundai {
	public String toString() {
		return "�ڳ�";
	}
}
class Sm5 {
	public String toString() {
		return "SM5";
	}
}
class CarList<C extends Hyundai> {
	private LinkedList<C> list = new LinkedList<C>();
	public void add(C car) {	// �ڵ��� ����
		list.add(car);
	}
	public String toString() {	// ����� �ڵ��� ��� ���
		return list.toString();
	}
}

class Factory {
	CarList<? extends Hyundai> carList;
	
	public void setCarList(CarList<? extends Hyundai> carList) {
		this.carList = carList;
	}
	
	public void info() {
		System.out.println(carList.toString() + " �� ���忡 �ֽ��ϴ�.");
	}
}

public class Example06 {
	public static void main(String[] args) {
		// ���׸� ����
		CarList<Hyundai> carlist = new CarList<Hyundai>();
		
		carlist.add(new Sonata());	// ����Ʈ �߰� ����
		carlist.add(new Cona());	// ����Ʈ �߰� ����
		// carlist.add(new Sm5());		// ����Ʈ�� �߰� �Ұ���
		System.out.println(carlist.toString()); // "[�Ÿ, �ڳ�]"�� ��µǾ�� ��.
		
		Factory factory = new Factory();
		factory.setCarList(carlist);
		factory.info(); // "[�Ÿ, �ڳ�] �� ���忡 �ֽ��ϴ�."�� ��µǾ�� ��.
	}
}

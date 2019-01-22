package package05_generics;

import java.util.LinkedList;

class Hyundai {
	public String toString() {
		return "현대자동차";
	}
}
class Sonata extends Hyundai {
	public String toString() {
		return "쏘나타";
	}
}
class Cona extends Hyundai {
	public String toString() {
		return "코나";
	}
}
class Sm5 {
	public String toString() {
		return "SM5";
	}
}
class CarList<C extends Hyundai> {
	private LinkedList<C> list = new LinkedList<C>();
	public void add(C car) {	// 자동차 저장
		list.add(car);
	}
	public String toString() {	// 저장된 자동차 목록 출력
		return list.toString();
	}
}

class Factory {
	CarList<? extends Hyundai> carList;
	
	public void setCarList(CarList<? extends Hyundai> carList) {
		this.carList = carList;
	}
	
	public void info() {
		System.out.println(carList.toString() + " 가 공장에 있습니다.");
	}
}

public class Example06 {
	public static void main(String[] args) {
		// 제네릭 문제
		CarList<Hyundai> carlist = new CarList<Hyundai>();
		
		carlist.add(new Sonata());	// 리스트 추가 가능
		carlist.add(new Cona());	// 리스트 추가 가능
		// carlist.add(new Sm5());		// 리스트에 추가 불가능
		System.out.println(carlist.toString()); // "[쏘나타, 코나]"가 출력되어야 함.
		
		Factory factory = new Factory();
		factory.setCarList(carlist);
		factory.info(); // "[쏘나타, 코나] 가 공장에 있습니다."가 출력되어야 함.
	}
}

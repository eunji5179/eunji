package package04_generics;

import java.util.ArrayList;

class Asia {
	public String toString() {
		return "아시아";
	}
}
class Korea extends Asia{
	public String toString() {
		return "대한민국";
	}
}
class Vietnam extends Asia {
	public String toString() {
		return "베트남";
	}
}
class America {
	public String toString() {
		return "미국";
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

class PacificOcean { // 태평양 클래스
	Box<? extends Asia> box = new Box<Asia>(); 
	// 박스 필드
	
	void setBox (Box<? extends Asia> box) {
		this.box = box;
	}
	// 박스 저장
	
	Box<? extends Asia> getBox() {
		return box;
	}
	// 박스 반환
	
// 매개 변수가 제네릭이 포함된 클래스 타입일 때
// 제네릭의 파라미터 타입만으로는 오버로딩을 허용하지 않는다.
//	String toString(Box<Asia> box) {
		// 매개 변수가 제네릭이 포함된 클래스 타임일 때
//		return box.toString() + " 태평양";
//	}
//	String toString(Box<America>box) {
//		return box.toString() + " 태평양"
//	}
	
	// ? 
	// : 와일드 카드 
	// : (어떠한 파라미터 타입이 올 지 예측할 수 없기 때문에)
	// <? super Asia> 
	// : 파라미터 타입이 Asia 또는 Asia 조상 클래스만 올 수 있다.
	// <? extends Asia>
	// : 파라미터 타입이 Asia 또는 Asia 자손 클래스만 올 수 있다.
	String toStirng(Box<? extends Asia> box) {
		return box.toString() + " 태평양";
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
		// 아시아의 자손이므로 가능
		
		Box<America> ambox = new Box<America>();
		ambox.add(new America());
	 // System.out.println(po.toStirng(ambox));
		// 아시아의 자손이 아니므로 불가능
	}
}

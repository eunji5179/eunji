package package03_generics;

import java.util.ArrayList;

class Asia {
	public String toString() {
		return "아시아";
	}
}
class Korea extends Asia implements Exportable{
	// 아시아 국가이면서 수출이 가능한 국가
	public String toString() {
		return "대한민국";
	}
}
class Vietnam extends Asia {
	// 아시아 국가이면서 수출이 불가능한 국가
	public String toString() {
		return "베트남";
	}
}
class America implements Exportable{
	// 아시아 국가가 아니고 수출이 가능한 국가
	public String toString() {
		return "미국";
	}
}

interface Exportable { // 수출 가능한
	
}

// 제한된 제네릭 파라미터 타입을 지정할 수 있다.
// class Box< T extends Exportable> 
// : 수출이 가능한 클래스 타입만 가능
class Box<T extends Asia & Exportable> {
	// Asia이면서 수출이 가능한 클래스 와
	// Asia의 자식 클래스이면서 수출이 가능한 클래스 타입만 가능
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {
		list.add(item);
		// 아이템(데이터) 추가
	}
	T get(int i) {
		return list.get(i);
		// 인덱스를 이용해 아이템(데이터) 반환
	}
	ArrayList<T> getList(){
		return list;
		// 리스트 자체를 반환
	}
	int size() {
		return list.size();
		// 아이템(데이터) 개수를 반환
	}
	public String toString() {
		return list.toString();
		// 리스트에 아이템(데이터)들을 문자열로 반환
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

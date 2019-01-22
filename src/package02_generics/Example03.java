package package02_generics;

import java.util.ArrayList;

class Asia {
	public String toString() {
		return "아시아";
	}
}
class Korea extends Asia {
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

// 제한된 제네릭 파라미터 타입을 지정할 수 있다.
class Box<T extends Asia> {
	// Asia와 Asia의 자식 클래스만 파라미터 타입 허용
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

public class Example03 {
	public static void main(String[] args) {
	 // Box<America> amBox = new Box<America>();
		Box<Asia> aBox = new Box<Asia>();
		Box<Korea> kBox = new Box<Korea>();
		Box<Vietnam> vBox = new Box<Vietnam>();
		
	}
}

package package01_generics;

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

class Box<T> {
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

public class Example02 {
	public static void main(String[] args) {
		// 파라미터 타입(부모(Asia))
		Box<Asia> asiaBox = new Box<Asia>();
		// 자식(Korea) 저장 가능
		asiaBox.add(new Korea());
		// 자식(Vietnam) 저장 가능
	 // asiaBox.add(new America());
		// 저장 불가능
		System.out.println(asiaBox.toString());
		Box<Korea> korbox = new Box<Korea>();
		korbox.add(new Korea());
	 // korbox.add(new Asia());
	 // korbox.add(new Vietnam());
	 //	korbox.add(new America());
		System.out.println(korbox.toString());
		
		
	}

}

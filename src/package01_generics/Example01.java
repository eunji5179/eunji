package package01_generics;


class Box1 {
	// [ 제네릭을 적용하지 않은 클래스 ]
	private Object item;
	// 제네릭이 없다면 ?
	// Object 클래스의 다형성 활용
	// Object 클래스는 다~ 저장할 수 있다.
	
	public void setItem(Object item) {
		this.item = item;
	}
	
	public Object getItem() {
		return this.item;
	}
}

class Box2<T> {
	// [ 제네릭이 적용된 클래스 ]

	private T item;
	// public static T[] itemArray;
	// 제한1) static 멤버에는 파라미터 타입을 사용할 수 없다.
	//
	// T[] toArray() {
	// T[] tmpArr = new T[itemArray.length];
	// 제한2) 배열을 생성할 때 사용할 수 없다.
	// }
	
	public void setItem(T item) {
		this.item = item;
	}
	public T getItem() {
		return this.item;
	}
	
}

class Japanese {
	
}

public class Example01 {
	public static void main(String[] args) {
		/* 제네릭은 다양한 타입의 객체들을 처리하는 메소드나 컬렉션 클래스들의 
		 * 컴파일 시 타입을 체크하는 기능을 말한다.
		 * 프로그램 실행 전에 타입을 정해놓기 때문에 객체 형식의 안정성과 
		 * 형 변환의 번거로움을 줄일 수 있다.
		 */
		Box1 box1 = new Box1();
		box1.setItem(new Japanese());
		// 일본 객체를 제네릭이 적용되지 않은 box1에 저장한다.
		Japanese j = (Japanese)box1.getItem();
		// 일본 객체를 반환한다.
		// 강제 타입 변환을 해야 한다.
		// (타입이 정해져 있지 않기 때문에)
		
		Box2<Japanese> box2 = new Box2<Japanese>();
		box2.setItem(new Japanese());
		// 일본 객체를 제네릭이 전용된 box2에 저장한다.
		Japanese j2 = box2.getItem();
		// 강제 타입 변환 할 필요가 없음
	
	}
	
}

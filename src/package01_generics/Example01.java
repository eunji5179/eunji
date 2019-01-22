package package01_generics;


class Box1 {
	// [ ���׸��� �������� ���� Ŭ���� ]
	private Object item;
	// ���׸��� ���ٸ� ?
	// Object Ŭ������ ������ Ȱ��
	// Object Ŭ������ ��~ ������ �� �ִ�.
	
	public void setItem(Object item) {
		this.item = item;
	}
	
	public Object getItem() {
		return this.item;
	}
}

class Box2<T> {
	// [ ���׸��� ����� Ŭ���� ]

	private T item;
	// public static T[] itemArray;
	// ����1) static ������� �Ķ���� Ÿ���� ����� �� ����.
	//
	// T[] toArray() {
	// T[] tmpArr = new T[itemArray.length];
	// ����2) �迭�� ������ �� ����� �� ����.
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
		/* ���׸��� �پ��� Ÿ���� ��ü���� ó���ϴ� �޼ҵ峪 �÷��� Ŭ�������� 
		 * ������ �� Ÿ���� üũ�ϴ� ����� ���Ѵ�.
		 * ���α׷� ���� ���� Ÿ���� ���س��� ������ ��ü ������ �������� 
		 * �� ��ȯ�� ���ŷο��� ���� �� �ִ�.
		 */
		Box1 box1 = new Box1();
		box1.setItem(new Japanese());
		// �Ϻ� ��ü�� ���׸��� ������� ���� box1�� �����Ѵ�.
		Japanese j = (Japanese)box1.getItem();
		// �Ϻ� ��ü�� ��ȯ�Ѵ�.
		// ���� Ÿ�� ��ȯ�� �ؾ� �Ѵ�.
		// (Ÿ���� ������ ���� �ʱ� ������)
		
		Box2<Japanese> box2 = new Box2<Japanese>();
		box2.setItem(new Japanese());
		// �Ϻ� ��ü�� ���׸��� ����� box2�� �����Ѵ�.
		Japanese j2 = box2.getItem();
		// ���� Ÿ�� ��ȯ �� �ʿ䰡 ����
	
	}
	
}

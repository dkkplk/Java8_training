import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Map<String,Integer> map = new HashMap<>();
	}

}

class A {
	public void test() {
		System.out.println();
	}

	int number;

	A(int i) {
		number = i;
	}
}

class B extends A {

	int count;

	B(int count, int num) {
		super(num);
		this.count = count;
	}

	B(int count) {

		this(count, 0);
	}

}
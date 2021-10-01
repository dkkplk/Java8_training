
public class Test {

	public static void main(String[] args) {

		Addition sum = (a,b) -> System.out.println("Addition is " + (a+b));
		
		sum.add(10, 20);
	}

}

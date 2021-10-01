import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJoinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();

		Predicate<Collection> p1 = c -> c.isEmpty();

		int[] x = { 0, 5, 10, 15, 20, 25, 30 };

		Predicate<Integer> p2 = i -> i > 10;
		Predicate<Integer> p3 = i -> i % 2 == 0;

		System.out.println("Numbers greter than 0 are ");
		m1(p2, x);

		System.out.println();
		System.out.println("Numbers less than 10 are");
		m1(p2.negate(), x);

		System.out.println();
		System.out.println("Numbers greter than 10 and even numbers");
		m1(p2.and(p3), x);

		System.out.println();

		System.out.println("Numbers are greater that 10 or even numbers");
		m1(p2.or(p3), x);

	}

	private static void m1(Predicate<Integer> p, int[] x) {
		// TODO Auto-generated method stub

		for (int i : x) {
			if (p.test(i)) {
				System.out.print(" " + i);
			}
		}
	}

}

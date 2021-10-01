import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Predicate<Integer> p =  (i) -> i >100;
		
		Predicate<Collection> p1 = c -> c.isEmpty();
		
		System.out.println(p.test(190));

		List<Integer> list = new ArrayList<>();
		list.add(1);
		
		System.out.println(p1.test(list));
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		System.out.println(p1.test(list1));
		
	}

}

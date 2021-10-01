import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(0);
		list.add(20);
		list.add(15);
		list.add(5);
		list.add(20);

		System.out.println("Befor Sortig " + list);
		Collections.sort(list, (i1, i2) -> (i1 - i2));
		System.out.println("After Sorting " + list);
		Collections.sort(list, (i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		System.out.println("After new formula " + list);

		Set<Integer> set = new TreeSet<Integer>();

		set.add(10);
		set.add(0);
		set.add(5);
		set.add(15);
		set.add(20);
		set.add(0);
		set.add(10);

		System.out.println("Set output " + set);

		set = new TreeSet<Integer>((i1, i2) -> (i2 - i1));
		set.add(10);
		set.add(0);
		set.add(5);
		set.add(15);
		set.add(20);
		set.add(0);
		set.add(10);

		System.out.println("Set output with Comparator" + set);

		Map<Integer, String> map = new TreeMap<>();
		map.put(10, "Test");
		map.put(5, "Best");
		map.put(15, "nest");
		map.put(5, "zest");
		map.put(20, "pest");
		map.put(10, "gest");

		System.out.println("Map output " + map);

		map = new TreeMap<Integer, String>((i1, i2) -> (i2 - i1));
		map.put(10, "Test");
		map.put(5, "Best");
		map.put(15, "nest");
		map.put(5, "zest");
		map.put(20, "pest");
		map.put(10, "gest");

		System.out.println("Map output with Comparator" + map);

	}

}

package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.compress.harmony.pack200.NewAttributeBands.Integral;
import org.testng.annotations.Test;

public class CheckingOrder {

	@Test
	void ordering() {

		List list = new ArrayList();

		list.add(5);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(1);

		System.out.println(list);

		System.out.println("----------------------------------------");

		Set<Integer> set = new HashSet<Integer>();
		set.add(5);
		set.add(4);
		set.add(5);
		set.add(2);
		set.add(1);

		System.out.println(set);

		System.out.println("----------------------------------------");

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 5);
		map.put(1, 4);
		map.put(11, 5);
		map.put(3, 2);
		map.put(2, 1);

		System.out.println(map);

		System.out.println("----------------------------------------");

	}

}

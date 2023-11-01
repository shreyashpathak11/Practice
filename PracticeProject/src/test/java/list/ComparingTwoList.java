package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class ComparingTwoList {

	@Test
	void abc() {

		Integer a[] = new Integer[] { 10, 9, 8, 6, 5, 7, 1, 2, 3, 4 };
		int[] b = { 10, 9, 8, 6, 5, 7, 1, 2, 3, 4 };

		List<Integer> l1 = Arrays.asList(a);
		List<int[]> l2 = Arrays.asList(b);

		// l1.size();

		System.out.println(l1.size());

	}

}

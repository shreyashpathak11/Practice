package arrayss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class DuplicateElementinArray {

	@Test
	void dea() {

		Integer[] a = { 1, 1 };

		Integer[] b = { 2, 2 };

		ArrayList<Integer> l1 = (ArrayList<Integer>) Arrays.asList(a);

		ArrayList<Integer> l2 = (ArrayList<Integer>) Arrays.asList(b);

		l1.addAll(l2);

		System.out.println(l1);

	}

}

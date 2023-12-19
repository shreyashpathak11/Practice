package arunMootori;

import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

import org.apache.commons.math3.stat.descriptive.summary.Sum;
import org.testng.annotations.Test;

public class MultiplicationOf2 {

	@Test
	void multiply() {

		String s = "shreyash Pathak";

		char[] ca = s.toCharArray();

		Map<Character, Integer> m = new HashMap<Character, Integer>();

		for (Character c : ca) {

			if (m.containsKey(c)) {

				m.put(c, m.get(c) + 1);
			} else {

				m.put(c, 1);
			}

		}

		System.out.println(m);

		for (Character c : m.keySet()) {

			if (m.get(c) > 1) {

				System.out.println(c + " is " + m.get(c) + " times in String S");

			}

			else {
				System.out.println("------------------");
				System.out.println(c + " is " + m.get(c) + " times in String S");
			}
		}

	}

}

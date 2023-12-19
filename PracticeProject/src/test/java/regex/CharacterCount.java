package regex;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class CharacterCount {

	@Test
	void ccount() {

		String name = "shreyash";

		char[] ca = name.toCharArray();

		Map<Character, Integer> m = new HashMap<Character, Integer>();

		for (Character c : ca) {

			if (m.containsKey(c)) {

				m.put(c, m.get(c) + 1);

			} else {
				m.put(c, 1);
			}

		}

		for (Character c : m.keySet()) {

			if (m.get(c) > 1) {

				System.out.println(c + " and Count is " + m.get(c));

			} else {
				System.out.println(c + " and Count is " + m.get(c));
			}

		}

	}

}

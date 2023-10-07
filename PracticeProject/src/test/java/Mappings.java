import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Mappings {

	@Test
	void mapps() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a charater");
		char c = sc.next().charAt(0);

		HashMap<Character, String> maps = new HashMap<Character, String>();

		maps.put('A', "Excellent");
		maps.put('B', "Good");
		maps.put('C', "Average");
		maps.put('D', "Deficient");
		maps.put('E', "Failing");

		if (c == 'A' || c == 'B' || c == 'C' || c == 'D' || c == 'E') {
			System.out.println("Your Grade is: " + maps.get(c));
		}

	}

}

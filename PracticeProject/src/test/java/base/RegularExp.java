package base;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class RegularExp {

	@Test
	void regex1() {

		List<String> l1 = new ArrayList<String>();
		l1.add("shreyash.pathak11@gmail.com");
		l1.add("abc@gmail.com");

		String pattern = "[a-zA-Z0-9].+@gmail.com";
		Pattern p = Pattern.compile(pattern);

		for (int i = 0; i < l1.size(); i++) {

			Matcher matcher = p.matcher(l1.get(i));
			boolean b = matcher.matches();
			System.out.println(b);

		}

	}

}

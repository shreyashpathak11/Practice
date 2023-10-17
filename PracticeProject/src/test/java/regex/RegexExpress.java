package regex;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class RegexExpress {

	@Test
	void check() {

		List<String> list = new ArrayList<String>();
		list.add("sp11@gmail.com");
		list.add("sp11@gmailt.com");

		String pattern = "[0-9a-zA-Z].*@gmail.com";

		Pattern p = Pattern.compile(pattern);

		for (String checks : list) {

			Matcher matcher = p.matcher(checks);
			boolean b = matcher.matches();
			System.out.println(checks + " is " + b);

		}

	}

}

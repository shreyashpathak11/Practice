package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {

		String s = "Shreyash.pathak11@gmail.com";

		Pattern p = Pattern.compile("[a-zA-Z0-9].+@gmail.com");

		Matcher b = p.matcher(s);	

	}

}

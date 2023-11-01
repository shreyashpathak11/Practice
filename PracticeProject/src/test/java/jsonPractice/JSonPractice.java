package jsonPractice;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class JSonPractice {

	@Test
	void pract() throws Exception {

		JSONParser parser = new JSONParser();

		FileReader fileReader = new FileReader(
				"C:\\Users\\Shreyash Pathak\\repository\\practice\\PracticeProject\\example.json");

		Object object = parser.parse(fileReader);

		JSONObject jsonObject = (JSONObject) object;
		String id1 = (String) jsonObject.get("id");
		System.out.println(id1);

		JSONArray array = (JSONArray) jsonObject.get("name");

		for (int i = 0; i < array.size(); i++) {

			JSONObject object2 = (JSONObject) array.get(i);
			String s = (String) object2.get("Noun");
			if (s.equalsIgnoreCase("sachin")) {
				System.out.println(s);
			}
		}

		Long long1 = (Long) jsonObject.get("age");

		System.out.println(long1);
	}

}

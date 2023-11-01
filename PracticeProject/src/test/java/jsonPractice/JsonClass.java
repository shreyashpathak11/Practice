package jsonPractice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class JsonClass {

	@Test
	void jsonMethod() throws Exception {

		JSONParser jp = new JSONParser();

		FileReader readery = new FileReader(
				"C:\\Users\\\\Shreyash Pathak\\repository\\practice\\PracticeProject\\example.json");

		Object obj = jp.parse(readery);

		JSONObject jsonObject = (JSONObject) obj;
		// jsonObject.

		System.out.println(jsonObject.get("name"));

		JSONArray array = (JSONArray) jsonObject.get("employee");

		JSONObject objects = (JSONObject) array.get(0);

		System.out.println(objects.get("id"));
//		System.out.println(ids);

	}

}

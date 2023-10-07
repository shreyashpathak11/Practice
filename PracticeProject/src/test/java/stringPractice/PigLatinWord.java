package stringPractice;

import org.testng.annotations.Test;

import io.opentelemetry.semconv.trace.attributes.SemanticAttributes.FaasTriggerValues;

public class PigLatinWord {

	@Test
	void plw() {

		String englishWord = "Rajesh";

		char[] c = englishWord.toCharArray();

		String newWord = "";

		for (int i = 0; i < 3; i++) {

			newWord = newWord + c[i];

		}

		String newestWord = englishWord.replaceFirst(newWord, "");

		System.out.println(newestWord + newWord + "ji");
	}

}

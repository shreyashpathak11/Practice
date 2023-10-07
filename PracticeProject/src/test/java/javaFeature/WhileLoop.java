package javaFeature;

import java.awt.event.WindowListener;

import org.testng.annotations.Test;

public class WhileLoop {

	@Test
	void wl() {

		int i = 0;
		while (i < 10) {

			System.out.println(i);
			i++;
		}

	}

}

package com.bottega;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.Test;

public class DrivserSetup {


	@Test
	public void should_() throws Exception {
		ChromeDriverManager.getInstance().setup();
	}
}

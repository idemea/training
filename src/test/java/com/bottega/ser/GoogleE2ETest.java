package com.bottega.ser;

import com.bottega.ser.steps.SearcherSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class GoogleE2ETest {

	//-Dwebdriver.chrome.driver=
	@Managed
	WebDriver driver;

	@Steps
	SearcherSteps searcher;

	@Test
	public void should_search_for_animal() throws Exception {
		searcher.opensGooglePage();

		searcher.searchesForCow("krowa");

		searcher.shouldSeeResultsRelatedTo("krow");
	}

}

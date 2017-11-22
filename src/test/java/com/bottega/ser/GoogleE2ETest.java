package com.bottega.ser;

import com.bottega.ser.steps.SearcherSteps;
import cucumber.api.java.lv.Tad;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class GoogleE2ETest {

	//-Dwebdriver.chrome.driver=
	//-Dchrome.switches="--headless --disable-gpu"
	@Managed
	WebDriver driver;

	@Steps
	SearcherSteps searcher;

	@Test
	@WithTag("slow")
	public void should_search_for_animal() throws Exception {
		searcher.opensGooglePage();

		searcher.searchesForCow("krowa");

		searcher.shouldSeeResultsRelatedTo("krow");
	}

	@Test
	@Ignore
	@WithTag("slow")
	public void should_search_for_animal2() throws Exception {
		searcher.opensGooglePage();

		searcher.searchesForCow("krowa");

		searcher.shouldSeeResultsRelatedTo("krow");
	}
	@Test
	@Ignore
	@WithTag("slow")
	public void should_search_for_animal3() throws Exception {
		searcher.opensGooglePage();

		searcher.searchesForCow("krowa");

		searcher.shouldSeeResultsRelatedTo("krow");
	}

}

package com.bottega.ser.steps;

import com.bottega.ser.pages.GoogleResultPage;
import com.bottega.ser.pages.GoogleSearchPage;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;

import java.util.List;

public class SearcherSteps {

	GoogleSearchPage searchPage;
	GoogleResultPage resultPage;

	@Step
	public void opensGooglePage() {
		searchPage.open();
	}

	@Step
	public void searchesForCow(String animal) {
		searchPage.searchFor(animal);
	}

	@Step
	public void shouldSeeResultsRelatedTo(String animal) {
		List<String> results = resultPage.getResultTitles();

		for (String result : results) {
			Assertions.assertThat(result).containsIgnoringCase(animal);
		}
	}
}

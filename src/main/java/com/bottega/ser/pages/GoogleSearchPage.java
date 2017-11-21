package com.bottega.ser.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://google.com")
public class GoogleSearchPage extends PageObject{

	@FindBy(name = "q")
	WebElement searchInput;

	public void searchFor(String text) {
		searchInput.sendKeys(text);
		searchInput.submit();
	}

}

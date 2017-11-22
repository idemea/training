package com.bottega.ser.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.At;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

@At("#host/sdfsdf/sdfdsf/sdfsd")
public class GoogleResultPage extends PageObject{

	@FindBy(xpath = "//h3[@class='r']/a")
	List<WebElement> resultTitles;

	public List<String> getResultTitles() {

		waitForRenderedElements(By.id("resultStats"));

		return resultTitles.stream()
				.map(WebElement::getText)
				.collect(Collectors.toList());
	}
}

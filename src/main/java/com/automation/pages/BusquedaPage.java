package com.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.elempleo.com/co/")
public class BusquedaPage extends PageObject {
	
	@FindBy(xpath = "//input[@placeholder= 'Busca por cargo, profesión o empresa']")
	WebElementFacade txtprofesion;
	
	@FindBy(xpath = "//input[@placeholder= '¿En qué ciudad?']")
	WebElementFacade txtciudad;
	
	@FindBy(xpath = "//div[@class = 'tt-suggestion ee-typeahead-selectable']")
	WebElementFacade txtprimero;
	
	@FindBy(xpath = "//div[@class = 'col-sm-5 no-padding-left no-padding-right city-container']/div/span/div/div/div[@class='tt-suggestion ee-typeahead-selectable']/strong")
	WebElementFacade txtciupri;
	
	@FindBy(xpath = "//*[@id=\"politics_cookieCO\"]/div/div[2]/a[2]")
	WebElementFacade cookie;
	
	public void realizarbusqueda(String profesion, String ciudad) throws InterruptedException {
		
		cookie.click();
		txtprofesion.sendKeys(profesion);
		txtprimero.click();
		txtciudad.sendKeys(ciudad);
		Thread.sleep(2000);
		txtciupri.click();
		
	}

}

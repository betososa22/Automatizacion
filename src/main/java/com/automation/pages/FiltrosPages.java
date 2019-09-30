package com.automation.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class FiltrosPages extends PageObject {

	GuardarInfo texto;
	
	WebDriver driver = getDriver();
	
	@FindBy(xpath = "//*[@id=\"salary3\"]")
	WebElementFacade salario;
	
	@FindBy(xpath="/html/body/div[8]/div[4]/div[2]/div[1]/div/div[3]/div/div[2]/label")
	WebElementFacade tiempo;
	
	@FindBy(xpath="//*[@id=\"WorkAreaFilter1\"]/option[2]")
	WebElementFacade tipo;
		
	
	public void selecfiltros () throws InterruptedException {
		

		salario.click();
		Thread.sleep(4000);
		JavascriptExecutor pan = (JavascriptExecutor) getDriver();  
		pan.executeScript("window.scrollBy(0,700)");
		Thread.sleep(8000);	
		tiempo.click();
		Thread.sleep(8000);	
		JavascriptExecutor scr = (JavascriptExecutor) getDriver();  
		scr.executeScript("window.scrollBy(0,800)");
		tipo.click();
		
		
		
	}
	

	
	
	
}

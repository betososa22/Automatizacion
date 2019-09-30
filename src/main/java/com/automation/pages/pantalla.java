package com.automation.pages;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import net.serenitybdd.core.pages.PageObject;

public class pantalla extends PageObject{
	

	public void toamrcaptura () {
		
		//Captura de pantalla
		File srcfile= ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
				try {
					FileHandler.copy(srcfile, new File("pantalla/screen.png"));
				}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

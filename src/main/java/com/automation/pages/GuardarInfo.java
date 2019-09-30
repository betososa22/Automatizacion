package com.automation.pages;

import java.io.FileWriter;
import java.io.PrintWriter;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class GuardarInfo extends PageObject {

	public void guardartxt() {
	
	FileWriter archivo = null;
	PrintWriter ab= null;
	
	try {
		
		archivo = new FileWriter("Vacantes.txt");
		ab = new PrintWriter(archivo);
		
		for (int i = 1; i<21; i++) {
			
			String vacante = getDriver().findElement(By.xpath("//div["+i+"]/div[1]/ul/li/h2/a")).getAttribute("title");
			String empresa = getDriver().findElement(By.xpath("//div["+i+"]/div[1]/ul/li/h3/span/span")).getText();
			ab.println(i + " = " + vacante + " / " + empresa);
			
		}
		
	}
	
	catch(Exception e) {
	e.printStackTrace();
	}
	
	finally {
		
		try {
			if (null != archivo)
				archivo.close();
			
		}
		catch(Exception e2) {
			
			e2.printStackTrace();
		}
		
		
	}
	
	}
}

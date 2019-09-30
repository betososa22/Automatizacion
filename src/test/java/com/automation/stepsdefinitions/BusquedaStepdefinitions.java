package com.automation.stepsdefinitions;

import com.automation.pages.GuardarInfo;
import com.automation.pages.pantalla;
import com.automation.steps.BusquedaSteps;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class BusquedaStepdefinitions {
	
	@Steps
	BusquedaSteps busqueda;
	GuardarInfo txt;
	pantalla pan;

	
	@Dado("^que estoy en la pagina de elempleo\\.com$")
	public void queEstoyEnLaPaginaDeElempleoCom() {
	    
		busqueda.abrirpagina();
		
	}

	@Cuando("^ingreso el filtro de (.*) y (.*)")
	public void ingresoElFiltroDeCont(String profesion,String ciudad) throws InterruptedException {
		
		busqueda.buscar(profesion, ciudad);
		busqueda.filtrospag();
	    
	}

	@Entonces("^puedo ingresar a ver las ofertas disponibles$")
	public void puedoIngresarAVerLasOfertasDisponibles() {
	    
		txt.guardartxt();
		pan.toamrcaptura();
		
	}

}

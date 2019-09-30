package com.automation.steps;

import com.automation.pages.BusquedaPage;
import com.automation.pages.FiltrosPages;

import net.thucydides.core.annotations.Step;

public class BusquedaSteps {
	
	BusquedaPage pagina1;
	FiltrosPages filtro;
	
	@Step
	public void abrirpagina() {
		
		pagina1.open();
		
	}
	
	public void buscar(String profesion , String ciudad) throws InterruptedException {
		
		pagina1.realizarbusqueda(profesion, ciudad);
		
	}
	
	public void filtrospag () throws InterruptedException {
		
		filtro.selecfiltros();
		
	}

}

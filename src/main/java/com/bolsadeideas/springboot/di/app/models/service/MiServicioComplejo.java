package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//Alagregar la anotacion component, se convierte en un singleton

@Component("miServicioComplejo")
@Primary
public class MiServicioComplejo implements IServicio{
	
	@Override
	public String operacion() {
		return "Ejecutando algún proceso complejo";
	}
}

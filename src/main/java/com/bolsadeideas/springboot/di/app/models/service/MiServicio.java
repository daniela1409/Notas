package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//Alagregar la anotacion component, se convierte en un singleton

@Component("miServicioSimple")
public class MiServicio implements IServicio{
	
	@Override
	public String operacion() {
		return "Ejecutando algún proceso simple";
	}
}

/*@Service
public class MiServicio {
	public String operacion() {
		return "Ejecutando algún proceso";
	}
}
*/

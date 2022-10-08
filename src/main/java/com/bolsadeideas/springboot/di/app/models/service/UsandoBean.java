package com.bolsadeideas.springboot.di.app.models.service;

public class UsandoBean implements IServicio{

	//Se quita la anotacion component, se crea clase AppConfig donde se configura con
	//anotacion configuration y bean
	@Override
	public String operacion() {
		return "Ejecutando algún proceso simple usando bean en AppConfig";
	}
}

package com.bolsadeideas.springboot.di.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.bolsadeideas.springboot.di.app.models.service.IServicio;
import com.bolsadeideas.springboot.di.app.models.service.UsandoBean;

@Configuration
public class AppConfig {
	
	@Bean("usandoBean")
	public IServicio registrarMiServicio() {
		return new UsandoBean();
	}
}

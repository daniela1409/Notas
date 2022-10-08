package com.bolsadeideas.springboot.di.app.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.models.service.IServicio;

@Controller
public class IndexController {

	@Autowired
	@Qualifier("usandoBean") //me implementará la clase que tiene asignada este nombre
	private IServicio servicio;
	
	//private IServicio servicio;

	@GetMapping({ "/", "index", "" })
	public String index(Model model) {

		model.addAttribute("objeto", servicio.operacion());

		return "index";
	}

	public IServicio getServicio() {
		return servicio;
	}

	/*@Autowired  //Se puede omitir
	public IndexController(IServicio servicio) {
		this.servicio = servicio;
	}*/

	/*@Autowired
	public void setServicio(IServicio servicio) {
		this.servicio = servicio;
	}*/
	
	
	
}

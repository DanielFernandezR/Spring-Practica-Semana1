package org.formacio.mvc;

import org.formacio.component.ServeiAlumnat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PeticionesWeb {

	@Autowired
	private ServeiAlumnat alumnos;
	
	@RequestMapping(path="/alumnes")
	// Cuando el servidor reciba la peticion / ejecuta este metodo
	@ResponseBody
	// la respuesta del metodo sera el elemento body del doc html
	public int llistaAlumnes(){
		return alumnos.llistaAlumnes();
	}

}

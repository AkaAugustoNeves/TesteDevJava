package com.augusto.testeprogramacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.augusto.testeprogramacao.model.dto.Desafio2DTO;
import com.augusto.testeprogramacao.model.form.ArrayForm;
import com.augusto.testeprogramacao.service.ArrayService;

@RestController
@RequestMapping("/desafio2")
public class Desafio2Controller {

	@Autowired
	private ArrayService arrayService;
	
	@PostMapping()
	public ResponseEntity<Desafio2DTO> desafio1(@RequestBody ArrayForm form) {	
		return arrayService.ordenarArray(form.getArray(), form.getLessThan());
	}
	
}

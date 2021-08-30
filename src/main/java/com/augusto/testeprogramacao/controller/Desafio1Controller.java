package com.augusto.testeprogramacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.augusto.testeprogramacao.model.Trem;
import com.augusto.testeprogramacao.model.form.VagaoForm;
import com.augusto.testeprogramacao.service.TremService;

@RestController
@RequestMapping("/desafio1")
public class Desafio1Controller {

	@Autowired
	private TremService tremService;
	
	private Trem trem = new Trem(1L, "trem", new int[] {13,7});
	
	@PostMapping()
	public ResponseEntity<?> addVagao(@RequestBody VagaoForm form){
		int[] vagoes = tremService.atracar(this.trem, form.getLado().toUpperCase(), form.getNumero());
		if (vagoes.length == 0) {
			return ResponseEntity.badRequest().body("verifique o campo 'lado', pois, o mesmo deve ser 'Esquerda' ou 'direita'. ");
		}
		this.trem.setVagoes(vagoes);
		return ResponseEntity.ok().body(this.trem.getVagoes());
	}
	
}

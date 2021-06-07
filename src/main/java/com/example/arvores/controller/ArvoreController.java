package com.example.arvores.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.arvores.model.Arvore;
import com.example.arvores.model.BancoFake;

@Controller
public class ArvoreController {

	@RequestMapping(method = RequestMethod.GET, value = "/cadastroarvore")
	public String inicio() {
		return "cadastroarvore";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/cadastroarvore")
	public String cadastrarArvore(Arvore arvore) {
		BancoFake.save(arvore);
		BancoFake.findAll().forEach(a -> System.out.println(a));
		return "index";
	}
	@RequestMapping(method = RequestMethod.GET, value = "/pesquisararvore")
	public String pesquisarArvore (@RequestParam("especie") String especie, ModelMap model) {
		List<Arvore> arvores = new ArrayList<>();
		for (Arvore arvore : BancoFake.findAll()) {
			if(arvore.getEspecie().equalsIgnoreCase(especie.toLowerCase())) {
				arvores.add(arvore);
			}
		}
		model.put("arvores", arvores);
		System.out.println(especie);
		System.out.println(arvores.size());
		return "lista";
	}
}

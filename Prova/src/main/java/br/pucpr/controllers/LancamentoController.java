package br.pucpr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LancamentoController {

	@RequestMapping("/inserirLancamento")
	public String inserirLancamento(){
		
		return "InserirLancamento";
	}
	
	@RequestMapping("/ListaLancamentos")
	public String listaLancamentos(){
		
		return "ListaLancamentos";
	}
}

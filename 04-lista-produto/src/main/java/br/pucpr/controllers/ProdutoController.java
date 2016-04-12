package br.pucpr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.pucpr.models.Produto;
import br.pucpr.models.ProdutoService;

@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping("/produtos")
	public String todos(@RequestParam(value="categoriaId", required=false)
						Long id, Model model) 
	{
		if(id == null)
		{
			model.addAttribute("produtos", produtoService.obterTodos());
		}
		else
		{
			model.addAttribute("produtos", produtoService.obterProCategoria(id));
		}
		
		return "produtos";
	}
	
	@RequestMapping("/detalhe/{id}")
	public String detalhe(@PathVariable("id") long id, Model model){
		
		Produto produto;
		produto = produtoService.obterPorId(id);
		model.addAttribute("produto", produto);
		return "produto-detalhe";
	}
}

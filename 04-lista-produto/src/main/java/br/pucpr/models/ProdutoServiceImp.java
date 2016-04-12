package br.pucpr.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImp implements ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Override
	public List<Produto> obterTodos() {
		
		return produtoRepository.obterTodos();
	}

	@Override
	public Produto obterPorId(long id){
		
		return produtoRepository.obterPorId(id);
	}
	
	@Override
	public List<Produto> obterProCategoria(long id) {
		
		return produtoRepository.obterPorCategoria(id);
	}
}

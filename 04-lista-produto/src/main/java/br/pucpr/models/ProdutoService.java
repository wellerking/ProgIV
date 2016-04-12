package br.pucpr.models;

import java.util.List;

public interface ProdutoService {

	List<Produto> obterTodos();
	Produto obterPorId(long id);
	List<Produto> obterProCategoria(long id);
}

package br.pucpr.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LancamentoServiceImp implements LancamentoService{

	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	@Override
	public void inserir(Lancamento lancamento) {
		
		lancamentoRepository.inserirLancamento(lancamento);
	}
}

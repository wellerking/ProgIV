package br.pucpr.models;

import java.util.Date;

public class Lancamento {

	private Long    id;
	private Date    dataLancamento;
	private String  descricao;
	private Long    valor;
	private Boolean tipo;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getDataLancamento() {
		return dataLancamento;
	}
	
	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Long getValor() {
		return valor;
	}
	
	public void setValor(Long valor) {
		if(valor > 0){
			this.valor = valor;
		}
	}
		
	public Boolean getTipo() {
		return tipo;
	}
	
	public void setTipo(Boolean tipo) {
		this.tipo = tipo;
	}
}

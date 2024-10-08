package br.com.farmacia.domain;

public class Fornecedores {
	private Long codigo;
	private String descricao;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(long i) {
		this.codigo = i;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		String saida = codigo + " - " + descricao;
		return saida;
	}
}

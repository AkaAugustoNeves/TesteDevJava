package com.augusto.testeprogramacao.model;

public class Trem {

	private Long id;
	private String nome;
	private int[] vagoes;
	
	public Trem(Long id, String nome, int[] vagoes) {
		this.id = id;
		this.nome = nome;
		this.vagoes = vagoes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int[] getVagoes() {
		return vagoes;
	}

	public void setVagoes(int[] vagoes) {
		this.vagoes = vagoes;
	}
	
}

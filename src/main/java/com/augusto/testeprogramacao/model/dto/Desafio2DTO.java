package com.augusto.testeprogramacao.model.dto;

public class Desafio2DTO {
	
	private int[] arrayOrdenado;
	private int qtdElementosMenores;
	
	public Desafio2DTO(int[] array, int qtdElementosMenores) {
		this.arrayOrdenado = array;
		this.qtdElementosMenores = qtdElementosMenores;
	}

	public int[] getArrayOrdenado() {
		return arrayOrdenado;
	}

	public void setArrayOrdenado(int[] arrayOrdenado) {
		this.arrayOrdenado = arrayOrdenado;
	}

	public int getQtdElementosMenores() {
		return qtdElementosMenores;
	}

	public void setQtdElementosMenores(int qtdElementosMenores) {
		this.qtdElementosMenores = qtdElementosMenores;
	}
	
	
}

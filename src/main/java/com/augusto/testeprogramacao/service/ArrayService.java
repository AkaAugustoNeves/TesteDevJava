package com.augusto.testeprogramacao.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.augusto.testeprogramacao.model.dto.Desafio2DTO;

@Service
public class ArrayService {
	
	public ResponseEntity<Desafio2DTO> ordenarArray(int[] array, int lessThan){
		if(array == null || array.length == 0 ) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(
				new Desafio2DTO(
						ordena(array),
						verificaLess(array, lessThan)
				)	
		) ;
	}

	public void troca(int a, int b, int[] array) {
		int aux = array[a];
		array[a] = array[b];
		array[b] = aux;
	}
	
	public int[] ordena(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i] > array[j]) {
					troca(i,j,array);
				}
			}
		}
		return array;
	}
	
	public int verificaLess(int[] array, int lessThan) {
		int count= 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < lessThan) {
				count = count + 1;
			}
		}
		return count;
	}
	
	
}

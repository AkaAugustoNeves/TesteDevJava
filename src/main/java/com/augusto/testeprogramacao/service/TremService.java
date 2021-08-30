package com.augusto.testeprogramacao.service;
import org.springframework.stereotype.Service;
import com.augusto.testeprogramacao.model.Trem;

@Service
public class TremService {

	public int[] atracar(Trem trem, String lado, int numero) {		
		if (lado.equals("DIREITA") || lado.equals("ESQUERDA") ) {
			return atracarTrem(trem, lado, numero);

		}else {
			return new int[0];
		}
	}
	
	public int[] atracarTrem(Trem trem, String lado , int numero) {
		int[] aux = new int [trem.getVagoes().length + 1];
		if(lado.equals("ESQUERDA")) {
			aux[0] = numero;
			System.out.println(aux[0]); 
			for (int i = 1; i < aux.length ; i++) {
				aux[i] = trem.getVagoes()[(i-1)];
			}
			return aux;
		}else {
			for (int i = 0; i < aux.length -1; i++) {
				aux[i] = trem.getVagoes()[i];
			}
			aux[aux.length - 1] = numero;
			return aux;
		}
	}

}

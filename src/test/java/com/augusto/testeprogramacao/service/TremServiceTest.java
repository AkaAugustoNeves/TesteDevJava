package com.augusto.testeprogramacao.service;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.augusto.testeprogramacao.model.Trem;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class TremServiceTest {

	@Autowired
	private TremService tremService;
	
	private Trem trem = new Trem(1L, "trem", new int[] {13,7});
	private int[] responseAtraca = new int[] {13, 7, 21};
	
	@Test
	public void atracarTest() {
		int[] result = tremService.atracar(this.trem, "DIREITA", 21);
		assertArrayEquals(result, this.responseAtraca);
	}
	
}

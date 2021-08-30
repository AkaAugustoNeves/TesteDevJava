package com.augusto.testeprogramacao.service;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class ArrayServiceTest {

	@Autowired
	private ArrayService arrayService;
	
	int[] base = new int[] {7, 9, 8, 0, 4, 1, 1, 5};
	int[] responseOrdena = new int[] {0, 1, 1, 4, 5, 7, 8, 9};
	int lessThan = 6;
	
	@Test
	public void ordenaTest() {
		int[] result =  arrayService.ordena(this.base);
		assertArrayEquals(result, this.responseOrdena);
	}
	
	@Test
	public void verificaLessTest() {
		int result = arrayService.verificaLess(this.base, this.lessThan);
		assertEquals(result, 5);
	}
	
	
}

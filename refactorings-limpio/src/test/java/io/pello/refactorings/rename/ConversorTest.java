package io.pello.refactorings.rename;

import io.pello.refactorings.rename.refactored.Conversor;
import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorTest {


	@Test
	public void testConvWithZero() {
		Conversor conversor = new Conversor();
		float expected = 0;
		float actual = conversor.eurosToPesetas(0);
		
		assertEquals("Converts 0 to 0", actual, expected, 0.01f);
	}

	@Test
	public void testConv() {
		Conversor conversor = new Conversor();
		float expected = 9983.16f;
		float actual = conversor.eurosToPesetas(60);
		
		assertEquals("Converts euros to pesetas", actual, expected, 0.01f);
	}
}

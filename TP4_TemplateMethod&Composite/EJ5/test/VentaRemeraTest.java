package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import modelo.Remera;
import modelo.RemeraImportada;
import modelo.RemeraNacional;

class VentaRemeraTest {

	@Test
	void testRemeraImportada() {
		Remera remeraImp = new RemeraImportada(100);

		double resultado = remeraImp.calcularPrecioVenta();

		Assert.assertEquals(133, resultado, 0.01);
	}

	@Test
	void testRemeraNacional() {
		Remera remeraNac = new RemeraNacional(100);

		double resultado = remeraNac.calcularPrecioVenta();

		Assert.assertEquals(136.5, resultado, 0.01);
	}

}

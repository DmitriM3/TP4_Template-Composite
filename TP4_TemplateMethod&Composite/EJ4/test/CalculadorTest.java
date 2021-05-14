package test;

import static java.time.LocalDate.now;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import modelo.Calculador;
import modelo.CalculadorJubilado;
import modelo.CalculadorNoJubilado;

class CalculadorTest {

	@Test
	void jubiladoSinPromocionTest() {

		Calculador jubilado = new CalculadorJubilado(now().getMonth().getValue() - 1);

		double resultado = jubilado.calcularPrecio(100);

		Assert.assertEquals(110, resultado, 0.01);

	}

	@Test
	void jubiladoConPromocionTest() {

		Calculador jubilado = new CalculadorJubilado(now().getMonth().getValue());

		double resultado = jubilado.calcularPrecio(100);

		Assert.assertEquals(100, resultado, 0.01);

	}

	@Test
	void noJubiladoSinPromocionTest() {

		Calculador jubilado = new CalculadorNoJubilado(now().getMonth().getValue() - 1);

		double resultado = jubilado.calcularPrecio(100);

		Assert.assertEquals(121, resultado, 0.01);

	}

	@Test
	void noJubiladoConPromocionTest() {

		Calculador jubilado = new CalculadorNoJubilado(now().getMonth().getValue());

		double resultado = jubilado.calcularPrecio(100);

		Assert.assertEquals(115, resultado, 0.01);

	}

}

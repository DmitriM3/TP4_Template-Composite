package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import modelo.Director;
import modelo.EmpleadoJefe;
import modelo.Gerente;
import modelo.LiderDeProyecto;
import modelo.MandoMedio;
import modelo.Regular;

class EmpleadosTest {

	@Test
	void calcularMontoTotalSalarial() {

		EmpleadoJefe liderProyecto = new LiderDeProyecto(1000);
		liderProyecto.agregarEmpleado(new Regular(500));
		liderProyecto.agregarEmpleado(new Regular(500));
		EmpleadoJefe mandoMedio = new MandoMedio(1500);
		mandoMedio.agregarEmpleado(liderProyecto);
		EmpleadoJefe gerente = new Gerente(2000);
		gerente.agregarEmpleado(mandoMedio);
		EmpleadoJefe director = new Director(2500);
		director.agregarEmpleado(gerente);
		// EJERCITACION
		double total = director.cacularMontoTotaldeSueldos();
		// VERIFICACION
		Assert.assertEquals(8000.0, total, 0.001);
	}

}

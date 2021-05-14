package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import modelo.Spike;
import modelo.Tarea;
import modelo.UserStory;

class ScrumItemsTest {

	@Test
	void calcularTiempoEstimadoDeProyecto20Puntos() {
		// SETUP
		UserStory us1 = new UserStory(5);
		us1.agregarItem(new Spike(2));
		us1.agregarItem(new Spike(3));
		us1.agregarItem(new Spike(3));
		us1.agregarItem(new Tarea(2));
		us1.agregarItem(new Tarea(5));
		// EJERCITACION
		int tiempoEstimado = us1.calcularTiempo();
		// VERIFICACION
		Assert.assertEquals(20, tiempoEstimado);
	}

}

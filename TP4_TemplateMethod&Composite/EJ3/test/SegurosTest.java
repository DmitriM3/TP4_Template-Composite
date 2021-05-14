package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import modelo.AutomovilSeguros;
import modelo.HogarSeguros;
import modelo.MedicosSeguros;
import modelo.PaquetesSeguros;
import modelo.Seguros;
import modelo.VidaSeguros;

class SegurosTest {

	@Test
	void calculoCostoDeSeguroPaqueteCompleto() {
		AutomovilSeguros autoSeguro = new AutomovilSeguros(2000);// 1900
		HogarSeguros hogarSeguro = new HogarSeguros(5000);// 4750
		MedicosSeguros medicSeguro = new MedicosSeguros(2500);// 2375
		VidaSeguros vidaSeguro = new VidaSeguros(3500);// 3325
		PaquetesSeguros paqueteCompleto = new PaquetesSeguros();
		paqueteCompleto.agregarSeguro(vidaSeguro);
		paqueteCompleto.agregarSeguro(medicSeguro);
		paqueteCompleto.agregarSeguro(hogarSeguro);
		paqueteCompleto.agregarSeguro(autoSeguro);

		double costoCompleto = paqueteCompleto.calcularCosto(); // 12350

		Assert.assertEquals(12350.0, costoCompleto, 0.01);

	}

	@Test
	void calculoCostoDeSeguroSimple() {

		Seguros vida = new VidaSeguros(3500);

		double costoCompleto = vida.calcularCosto();

		Assert.assertEquals(3500.0, costoCompleto, 0.01);

	}

	@Test
	void calculoCostoPaqueteDoble() {
		AutomovilSeguros autoSeguro = new AutomovilSeguros(2000);// 1900
		HogarSeguros hogarSeguro = new HogarSeguros(5000);// 4750
		PaquetesSeguros paquete1 = new PaquetesSeguros();
		paquete1.agregarSeguro(hogarSeguro);
		paquete1.agregarSeguro(autoSeguro);
		MedicosSeguros medicSeguro = new MedicosSeguros(2500);
		VidaSeguros vidaSeguro = new VidaSeguros(3500);
		PaquetesSeguros paquete2 = new PaquetesSeguros();
		paquete2.agregarSeguro(medicSeguro); // 2375
		paquete2.agregarSeguro(vidaSeguro); // 3325
		paquete2.agregarSeguro(paquete1); // 6317.5 = ((1900+4750)*0.95)

		double costoCompleto = paquete2.calcularCosto(); // 12017.5

		Assert.assertEquals(12017.5, costoCompleto, 0.01);
	}

}

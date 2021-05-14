package modelo;

import java.util.ArrayList;
import java.util.List;

public class PaquetesSeguros implements Seguros {
	// Puede contener distintos seguros u otros paquetes de seguros
	private final List<Seguros> segurosHijos = new ArrayList<>();

	public PaquetesSeguros() {
	}

	public void agregarSeguro(Seguros seguros) {
		this.segurosHijos.add(seguros);
	}

	@Override
	public double calcularCosto() {
		double costo = 0;
		for (Seguros seguros : segurosHijos) {
			costo += (seguros.calcularCosto() * (0.95));
		}
		return costo;
	}

}

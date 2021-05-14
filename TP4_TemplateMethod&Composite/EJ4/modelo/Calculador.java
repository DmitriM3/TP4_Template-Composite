package modelo;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {

	private LogTransaction log;
	private int mesEnPromocion;

	public Calculador(int mesEnPromocion) {
		this.log = new LogTransaction();
		this.mesEnPromocion = mesEnPromocion;
	}

	public double calcularPrecio(double precioProducto) {
		log.log(this.getClass().getName());
		if (esMesConPromocion()) {
			return this.mesEnPromocion(precioProducto);
		} else {
			return this.mesSinPromocion(precioProducto);
		}
	}

	protected abstract double mesSinPromocion(double precioProducto);

	protected abstract double mesEnPromocion(double precioProducto);

	protected boolean esMesConPromocion() {
		if (of(this.mesEnPromocion).equals(now().getMonth())) {
			return true;
		} else
			return false;
	}

}
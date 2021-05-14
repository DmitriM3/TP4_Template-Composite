package modelo;

public class RemeraNacional extends Remera {

	public RemeraNacional(double precio) {
		super(precio);
	}

	protected double calcularRecargoTransporte(double precio) {
		return (precio * 0.015);
	}

	protected double calcularImpuestoBonificacion(double precio) {
		return (precio * 0.20);
	}

	protected double calcularImpuestoComercial(double precio) {
		return (precio * 0.15);
	}

	@Override
	protected double calcularRecargo(double precio) {
		return 0;
	}

	@Override
	protected double calcularImpuestoAduanero(double precio) {
		return 0;
	}

}

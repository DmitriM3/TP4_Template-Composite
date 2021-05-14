package modelo;

public class RemeraImportada extends Remera {

	public RemeraImportada(double precio) {
		super(precio);
	}

	protected double calcularRecargo(double precio) {
		return (precio * 0.03);
	}

	protected double calcularImpuestoAduanero(double precio) {
		return (precio * 0.05);
	}

	protected double calcularImpuestoComercial(double precio) {
		return (precio * 0.25);
	}

	@Override
	protected double calcularRecargoTransporte(double precio) {
		return 0;
	}

	@Override
	protected double calcularImpuestoBonificacion(double precio) {
		return 0;
	}

}

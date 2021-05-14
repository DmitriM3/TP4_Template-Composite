package modelo;

public abstract class SeguroSimple implements Seguros {

	private double monto;

	public SeguroSimple(double monto) {
		this.monto = monto;
	}

	@Override
	public double calcularCosto() {
		return this.monto;
	}

}

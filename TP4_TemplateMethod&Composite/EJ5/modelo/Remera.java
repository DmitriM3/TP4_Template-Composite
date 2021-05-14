package modelo;

public abstract class Remera {

	private double precioUnitario;

	public Remera(double precio) {
		this.precioUnitario = precio;
	}

	abstract protected double calcularRecargo(double precio);

	abstract protected double calcularImpuestoAduanero(double precio);

	abstract protected double calcularImpuestoComercial(double precio);

	abstract protected double calcularRecargoTransporte(double precio);

	abstract protected double calcularImpuestoBonificacion(double precio);

	public double calcularPrecioVenta() {

		return calcularRecargo(precioUnitario()) + calcularImpuestoAduanero(precioUnitario())
				+ calcularImpuestoComercial(precioUnitario()) + calcularRecargoTransporte(precioUnitario())
				+ calcularImpuestoBonificacion(precioUnitario()) + precioUnitario();
	}

	protected double precioUnitario() {
		return this.precioUnitario;
	}

}

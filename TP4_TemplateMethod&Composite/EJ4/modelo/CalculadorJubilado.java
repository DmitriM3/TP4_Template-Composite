package modelo;

public class CalculadorJubilado extends Calculador {

	public CalculadorJubilado(int mesEnPromocion) {
		super(mesEnPromocion);
	}

//	public double calcularPrecio(double precioProducto) {
//		double precioTotal = precioProducto;
//		if (!of(mesEnPromocion).equals(now().getMonth())) {
//			precioTotal += precioProducto * 0.1;
//		}
//		log.log(CalculadorJubilado.class.getName());
//		return precioTotal;
//	}

	@Override
	protected double mesSinPromocion(double precioProducto) {

		return (precioProducto * 1.1);
	}

	@Override
	protected double mesEnPromocion(double precioProducto) {

		return precioProducto;
	}

}

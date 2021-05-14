package modelo;

public class CalculadorNoJubilado extends Calculador {

	public CalculadorNoJubilado(int mesEnPromocion) {
		super(mesEnPromocion);
	}

//	public double calcularPrecio(double precioProducto) {
//		double precioTotal = precioProducto;
//		if (of(mesEnPromocion).equals(now().getMonth())) {
//			precioTotal += precioProducto * 0.15;
//		} else {
//			precioTotal += precioProducto * 0.21;
//		}
//		log.log(CalculadorNoJubilado.class.getName());
//		return precioTotal;
//	}

	@Override
	protected double mesSinPromocion(double precioProducto) {
		return (precioProducto * 1.21);
	}

	@Override
	protected double mesEnPromocion(double precioProducto) {
		return (precioProducto * 1.15);
	}
}

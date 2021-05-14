package modelo;

public class Spike implements ScrumItems {

	private int tiempoEstimado;

	public Spike(int tiempoEstimado) {
		this.tiempoEstimado = tiempoEstimado;
	}

	@Override
	public int calcularTiempo() {
		return this.tiempoEstimado;
	}

	// Hoja

}

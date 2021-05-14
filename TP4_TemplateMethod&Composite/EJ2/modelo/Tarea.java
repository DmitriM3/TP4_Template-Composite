package modelo;

public class Tarea implements ScrumItems {

	private int tiempoEstimado;

	public Tarea(int tiempoEstimado) {
		super();
		this.tiempoEstimado = tiempoEstimado;
	}

	@Override
	public int calcularTiempo() {
		return this.tiempoEstimado;
	}

	// Hoja

}

package modelo;

import java.util.ArrayList;

public class UserStory implements ScrumItems {

	private ArrayList<ScrumItems> scrumItems;
	private int tiempoEstimado;

	public UserStory(int tiempoEstimado) {
		this.scrumItems = new ArrayList<>();
		this.tiempoEstimado = tiempoEstimado;
	}

	public void agregarItem(ScrumItems item) {
		this.scrumItems.add(item);
	}

	public int calcularTiempo() {
		for (ScrumItems scrumItems2 : scrumItems) {
			tiempoEstimado += scrumItems2.calcularTiempo();
		}
		return tiempoEstimado;
	}

	// Composite

}

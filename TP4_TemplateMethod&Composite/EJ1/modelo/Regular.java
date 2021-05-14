package modelo;

public class Regular implements Empleado {

	private int sueldo;

	public Regular(int sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public double cacularMontoTotaldeSueldos() {
		return this.sueldo;
	}

}

package modelo;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoJefe implements Empleado {

	private final List<Empleado> empleadosHijos;
	private int sueldo;

	public EmpleadoJefe(int sueldo) {
		this.sueldo = sueldo;
		this.empleadosHijos = new ArrayList<Empleado>();
	}

	public void agregarEmpleado(Empleado unEmpleado) {
		empleadosHijos.add(unEmpleado);
	}

	@Override
	public double cacularMontoTotaldeSueldos() {
		double sueldo = this.sueldo;
		for (Empleado empleados : empleadosHijos) {
			sueldo += empleados.cacularMontoTotaldeSueldos();
		}
		return sueldo;
	}

}
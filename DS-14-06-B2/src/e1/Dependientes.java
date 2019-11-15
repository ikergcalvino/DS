package e1;

public class Dependientes extends Empleados {
	public String especialidad;

	public Dependientes(String nombre, String apellidos, String dni, String direccion, String telefono, String numeroSegSocial, int salario, Turno turno, String especialidad) {
		super(nombre, apellidos, dni, direccion, telefono, numeroSegSocial, salario, turno);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public void setTurno(Turno turno) {
		//if (turno == Turno.noche){salario += 150;}
		this.turno = turno;
	}

	@Override
	public String toString() {
		return super.toString() + ", especialidad = " + especialidad + '}';
	}
}
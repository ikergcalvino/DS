package e1;

public class Reponedores extends Empleados {
	public String empresaProcedencia;

	public Reponedores(String nombre, String apellidos, String dni, String direccion, String telefono, String numeroSegSocial, int salario, Turno turno, String empresa) {
		super(nombre, apellidos, dni, direccion, telefono, numeroSegSocial, salario, turno);
		empresaProcedencia = empresa;
	}

	public String getEmpresaProcedencia() {
		return empresaProcedencia;
	}

	public void setEmpresaProcedencia(String empresa) {
		empresaProcedencia = empresa;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return super.toString() + ", empresaProcedencia = " + empresaProcedencia + '}';
	}
}
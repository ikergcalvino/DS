package e1;

public class Empleados extends Persona {

	protected String num_seg_social;
	protected int salario;
	protected enum Turno { mañana, tarde, noche }
	protected Turno turno;

	public Empleados(String nombre, String apellidos, String dni, String direccion, String telefono, String numeroSegSocial, int salario, Turno turno) {
		super(nombre, apellidos, dni, direccion, telefono);
		num_seg_social = numeroSegSocial;
		if (turno == Turno.noche) {
			salario += 150;
		}
		this.salario = salario;
		this.turno = turno;
	}

	//numero de compras y salario(no pueden ser negativos)
	public boolean validarSalario() {
		boolean valido = true;
		if (salario < 0) {
			valido = false;
			//throw new IllegalArgumentException("Salario no valido");
			System.out.println("Salario no valido");
		}
		return valido;
	}

	//numero seguridad social(2 digitos de provincia + 8 digitos de numero secuencial + 2 digitos de control)
	public boolean validarNumSegSocial() { //INTRODUCIDO  SIN ESPACIOS
		boolean valido = true;
		/*************************ELIMINAR ESPACIOS************************************/
		if (num_seg_social.length() != 12) {
			valido = false;
		} else {
			long valor = 0;
			int control = 0;
			for (int i = 0; i < num_seg_social.length() - 3; i++) {
				valor += Character.getNumericValue(num_seg_social.toCharArray()[i]);
				valor *= 10;
			}
			valor += Character.getNumericValue(num_seg_social.toCharArray()[9]);
			control = (Character.getNumericValue(num_seg_social.toCharArray()[10]) * 10) + Character.getNumericValue(num_seg_social.toCharArray()[11]);
			if ((valor % 97) != control) {
				valido = false;
				//throw new IllegalArgumentException("Numero de seguridad social no valido");
				System.out.println("Numero de seguridad social no valido");
			}
		}
		return valido;
	}

	@Override
	public String toString() {
		return super.toString() + ", num_seg_social=" + num_seg_social + ", salario=" + salario + ", turno=" + turno;
	}

	public String getNumSeguridadSocial() {
		return num_seg_social;
	}

	public int getSalario() {
		return salario;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setNumSeguridadSocial(String numero) {
		num_seg_social = numero;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
}
package e1;

public class Persona {
	protected String nombre;
	protected String apellidos;
	protected String dni;
	protected String direccion;
	protected String telefono;

	public Persona(String nombre, String apellidos, String dni, String direccion, String telefono) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	//nombre,apellidos
	public boolean validarNombreApellidos() {
		boolean valido = true;
		if (nombre.equals("") || apellidos.equals("")) {
			valido = false;
			//throw new IllegalArgumentException("Nombre o Apellidos no validos");
			System.out.println("Nombre o Apellidos no validos");
		}
		return valido;
	}

	//dni
	public boolean validarDNI() {
		boolean valido = false;
		char letras[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
		int valor = 0;
		for (int i = 0; i < dni.length() - 1; i++) {
			valor += Character.getNumericValue(dni.toCharArray()[i]);
			valor *= 10;
		}
		valor /= 10;
                
		if (dni.length() == 9 && dni.contains(Integer.toString(valor))) {
			if (letras[valor % 23] == dni.toCharArray()[8]) {
				valido = true;
			}
			//for (int i = 0; i < 22; i++) {
			//                if (((valor % 23)==i) && dni.toCharArray()[8] == letras[i]) {
			//                    valido = true;
			//                }
			//}
		}
		if (valido == false) { //throw new IllegalArgumentException("DNI no valido");
			System.out.println("DNI no valido");
		}
		return valido;
	}

	//telefono(nulo o 9 numeros)
	public boolean validarTelefono() {
		boolean valido = true;
		if (!telefono.equals("")) {
			if (telefono.length() != 9) {
				valido = false;
			} else {
				for (int i = 0; i < telefono.length() - 1; i++) {
					if (Character.getNumericValue(telefono.toCharArray()[i]) > 9) {
						valido = false;
					}
				}
			}
		}
		if (valido == false) { //throw new IllegalArgumentException("Telefono no valido");
			System.out.println("Telefono no valido");
		}
		return valido;
	}

	@Override
	public String toString() {
		return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", direccion=" + direccion + ", telefono=" + telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDNI() {
		return dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setDNI(String dni) {
		this.dni = dni;
	}
}
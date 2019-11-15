package e1;

import java.util.*;

public class Mercado {

	private List < Clientes > clientes = new ArrayList < > ();
	private List < Empleados > empleados = new ArrayList < > ();

	public boolean agregarCliente(Clientes cliente) {
		if (cliente == null) {
			return false;
		}
		if (cliente.validarDNI() && cliente.validarCompras() && cliente.validarNombreApellidos() && cliente.validarTelefono()) {
			if (clientes.isEmpty()) {
				return clientes.add(cliente);
			} else {
				for (int i = 0; i < clientes.size(); i++) {
					if (clientes.get(i).dni.equals(cliente.dni)) {
						return false;
					}
				}
			}
		}
		return clientes.add(cliente);
	}

	public boolean agregarEmpleado(Empleados empleado) {
		if (empleado == null) {
			return false;
		}
		if (empleado.validarNombreApellidos() && empleado.validarDNI() && empleado.validarTelefono() && empleado.validarSalario() && empleado.validarNumSegSocial()) {
			Reponedores reponedor = new Reponedores("", "", "11399724G", "", "", "", 0, Empleados.Turno.noche, "");
			if ((empleado.getClass() == reponedor.getClass()) && (empleado.turno == reponedor.turno)) {
				//System.out.println("No hay reponedores en el turno de noche.");
				throw new IllegalArgumentException("No hay reponedores en el turno de noche");
				//return false;
			} else {
				if (empleados.isEmpty()) {
					return empleados.add(empleado);
				} else {
					for (int i = 0; i < empleados.size(); i++) {
						if (empleados.get(i).dni == empleado.dni) {
							return false;
						}
					}
					return empleados.add(empleado);
				}
			}
		} else {
			return false;
		}
	}

	public boolean agregarClientes(ArrayList < Clientes > listaClientes) {
		int l = clientes.size();
		for (int i = 0; i < listaClientes.size() - 1; i++) {
			agregarCliente(listaClientes.get(i));
		}
		return (clientes.size() != l);
	}

	public boolean agregarEmpleados(ArrayList < Empleados > listaEmpleados) {
		int l = empleados.size();
		for (int i = 0; i < listaEmpleados.size(); i++) {
			agregarEmpleado(listaEmpleados.get(i));
		}
		return (empleados.size() != l);
	}

	public int salariosMercado() {
		int suma = 0;
		for (int i = 0; i < empleados.size(); i++) {
			suma += empleados.get(i).salario;
		}
		return suma;
	}

	public ArrayList personasMercado() {
		ArrayList < Persona > personas = new ArrayList < > ();
		for (int i = 0; i < clientes.size(); i++) {
			personas.add(clientes.get(i));
		}
		for (int i = 0; i < empleados.size(); i++) {
			personas.add(empleados.get(i));
		}
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println(" ");
			System.out.println(clientes.get(i).toString());
		}
		for (int i = 0; i < empleados.size(); i++) {
			System.out.println(" ");
			System.out.println(empleados.get(i).toString());
		}
		return personas;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 89 * hash + Objects.hashCode(this.clientes);
		hash = 89 * hash + Objects.hashCode(this.empleados);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Mercado other = (Mercado) obj;
		if (!Objects.equals(this.clientes, other.clientes)) {
			return false;
		}
		if (!Objects.equals(this.empleados, other.empleados)) {
			return false;
		}
		return true;
	}
}
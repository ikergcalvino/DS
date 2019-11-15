package e1;

public class Clientes extends Persona { //hereda los atributos de persona
	public String cod_cliente;
	public int num_compras;
	public float descuento;

	public Clientes(String nombre, String apellidos, String dni, String direccion, String telefono, String codigo, int compras) {
		super(nombre, apellidos, dni, direccion, telefono); //para añadir alconstructor los atributos  de persona
		cod_cliente = codigo;
		num_compras = compras;
		descuento = compras / 100;
	}

	//numero de compras y salario(no pueden ser negativos)
	public boolean validarCompras() {
		boolean valido = true;
		if (num_compras < 0) {
			valido = false;
			//throw new IllegalArgumentException("Numero de compras no valido");
			System.out.println("Numero de compras no valido");
		}
		return valido;
	}

	@Override
	public String toString() {
		return super.toString() + ", cod_cliente=" + cod_cliente + ", num_compras=" + num_compras + ", descuento=" + descuento + '}';
	}

	public String getCodigo() {
		return cod_cliente;
	}

	public int getNumCompras() {
		return num_compras;
	}

	public float getDescuento() {
		return descuento;
	}

	public void setCodigo(String codigo) {
		cod_cliente = codigo;
	}

	public void setNumCompras(int compras) {
		num_compras = compras;
	}
}
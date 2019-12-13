package e1;

public class Producto {

    private final String nombre;
    private final int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getName() {
        return nombre;
    }

    public int getPrice() {
        return precio;
    }
}
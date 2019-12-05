package e1;

public class Producto {

    public String nombre;
    public int precio;
    
    public Producto (String n, int p) {
        nombre = n;
        precio = p;
    }
    
    public String getName() {
        return nombre;
    }
    
    public int getPrice() {
        return precio;
    }
}
package e2;

public class Accion {
    
    private String simbolo;
    private float cierre;
    private float max;
    private float min;
    private float volumen;
    
    public Accion(String simbolo, float cierre, float max, float min, float volumen) {
        this.simbolo = simbolo;
        this.cierre = cierre;
        this.max = max;
        this.min = min;
        this.volumen = volumen;
    }
    
    public String getSimbolo() {
        return simbolo;
    }
    
    public float getCierre() {
        return cierre;
    }
    
    public float getMax() {
        return max;
    }
    
    public float getMin() {
        return min;
    }
    
    public float getVolumen() {
        return volumen;
    }
    
    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
    
    public void setCierre(float cierre) {
        this.cierre = cierre;
    }
    
    public void setMax(float max) {
        this.max = max;
    }
    
    public void setMin(float min) {
        this.min = min;
    }
    
    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }
    
}
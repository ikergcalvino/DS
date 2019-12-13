package e2;

public class Accion extends MercadoAcciones {
    
    private String simbolo;
    private float cierre;
    private float max;
    private float min;
    private float volumen;
    
    public Accion (String simbolo, float cierre, float max, float min, float volumen) {
        this.simbolo = simbolo;
        this.cierre = cierre;
        this.max = max;
        this.min = min;
        this.volumen = volumen;
    }
    
    public String getSimbolo() {
        return simbolo;
    }
    
    public void setSimbolo (String simbolo) {
        this.simbolo = simbolo;
        notification();
    }
    
    public float getCierre() {
        return cierre;
    }
    
    public void setCierre(float cierre) {
        this.cierre = cierre;
        notification();
    }
    
    public float getMax() {
        return max;
    }
    
    public void setMax(float max) {
        this.max = max;
        notification();
    }
    
    public float getMin() {
        return min;
    }
    
    public void setMin(float min) {
        this.min = min;
        notification();
    }
    
    public float getVolumen() {
        return volumen;
    }
    
    public void setVolumen(float volumen) {
        this.volumen = volumen;
        notification();
    }
    
}
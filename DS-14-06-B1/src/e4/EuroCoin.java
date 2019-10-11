/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

package e4;

public class EuroCoin {
    
  private float value;
  private String color;
  private String pais;
  private String diseno;

  public float getValue()
  { return value; }
  
  public String getColor()
  { return color; }
  
  public String getPais()
  { return pais; }
  
  public String getDiseno()
  { return diseno; }
  
  public void setValue(float v)
  { value = v; }
  
  public void setColor(String c)
  { color = c; }
  
  public void setPais(String p)
  { pais = p; }
  
  public void setDiseno(String d)
  { diseno = d; }
    
}

package e4;

public class EuroCoin {
    
    EuroCoin Pais = new EuroCoin();
    
    public static class Pais {
        public enum Nombre {AUSTRIA,BELGIUM,CYPRUS,NETHERLANDS,ESTONIA,FINLAND,FRANCE,GERMANY,GREECE,IRELAND,
                            ITALY,LATVIA,LITHUANIA,LUXENBOURG,MALTA,MONACO,PORTUGAL,SAN_MARINO,SLOVAKIA,
                            SLOVENIA,SPAIN,VATICAN_CITY}
        public enum Codigo {AT,BE,CY,NL,EE,FI,FR,DE,GR,IE,IT,LV,LT,LU,MT,MC,PT,SM,SK,SI,ES,VA}
        static Nombre name;
        static Codigo cod;
        
        public Pais(Nombre nombre,Codigo codigo) {
        name = nombre;
        cod = codigo;
        }        
    }
    
    public enum Color {ORO, BRONCE, ORO_PLATA}
    
    
    public static int Valor;
    public static char Diseño[];
    public static Pais Paises;
    public static Color color;
    
    public static void EuroCoin(int value,char design[],Pais pais,Color colour) {
        Valor = value;
        Diseño = design;
        Paises = pais;
        color = colour;
    }
} */
package e4;

import java.util.Objects;

public class EuroCoin {
    
    public enum Pais {AT("AUSTRIA"),BE("BELGIUM"),CY("CYPRUS"),NL("NETHERLANDS"),EE("ESTONIA"),FI("FINLAND"),FR("FRANCE"),DE("GERMANY"),GR("GREECE"),IE("IRELAND"),IT("ITALY"),
                      LV("LATVIA"),LT("LITHUANIA"),LU("LUXENBOURG"),MT("MALTA"),MC("MONACO"),PT("PORTUGAL"),SM("SAN_MARINO"),SK("SLOVAKIA"),SI("SLOVENIA"),ES("SPAIN"),VA("VATICAN_CITY");
       private final String pais;

       Pais(String p){ pais = p; }
       
       public String getPais(){ return pais; }
    
    }
       
        
    
    public enum Color {ORO, BRONCE, ORO_PLATA}
    
    public enum Valor {C1(1),C2(2),C5(5),C10(10),C20(20),C50(50),E1(100),E2(200);
        private final int v;
        
        Valor(int value){
            this.v = value;
        }
        public int getValue(){return v;}
    }
    
    public  Valor valor;
    public  String diseño;
    public  Pais paises;
    public  Color color;
    public  int año;
    
     public Valor getValue()
  { return valor; }
  
  public Color getColor()
  { return color; }
  
  public Pais getPais()
  { return paises; }
  
  public String getDiseno()
  { return diseño; }

    
    
    
    
    
    public EuroCoin(Valor value,String design,Pais pais,Color colour,int a) {
        valor = value;
        diseño = design;
        paises = pais;
        color = colour;
        año = a;
    }

@Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.color);
        hash = 53 * hash + Objects.hashCode(this.paises);
        hash = 53 * hash + Objects.hashCode(this.valor);
        hash = 53 * hash + Objects.hashCode(this.diseño);
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
        final EuroCoin other = (EuroCoin) obj;
        if (!Objects.equals(this.diseño, other.diseño)) {
            return false;
        }
        if (this.color != other.color) {
            return false;
        }
        if (this.paises != other.paises) {
            return false;
        }
        if (this.valor != other.valor) {
            return false;
        }
        return true;
    }

}
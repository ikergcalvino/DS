package e1;

import java.util.*;

public class EuroCoin {

    private final Valor valor;
    
    public EuroCoin (Valor value) {
        this.valor = value;
    }	            
	
    public Valor getValue() { return valor; }
        
	public enum Valor {
		C1(1),   C2(2),   C5(5),
                C10(10), C20(20), C50(50),
                E1(100), E2(200);

		private final int v;
                
		Valor (int value) { this.v = value; }
                
		public int getValor() {	return v; }
	}

	@Override
	public int hashCode() {
            int hash = 7;
            hash = 53 * hash + Objects.hashCode(this.valor);
            return hash;
	}

	@Override
	public boolean equals (Object obj) {
            if (this == obj) { return true; }
            
            if (obj == null) { return false; }
            
            if (getClass() != obj.getClass()) { return false; }
            
            final EuroCoin other = (EuroCoin) obj;
            
            return this.valor == other.valor;
	}
}
package e1;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MercadoTest {

	Mercado mercado;

	Clientes c1, c2, c3, c4 // No se añade porq es igual  al 3
	, c5; // No se añade porq es nulo
	Empleados e1 // No se añade porq es reponedor con turno de noche(no existen)
	, e2, e3, e4 // No se añade porq es igual al  2
	, e5;
	ArrayList < Clientes > clientes = new ArrayList();
	ArrayList < Empleados > empleados = new ArrayList();

	@Before
	public void setUp() {
		mercado = new Mercado();

		c1 = new Clientes("Bartolomeo", "Piñeiro", "34055156E", "", "", "9999A", 27);
		c2 = new Clientes("Pepe", "Jimenez", "82077857B", "", "", "1212X", 27);
		c3 = new Clientes("Juan", "Jimenez", "49514145K", "", "", "1234F", 100);
		c4 = new Clientes("Juan", "Jimenez", "49514145K", "", "", "1234F", 100);
		c5 = null;
		// DEBERIA FUNCIONAR CON REPONEDORES EN HORARIO NOCTURNO???????????
		// e1 = new Reponedores("Je", "Gonzalez", "50949963H","","653254785", "121212121294", 1100, Empleados.Turno.noche, "Naturgy");
		e2 = new Reponedores("Jesus", "Gonzalez", "12403768Y", "", "988541236", "111111111170", 1000, Empleados.Turno.tarde, "Naturgy");
		e3 = new Dependientes("Antonio", "guapo", "39575720B", "", "351123456", "112222222225", 1150, Empleados.Turno.noche, "carnicerria");
		e4 = new Reponedores("Jesus", "Gonzalez", "12403768Y", "", "321852951", "113333333377", 1000, Empleados.Turno.tarde, "Naturgy");
		e5 = new Dependientes("Mario", "gonzalez", "29089391A", "", "753951456", "444444444486", 1000, Empleados.Turno.mañana, "pescaderia");

		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		clientes.add(c4);
		clientes.add(c5);

		assertTrue(mercado.agregarClientes(clientes));

		assertTrue(mercado.agregarEmpleado(e2));
		assertTrue(mercado.agregarEmpleado(e3));
		assertFalse(mercado.agregarEmpleado(e4));
		assertTrue(mercado.agregarEmpleado(e5));
	}

//	Test of salariosMercado method, of class Mercado.
	@Test
	public void testSalariosMercado() {
		assertEquals(3300, mercado.salariosMercado());
	}

//	Test of personasMercado method, of class Mercado.
	@Test
	public void testPersonasMercado() {
		assertEquals(6, mercado.personasMercado().size());
	}
}
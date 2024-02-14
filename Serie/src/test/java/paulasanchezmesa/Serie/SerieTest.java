package paulasanchezmesa.Serie;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SerieTest {

	private Serie serie;

	@Before
	public void objeto() {
		serie = new Serie();
	}

	@Test
	public void testEntregar() {
		assertFalse(serie.isEntregado());
		serie.entregar();
		assertTrue(serie.isEntregado());
	}

	@Test
	public void testDevolver() {
		serie.entregar();
		assertTrue(serie.isEntregado());
		serie.devolver();
		assertFalse(serie.isEntregado());
	}

	@Test
	public void testCompareTo() {
		Serie s1 = new Serie("Hola", 2, "Comedia", "Juan");
		Serie s2 = new Serie("Adios", 1, "Comedia", "Pedro");
		Serie s3 = new Serie("Eo", 5, "Romantica", "Luis");

		assertTrue(s1.compareTo(s2) == Serie.MAYOR);
		assertTrue(s2.compareTo(s1) == Serie.MENOR);
		assertTrue(s1.compareTo(s3) == Serie.IGUAL);
	}

	@Test
	public void testEquals() {
		Serie s1 = new Serie("Hola", 2, "Comedia", "Juan");
		Serie s2 = new Serie("Adios", 1, "Comedia", "Pedro");
		Serie s3 = new Serie("Eo", 5, "Romantica", "Luis");

		assertTrue(s1.equals(s2));
		assertFalse(s1.equals(s3));
	}

	@Test
	public void testToString() {
		Serie serie = new Serie("HolaAdios", 4, "Drama", "Pepa Muñoz");
		String s1 = "Informacion de la Serie: \n" + "\tTitulo: HolaAdios\n" + "\tNumero de temporadas: 4\n"
				+ "\tGenero: Drama\n" + "\tCreador: PepaMuñoz";
		assertEquals(s1, serie.toString());
	}
}

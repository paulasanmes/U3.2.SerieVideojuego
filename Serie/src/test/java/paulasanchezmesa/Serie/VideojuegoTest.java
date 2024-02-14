package paulasanchezmesa.Serie;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class VideojuegoTest {

	private Videojuego videojuego;

	@Before
	public void objeto() {
		videojuego = new Videojuego();
	}

	@Test
	public void testEntregar() {
		assertFalse(videojuego.isEntregado());
		videojuego.entregar();
		assertTrue(videojuego.isEntregado());
	}

	@Test
	public void testDevolver() {
		videojuego.entregar();
		assertTrue(videojuego.isEntregado());
		videojuego.devolver();
		assertFalse(videojuego.isEntregado());
	}

	@Test
	public void testCompareTo() {
		Videojuego j1 = new Videojuego("Mario Kart", "Nintendo");
		Videojuego j2 = new Videojuego("Barbie", "Play");
		Videojuego j3 = new Videojuego("Minecraft", "Microsoft");

		j1.setHorasEstimadas(137);
		j2.setHorasEstimadas(241);
		j3.setHorasEstimadas(598);

		assertTrue(j1.compareTo(j2) == Videojuego.MAYOR);
		assertTrue(j1.compareTo(j1) == Videojuego.MENOR);
		assertTrue(j1.compareTo(j3) == Videojuego.IGUAL);
	}

	@Test
	public void testEquals() {
		Videojuego j1 = new Videojuego("Mario Kart", "Nintendo");
		Videojuego j2 = new Videojuego("Barbie", "Play");
		Videojuego j3 = new Videojuego("Minecraft", "Microsoft");

		assertTrue(j1.equals(j2));
		assertFalse(j1.equals(j3));
	}

	@Test
	public void testToString() {
		Videojuego juego = new Videojuego("Fifa", 450, "Futbol", "Play");
		String expected = "Informacion del videojuego: \n" + "\tTitulo: Fifa\n" + "\tHoras estimadas: 450\n"
				+ "\tGenero: Futbol\n" + "\tcompañia: Play";
		assertEquals(expected, juego.toString());
	}
}

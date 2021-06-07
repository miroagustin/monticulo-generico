package monticuloTests;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import monticulo.Monticulo;
import monticulo.MonticuloMaxima;
import monticulo.MonticuloMinima;
import monticulo.NumeroMonticulable;

class MonticuloMinimaTests {

	@Test
	void agregaMonticuloGenericoTestMinima() throws Exception {
		Monticulo<NumeroMonticulable> m = new MonticuloMinima<NumeroMonticulable>();
		Integer[] prueba = new Integer[] {2,3,4,5,98,88,99,12345,6};
		for (Integer integer : prueba) {
			NumeroMonticulable mon = new NumeroMonticulable(integer);
			m.agregar(mon);
		}
		System.out.println(m);
	}
	
	@Test
	void quitaMonticuloGenericoTestMinima() throws Exception {
		Monticulo<NumeroMonticulable> m = new MonticuloMinima<NumeroMonticulable>();
		Integer[] prueba = new Integer[] {2,3,4,5,98,88,99,12345,6};
		for (Integer integer : prueba) {
			NumeroMonticulable mon = new NumeroMonticulable(integer);
			m.agregar(mon);
		}
		System.out.println(m);
		System.out.println(m.quitar());
		System.out.println(m);
		System.out.println(m.quitar());
		System.out.println(m);
		System.out.println(m.quitar());
		System.out.println(m);
		System.out.println(m.quitar());
		System.out.println(m);
		System.out.println(m.quitar());
		System.out.println(m);
		System.out.println(m.quitar());
		System.out.println(m);
		System.out.println(m.quitar());
		System.out.println(m);
		System.out.println(m.quitar());
		System.out.println(m);
		System.out.println(m.quitar());
		System.out.println(m);
		System.out.println(m.quitar());
		System.out.println(m);
	}

}

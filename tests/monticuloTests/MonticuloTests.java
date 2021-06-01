package monticuloTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import monticulo.Monticulable;
import monticulo.Monticulo;
import monticulo.MonticuloGenerico;
import monticulo.NumeroMonticulable;

class MonticuloTests {

	@Test
	void agregaMonticuloTest() {
		Monticulo m = new Monticulo();
		Integer[] prueba = new Integer[] {2,3,4,5,98,88,99,12345,6};
		for (Integer integer : prueba) {
			m.agregar(integer);
		}
		//System.out.println(m);
	}
	@Test
	void quitaMonticuloTest() {
		Monticulo m = new Monticulo();
		Integer[] prueba = new Integer[] {2,3,4,5,98,88,99,12345,6};
		for (Integer integer : prueba) {
			m.agregar(integer);
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
	
	@Test
	void agregaMonticuloGenericoTest() throws Exception {
		MonticuloGenerico m = new MonticuloGenerico();
		Integer[] prueba = new Integer[] {2,3,4,5,98,88,99,12345,6};
		for (Integer integer : prueba) {
			Monticulable mon = new NumeroMonticulable(integer);
			m.agregar(mon);
		}
		System.out.println(m);
	}
	
	@Test
	void quitaMonticuloGenericoTest() throws Exception {
		MonticuloGenerico m = new MonticuloGenerico();
		Integer[] prueba = new Integer[] {2,3,4,5,98,88,99,12345,6};
		for (Integer integer : prueba) {
			Monticulable mon = new NumeroMonticulable(integer);
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

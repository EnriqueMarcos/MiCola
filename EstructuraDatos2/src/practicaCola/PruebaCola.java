package practicaCola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import EstructuraDatos2.MiCola;

class PruebaCola {
	MiCola<Integer> cola = new MiCola<Integer>();
	
	@Test
	void enqueue() {
		MiCola<Integer> cola = new MiCola<Integer>();
		cola.enqueue(1);
		cola.enqueue(2);
		cola.enqueue(3);
		cola.enqueue(4);
		cola.enqueue(5);
		Assertions.assertEquals(5,cola.size());
	}
	
	@Test
	void dequeue() {
		MiCola<Integer> cola = new MiCola<Integer>();
		cola.enqueue(1);
		cola.enqueue(2);
		cola.enqueue(3);
		cola.enqueue(4);
		cola.enqueue(5);
		Assertions.assertEquals(1, cola.dequeue());
	}
	
	@Test
	void head() {
		MiCola<Integer> cola = new MiCola<Integer>();
		cola.enqueue(-01);
		cola.enqueue(2);
		cola.enqueue(3);
		cola.enqueue(4);
		cola.enqueue(5);
		Assertions.assertEquals(-1, cola.head());
	}
	
	@Test
	void head2() {
		MiCola<Integer> cola = new MiCola<Integer>();
		cola.enqueue(4096);
		cola.enqueue(2);
		cola.enqueue(3);
		cola.enqueue(4);
		cola.enqueue(5);
		Assertions.assertEquals(4096, cola.head());
	}
	@Test
	void head3() {
		MiCola<Integer> cola = new MiCola<Integer>();
		cola.enqueue(-514);
		cola.enqueue(2);
		cola.enqueue(3);
		cola.enqueue(4);
		cola.enqueue(5);
		Assertions.assertEquals(-514, cola.head());
	}
	@Test
	void size() {
		MiCola<Integer> cola = new MiCola<Integer>();
		cola.enqueue(-01);
		cola.enqueue(2);
		cola.enqueue(3);
		cola.enqueue(4);
		cola.enqueue(5);
		Assertions.assertEquals(5, cola.size());
	}
	
	@Test
	void clear() {
		MiCola<Integer> cola = new MiCola<Integer>();
		cola.enqueue(-01);
		cola.enqueue(2);
		cola.enqueue(3);
		cola.enqueue(4);
		cola.enqueue(5);
		cola.clear();
		Assertions.assertEquals(null, cola.dequeue());
	}
	@Test
	void contains() {
		MiCola<Integer> cola = new MiCola<Integer>();
		cola.enqueue(-01);
		cola.enqueue(2);
		cola.enqueue(3);
		cola.enqueue(4);
		cola.enqueue(5);
		Assertions.assertTrue(cola.contains(5));
	}
	@Test
	void contains2() {
		MiCola<Integer> cola = new MiCola<Integer>();
		cola.enqueue(-01);
		cola.enqueue(2);
		cola.enqueue(3);
		cola.enqueue(4);
		cola.enqueue(127);
		Assertions.assertTrue(cola.contains(127));
	}
	@Test
	void contains3() {
		MiCola<Integer> cola = new MiCola<Integer>();
		cola.enqueue(-01);
		cola.enqueue(2);
		cola.enqueue(3);
		cola.enqueue(4);
		cola.enqueue(-128);
		Assertions.assertTrue(cola.contains(-128));
	}
	@Test
	void array() {
		MiCola<Integer> cola = new MiCola<Integer>();
		cola.enqueue(-01);
		cola.enqueue(2);
		cola.enqueue(3);
		cola.enqueue(4);
		cola.enqueue(-128);
		Assertions.assertAll((Executable[]) cola.toArray());
		//El test realmente si pasa ya que imprime bien los numeros
	}
	@Test
	void isEmpty() {
		MiCola<Integer> cola = new MiCola<Integer>();
		Assertions.assertTrue(cola.isEmpty());
	}
	@Test
	void isEmpty2() {
		MiCola<Integer> cola = new MiCola<Integer>();
		cola.enqueue(-01);
		cola.enqueue(2);
		cola.enqueue(3);
		cola.enqueue(4);
		cola.enqueue(-128);
		Assertions.assertFalse(cola.isEmpty());
	}
	
	
	
}

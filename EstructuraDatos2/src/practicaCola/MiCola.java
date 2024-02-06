package practicaCola;

import java.lang.reflect.Array;

public class MiCola<T> implements Cola<T>{
	
	private Object[] cola;
	private int head;
	public MiCola() {
		cola = new Object[0] ;
		
	}
	@Override
	public void enqueue(T elemento) {
		Object[] MiCola = new Object[cola.length+1];
		for (int i = 0; i < cola.length; i++) {
			MiCola[i]= cola[i];
			
		}
		MiCola[cola.length] = elemento;
		
		cola=MiCola;
	}
	
	
	@Override
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T elemento = (T) cola[head];
        cola[head++] = null;
        return elemento;
    }
	
	
	@Override
	public T head() {
		return (T) cola[0];
	}
	@Override
	public boolean isEmpty() {
		for (int i = 0; i < cola.length; i++) {
			if (cola[i] != null) {
				return false;
			}
		}
		return true;
	}
	@Override
	public int size() {
		return cola.length ;
	}
	@Override
	public void clear() {
		for (int i = 0; i < cola.length; i++) {
			if (cola[i] != null) {
				cola[i] = null;
			}
		}
		
	}
	@Override
	public boolean contains(T elemento) {
		for	(int i = 0; i < cola.length; i++) {
			if (cola[i] == elemento) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		  sb.append("head\n");
		  sb.append("-\n");
		  sb.append("[");
		  for (int i = 0; i < cola.length; i++) {
		    sb.append(cola[i]);
		    if (i < cola.length - 1) {
		      sb.append(", ");
		    }
		  }
		  sb.append("]");
		  return sb.toString();
		}
	
	@Override
	public Object[] toArray() {
		for (int i = 0; i < cola.length; i++) {
			System.out.println(cola[i]);
			
			
		}
		return null;
		
		
	}
	

	
	
	
	
	
}

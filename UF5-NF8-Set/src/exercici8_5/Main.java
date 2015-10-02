package exercici8_5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Cotxe alfa = new Cotxe("Alfa Romeo", "Giulia", 6, 2900);
		Cotxe dacia = new Cotxe("Dacia", "Sandero", 4, 1200);
		Cotxe ford = new Cotxe("Ford", "Focus", 4, 2000);
		Cotxe opel = new Cotxe("Opel", "Insignia", 4, 2200);
		Cotxe seat = new Cotxe("Seat", "Ibiza", 4, 1600);

		Set<Cotxe> setList = new HashSet<Cotxe>();

		setList.add(alfa);
		setList.add(dacia);
		setList.add(ford);
		setList.add(opel);
		setList.add(seat);

		// buscando la potencia fiscal del dacia sandero
		if (setList.contains(dacia)) {
			System.out.println("Potencia Fiscal del Dacia es: " + dacia.potFiscal() + "\n");
		} else {
			System.out.println("-1");
		}

		// Agregando dos coches

		setList.add(new Cotxe("Hyundai", "Atos", 3, 1500));
		setList.add(new Cotxe("Ford", "Focus", 4, 2000));

		imprimir(setList);

		// Añadendo Duplicado
		System.out.println("====== Agregando duplicado ===========");
		System.out.println(setList.add(ford));

		// Añadiendo el audi y No se puede agregar al inicio sel SET
		System.out.println("========= Añandiendo al inicio, NO SE PUEDE");
		// setList.add(new Cotxe("Audi", "A8", 8, 4600));

		// Sustituyendo el seat Ibiza por el seat mii
		if (setList.contains(seat)) {
			setList.remove(seat);
			setList.add(new Cotxe("Seat", "Mii", 1000, 3));
		}
		imprimir(setList);
	}


	private static void imprimir(Set<Cotxe> setList) {
		Iterator<Cotxe> it = setList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
	
	
	
}

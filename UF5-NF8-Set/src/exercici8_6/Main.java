package exercici8_6;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import exercici8_5.Cotxe;

public class Main {
	public static void main(String[] args) {

		LinkedHashSet<Cotxe> linkList = new LinkedHashSet<Cotxe>();

		
		 linkList.add(new Cotxe("Alfa Romeo", "Giulia", 6, 2900));
		 linkList.add(new Cotxe("Dacia", "Sandero", 4, 1200));
		 linkList.add(new Cotxe("Ford", "Focus", 4, 2000));
		 linkList.add(new Cotxe("Opel", "Insignia", 4, 2200));
		 linkList.add(new Cotxe("Seat", "Ibiza", 4, 1600));
		
		System.out.println("******* Agregando dos coches, uno de ellos es duplicado");
		 System.out.println(linkList.add(new Cotxe("Hyundai", "Atos", 3, 1500)));
		 System.out.println("Coche duplicado "+linkList.add(new Cotxe("Ford", "Focus", 4, 2000))+"\n");		 
		 imprimir(linkList);
		 
		
	}

	private static void imprimir(LinkedHashSet<Cotxe> linkList) {
		
		Iterator<Cotxe> it = linkList.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}
}

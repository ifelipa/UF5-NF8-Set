package exercici8_7;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	static class CriterioPotenciaFiscal implements Comparator<Cotxe> {

		@Override
		public int compare(Cotxe c1, Cotxe c2) {
			return (c1.potFiscal() == c2.potFiscal() ? 0 : ((c1.potFiscal() < c2.potFiscal()) ? -1 : 1));
		}
	}

	public static void main(String[] args) {

		Cotxe alfa = new Cotxe("Alfa Romeo", "Giulia", 6, 2900);
		Cotxe dacia = new Cotxe("Dacia", "Sandero", 4, 1200);
		Cotxe ford = new Cotxe("Ford", "Focus", 4, 2000);
		Cotxe opel = new Cotxe("Opel", "Insignia", 4, 2200);
		Cotxe seat = new Cotxe("Seat", "Ibiza", 4, 1600);
		Cotxe hyundai = new Cotxe("Hyundai", "Atos", 3, 1500);

		// Lista sin comparadores
		TreeSet<Cotxe> treeList1 = new TreeSet<Cotxe>();
		TreeSet<Cotxe> treeList2 = new TreeSet<Cotxe>();

		// Lista con comparadores por cilindrada
		TreeSet<Cotxe> treeList3 = new TreeSet<Cotxe>();
		TreeSet<Cotxe> treeList4 = new TreeSet<Cotxe>();

		// Lista con comparadores por potencia fiscal

		// Creando el comparador en el momento de crear la lista
		TreeSet<Cotxe> treeList5 = new TreeSet<Cotxe>(new Comparator<Cotxe>() {
			@Override
			public int compare(Cotxe c1, Cotxe c2) {
				return (c1.potFiscal() == c2.potFiscal() ? 0 : ((c1.potFiscal() < c2.potFiscal()) ? -1 : 1));
			}
		});

		// Creando el objeto comparador y lo añadimos a nuestra lista
		CriterioPotenciaFiscal ordenPF = new CriterioPotenciaFiscal();
		TreeSet<Cotxe> treeList6 = new TreeSet<Cotxe>(ordenPF);

		treeList1.add(alfa);
		treeList1.add(dacia);
		treeList1.add(ford);
		treeList1.add(opel);
		treeList1.add(seat);
		treeList1.add(hyundai);
		imprimir(treeList1);

	}

	private static void imprimir(Set treeList) {
		Iterator<Cotxe> it = treeList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}

	}

}

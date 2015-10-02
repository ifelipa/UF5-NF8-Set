package exercici8_5;


public class Cotxe implements Comparable<Cotxe>  {
//public class Cotxe  {
	String marca;
	String modelo;
	int nCilindros;
	Integer cilindrada;
	double potenciaFiscal;

	public Cotxe(String marca, String modelo, int nCilindros, int cilindrada) {		
		this.marca = marca;
		this.modelo = modelo;
		this.nCilindros = nCilindros;
		this.cilindrada = cilindrada;
	}

	public String getMarca() {
		return marca;
	}	

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getnCilindros() {
		return nCilindros;
	}

	public void setnCilindros(int nCilindros) {
		this.nCilindros = nCilindros;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public double getPotenciaFiscal() {
		return this.potenciaFiscal;
	}
	
	public void setPotenciaiscal() {
		this.potenciaFiscal = potFiscal();
	}
	
	public double potFiscal(){
		return 0.08 * this.nCilindros * Math.pow((this.cilindrada /this.nCilindros),0.6);
	}

	@Override
	public String toString() {
		return "Cotxe [marca= " + marca + ", modelo= " + modelo + ", nCilindros= " + nCilindros + ", cilindrada= "
				+ cilindrada + ", potenciaFiscal= " + potFiscal() + "]\n";
	}

	@Override
	public int compareTo(Cotxe o) {		
		return (this.getCilindrada()==o.getCilindrada()? 0: ((this.getCilindrada() < o.getCilindrada())? -1: 1));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cotxe other = (Cotxe) obj;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		return true;
	}



	
}

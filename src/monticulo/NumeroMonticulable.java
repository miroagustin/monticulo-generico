package monticulo;

public class NumeroMonticulable implements Monticulable {

	private int nro;

	public NumeroMonticulable(int nro) {
		// TODO Auto-generated constructor stub
		this.nro = nro;
	}

	@Override
	public String toString() {
		return "" + nro;
	}

	@Override
	public int compareTo(Monticulable otro) {
		if (this == otro)
			return 0;
		if (otro == null)
			return 1;
		if (getClass() != otro.getClass())
			throw new RuntimeException("El otro debe ser de clase " + this.getClass() + " " + this + " " + otro);

		NumeroMonticulable otroNro = (NumeroMonticulable) otro;
		return Integer.compare(nro, otroNro.nro);
	}

}

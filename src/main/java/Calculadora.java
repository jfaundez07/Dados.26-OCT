public class Calculadora {

	private int n1;
	private int n2;

	/**
	 * 
	 * @param n1
	 * @param n2
	 */
	public Calculadora(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public int sumar() {
		return this.n1 + this.n2;
	}

}
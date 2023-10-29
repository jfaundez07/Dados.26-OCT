public class SimularLanzamiento {

	private Dado dado1;
	private Dado dado2;

	public void jugar() {

		dado1 = new Dado();
		dado2 = new Dado();

		int lanzarDado1 = dado1.lanzarDado();
		int lanzarDado2 = dado2.lanzarDado();

		Calculadora calculadora = new Calculadora(lanzarDado1, lanzarDado2);

		System.out.println("\n---> Lanzamiento dado1: " + lanzarDado1);
		System.out.println("---> Lanzamiento dado2: " + lanzarDado2);

		realizarJuego(calculadora);
	}

	public boolean validarGanar(int num) {
		return num == 7;
	}

	public void realizarJuego(Calculadora calculadora) {
		if (validarGanar(calculadora.sumar())) {
			System.out.println("\n#Ganaste!");
		} else {
			System.out.println("\n#Perdiste!");
		}
	}

}
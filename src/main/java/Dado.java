import java.util.Random;

public class Dado {

	private int[] caras;

	public int lanzarDado() {
		int index = new Random().nextInt(this.caras.length);
		return this.caras[index];
	}

	public Dado() {
		this.caras = new int[]{1, 2, 3, 4, 5, 6};
	}

}
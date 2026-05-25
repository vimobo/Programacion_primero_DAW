public class PruebaAnimal {
	public static void main(String[] args) {
		Animal animal;
		// (int) (Math.floor(Math.random()*(N-M+1)+M));
		int aleatorio = (int) (Math.random() * 2) + 1;
		System.out.println(aleatorio);
		if (aleatorio == 1)
			animal = new Perro("Luna");
		else
			animal = new Gato("Luna");
		animal.hacerSonido();
	}
}
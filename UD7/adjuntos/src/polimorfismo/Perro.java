public class Perro extends Animal {
	// Atributos

	// Constructor
	public Perro(String nombre) {
		super(nombre);
	}

	// Métodos
	@Override
	public void hacerSonido() {
		System.out.println("Guau-guau-guau");
	}
}
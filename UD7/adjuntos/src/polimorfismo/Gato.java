public class Gato extends Animal {
	// Atributos

	// Constructor
	public Gato(String nombre) {
		super(nombre);
	}

	// Métodos
	@Override
	public void hacerSonido() {
		System.out.println("Miau-miau-miau");
	}
}
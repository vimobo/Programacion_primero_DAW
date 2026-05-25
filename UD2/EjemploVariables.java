public class EjemploVariables {
	public static void main(String[] args) {
		// declaración de variables y objetos
		byte NumeroMasPequeño = 1;
		short NumeroPequeño = 128;
		int Numero = 32768;
		long NumeroMasLargo = 2147483648L;

		// resultado enteros
		System.out.println(NumeroMasPequeño + "," + NumeroPequeño);
		float Real = 10.5F;
		double RealPequeño = 1080.653;
		System.out.println(Real);
		System.out.println(RealPequeño);

		// ahora con los boolean
		boolean VarBool = true;
		System.out.println(VarBool);

		// char a continuación
		String Letras = "hola";
		System.out.println(Letras);
	}
}
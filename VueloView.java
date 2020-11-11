import java.util.Scanner;

public class VueloView {
	public String aerolineaVueloEntrada;
	public String destinoVueloEntrada;
	public int numAsientoVueloEntrada;
	public int numeroVueloEntrada;
	public EnumVuelo tipoVueloEntrada;

	public VueloView() throws Exception {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Aerolinea: ");
			this.aerolineaVueloEntrada = scanner.nextLine();

			System.out.print("Tipo de vuelo (Internacional/Nacional): ");
			this.tipoVueloEntrada = EnumVuelo.valueOf(scanner.nextLine().toUpperCase());

			System.out.print("Destino: ");
			this.destinoVueloEntrada = scanner.nextLine();

			System.out.print("Numero de asiento: ");
			this.numAsientoVueloEntrada = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Numero de vuelo: ");
			this.numeroVueloEntrada = scanner.nextInt();

		} catch (Exception e) {
			throw new Exception("¡Error en la entrada de datos!");
		}
	}
}

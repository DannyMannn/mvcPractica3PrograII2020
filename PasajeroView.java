import java.util.Scanner;

public class PasajeroView {
	public EnumClase claseEntrada;
	public int edadEntrada;
	public String nombreEntrada;
	public String sexoEntrada;

	public PasajeroView() throws Exception {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Nombre: ");
			this.nombreEntrada = scanner.nextLine();

			System.out.print("Edad: ");
			this.edadEntrada = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Sexo: ");
			this.sexoEntrada = scanner.nextLine();

			System.out.print("Clase de vuelo (Primera_Clase/Ejecutivo/Turista): ");
			this.claseEntrada = EnumClase.valueOf(scanner.nextLine().toUpperCase());

		} catch (Exception e) {
			throw new Exception("¡Error en la entrada de datos!");
		}
	}
}

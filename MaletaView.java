import java.util.Scanner;

public class MaletaView {
	public double pesoMaletaEntrada;

	public MaletaView() throws Exception {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Ingrese el peso de la maleta: ");
			this.pesoMaletaEntrada = scanner.nextDouble();
			scanner.nextLine();
		} catch (Exception e) {
			throw new Exception("¡Error en la entrada de datos!");
		}
	}
}

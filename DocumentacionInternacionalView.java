import java.util.Scanner;

public class DocumentacionInternacionalView {
	public int numPasaporteEntrada;
	public EnumVisa visaEntrada;
	public int vigenciaEntrada;

	public DocumentacionInternacionalView() throws Exception {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Ingresa numero de pasaporte: ");
			this.numPasaporteEntrada = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Ingresa tipo de visa (TURISTA, TRABAJO, ATENCION_MEDICA): ");
			this.visaEntrada = EnumVisa.valueOf(scanner.nextLine().toUpperCase());

			System.out.println("Años de vigencia de la visa: ");
			this.vigenciaEntrada = scanner.nextInt();

		} catch (Exception e) {
			throw new Exception("¡Error en la entrada de datos!");
		}
	}
}


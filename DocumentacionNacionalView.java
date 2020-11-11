import java.util.Scanner;

public class DocumentacionNacionalView {
	public String curpEntrada;

	public DocumentacionNacionalView() throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingresa CURP: ");
		this.curpEntrada = scanner.nextLine();
	}
}


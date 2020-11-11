import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String res;
		double totalExcesoMaletas = 0;

		VueloController vController = new VueloController();
		DocumentacionController dController = new DocumentacionController();
		PasajeroController pController = new PasajeroController();
		MaletaController maletaController = new MaletaController();

		Vuelo vuelo;
		Documentacion documentacion;
		Pasajero pasajero;
		Maleta maleta;
		Boleto boleto;

		try {
			vController.mostrarVista();
		} catch (Exception e) {
			e.printStackTrace();
		}


		vuelo = vController.creaVuelo();

		try {
			dController.mostrarVista(vuelo.getTipo());
		} catch (Exception e) {
			e.printStackTrace();
		}

		documentacion = dController.creaDocumentacion(vuelo.getTipo());

		try {
			pController.mostrarVista();
		} catch (Exception e) {
			e.printStackTrace();
		}

		pasajero = pController.creaPasajero(documentacion);

		boleto = new Boleto(pasajero, vuelo);

		do {
			System.out.println("¿Desea documentar maleta?(S/N): ");
			res = scanner.nextLine().toLowerCase();
			if (res.equals("s")) {
				try {
					maletaController.mostrarVista();
				} catch (Exception e) {
					e.printStackTrace();
				}
				maleta = maletaController.creaMaleta();
				try {
					pasajero.documentarMaleta(maleta);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} while (!res.equals("n"));

		Maleta[] equipajePasajero = pasajero.getEquipaje();
		for (int i = 0; i < equipajePasajero.length; i++) {
			if (equipajePasajero[i] != null)
				totalExcesoMaletas += equipajePasajero[i].obtenerTotal();
		}

		System.out.println("Precio total de exceso de equipaje: $" + totalExcesoMaletas);
		System.out.println(boleto);

		scanner.close();
	}
}

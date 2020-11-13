import java.util.Scanner;
import java.util.Date;

public class Sistema {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String res;
		double totalExcesoMaletas = 0;

		VueloView vueloView = new VueloView();
		Vuelo vuelo = new Vuelo();
		Pasajero pasajero = new Pasajero();
		VueloController vController = new VueloController(vueloView,vuelo,pasajero);

		DocumentacionController documentacionController = new DocumentacionController();


		PasajeroView vistaPasajero = new PasajeroView();
		PasajeroController pasajeroController = new PasajeroController(vistaPasajero,pasajero);

		MaletaController maletaController = new MaletaController();

		Documentacion documentacion;
		Maleta maleta;
		Boleto boleto;
		try {
			vueloView.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		try {
			documentacionController.mostrarVista(vuelo.getTipo());
		} catch (Exception e) {
			e.printStackTrace();
		}

		documentacion = documentacionController.creaDocumentacion(vuelo.getTipo());
		pasajero.setDocumentacion(documentacion);

		try {
			vistaPasajero.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

		//pasajero = pController.creaPasajero(documentacion);

		 */
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

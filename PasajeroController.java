public class PasajeroController {
	private PasajeroView vista;

	public Pasajero creaPasajero(Documentacion documentacion) {

		return new Pasajero(vista.getClasePasajero(),
				documentacion,
				vista.getEdadPasajero(),
				vista.getNombrePasajero(),
				vista.getGeneroPasajero());
	}

	public void mostrarVista() throws Exception {
		this.vista = new PasajeroView();
	}
}

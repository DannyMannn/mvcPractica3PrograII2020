public class PasajeroController {
	private PasajeroView vista;

	public Pasajero creaPasajero(Documentacion documentacion) {
		return new Pasajero(vista.claseEntrada,
				documentacion,
				vista.edadEntrada,
				vista.nombreEntrada,
				vista.sexoEntrada);
	}

	public void mostrarVista() throws Exception {
		this.vista = new PasajeroView();
	}
}

public class PasajeroController {
	private PasajeroView vista;

	public Pasajero creaPasajero(Documentacion documentacion) {
		return new Pasajero(vista.getClaseEntrada(),
				documentacion,
				vista.getEdadEntrada(),
				vista.getNombreEntrada(),
				vista.getSexoEntrada());
	}

	public void mostrarVista() throws Exception {
		this.vista = new PasajeroView();
	}
}

public class VueloController {
	private VueloView vista;

	public Vuelo creaVuelo() {
		return new Vuelo(vista.aerolineaVueloEntrada,
				vista.destinoVueloEntrada,
				vista.numAsientoVueloEntrada,
				vista.numeroVueloEntrada,
				vista.tipoVueloEntrada);
	}

	public void mostrarVista() throws Exception {
		this.vista = new VueloView();
	}
}

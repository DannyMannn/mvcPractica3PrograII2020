public class MaletaController {
	private MaletaView vista;

	public Maleta creaMaleta() {
		return new Maleta(this.vista.pesoMaletaEntrada);
	}
	public void mostrarVista() throws Exception {
		this.vista = new MaletaView();
	}
}

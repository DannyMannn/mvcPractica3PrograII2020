public class DocumentacionController {
	private DocumentacionNacionalView nacionalVista;
	private DocumentacionInternacionalView internacionalVista;

	public Documentacion creaDocumentacion(EnumVuelo tipoVuelo) {
		switch (tipoVuelo) {
			case INTERNACIONAL:
				return new DocumentacionInternacional(
						internacionalVista.getNumPasaporteEntrada(),
						internacionalVista.getVisaEntrada(),
						internacionalVista.getVigenciaEntrada());
			case NACIONAL:
				return new DocumentacionNacional(
						nacionalVista.getCurpEntrada());
		}
		return null;
	}

	public void mostrarVista(EnumVuelo tipoVuelo) throws Exception {
		switch (tipoVuelo) {
			case INTERNACIONAL:
				this.internacionalVista = new DocumentacionInternacionalView();
				break;
			case NACIONAL:
				this.nacionalVista = new DocumentacionNacionalView();
				break;
		}
	}
}

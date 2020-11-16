import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DocumentacionController {
	private DocumentacionNacionalView nacionalVista;
	private DocumentacionInternacionalView internacionalVista;
	private EnumVuelo tipoVuelo;
	private Documentacion documentacion;
	private Pasajero pasajeroModel; // no se me ocurrió otro manera para inicializar documentacion de pasajero
	//public Documentacion creaDocumentacion(EnumVuelo tipoVuelo)
	public DocumentacionController(EnumVuelo tipoVuelo,Pasajero pasajeroModel) throws Exception {
		this.pasajeroModel = pasajeroModel;
		this.tipoVuelo = tipoVuelo;
		switch(tipoVuelo) {
			case INTERNACIONAL:
				internacionalVista = new DocumentacionInternacionalView();
				internacionalVista.setVisible(true);
				this.internacionalVista.addSubmitListener(new SubmitListener());
				break;
			case NACIONAL:
				nacionalVista = new DocumentacionNacionalView();
				break;
		}
	}
	class SubmitListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			String passportNum;
			EnumVisa visaType;
			int visaValidity;
			String curp;
			switch(tipoVuelo){
				case INTERNACIONAL:
					try{
						passportNum = internacionalVista.getPassportNum();
						visaType = internacionalVista.getVisaType();
						visaValidity = internacionalVista.getVisaValidity();
						documentacion = new DocumentacionInternacional(passportNum,visaType,visaValidity);
					}
					catch (Exception ex){
						System.out.println(ex);
						JOptionPane.showMessageDialog(null,"ERROR DE DATOS DOC");
					}
					finally {
						JComponent comp = (JComponent) e.getSource();
						Window win = SwingUtilities.getWindowAncestor(comp);
						win.dispose();
						pasajeroModel.setDocumentacion(documentacion);
					}
					break;
				case NACIONAL:
					try{
						curp = nacionalVista.getCurpEntrada();
						documentacion = new DocumentacionNacional(curp);
					}
					catch (Exception ex){
						System.out.println(ex);
						JOptionPane.showMessageDialog(null,"ERROR DE DATOS");
					}
					finally {
						JComponent comp = (JComponent) e.getSource();
						Window win = SwingUtilities.getWindowAncestor(comp);
						win.dispose();
						pasajeroModel.setDocumentacion(documentacion);
					}
			}
		}
	}

	public Documentacion getDocumentacion() {
		return documentacion;
	}
	/*
		switch (tipoVuelo) {
			case INTERNACIONAL:
				return new DocumentacionInternacional(
						internacionalVista.getPassportNum(),
						internacionalVista.getVisaType(),
						internacionalVista.getVisaValidity());
			case NACIONAL:
				return new DocumentacionNacional(
						nacionalVista.curpEntrada);
		}
		return null;
	}

	public void mostrarVista(EnumVuelo tipoVuelo) throws Exception {
		switch (tipoVuelo) {
			case INTERNACIONAL:
				this.internacionalVista = new DocumentacionInternacionalView();
				this.internacionalVista.setVisible(true);
				break;
			case NACIONAL:
				this.nacionalVista = new DocumentacionNacionalView();
				break;
		}
	}*/
}

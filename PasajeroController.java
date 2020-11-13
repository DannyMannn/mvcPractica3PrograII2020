import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasajeroController {
	private PasajeroView vista;
	private Pasajero pasajeroModel;
	//public Pasajero creaPasajero(Documentacion documentacion)
	public PasajeroController(PasajeroView vista,Pasajero pasajero) {
		this.vista = vista;
		this.pasajeroModel = pasajero;
		this.vista.addSubmitListener(new SubmitListener());

	}
	class SubmitListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			EnumClase clase;
			String nombre;
			int edad;
			String sexo;
			try{
				clase = vista.getClasePasajero();
				nombre = vista.getNombrePasajero();
				edad = vista.getEdadPasajero();
				sexo = vista.getGeneroPasajero();
				pasajeroModel.setAtributes(clase,edad,nombre,sexo);
			}
			catch (Exception ex){
				System.out.println(ex);
				JOptionPane.showMessageDialog(null,"ERROR");
			}
			finally {
				JComponent comp = (JComponent) e.getSource();
				Window win = SwingUtilities.getWindowAncestor(comp);
				win.dispose();
			}
		}

	}

	public void mostrarVista() throws Exception {
		this.vista = new PasajeroView();
	}
}

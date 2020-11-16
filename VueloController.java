import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VueloController {
	private VueloView vista;
	private Vuelo vueloModel;
	private Pasajero pasajero;

	public VueloController(VueloView vista,Vuelo vuelo,Pasajero pasajero) {
		this.vista = vista;
		this.vueloModel = vuelo;
		this.pasajero = pasajero;
		this.vista.addSubmitListener(new SubmitListener());
	}
	class SubmitListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String airline;
			String destination;
			int seatNum;
			int flightNum;
			EnumVuelo flightType;
			try{
				airline = vista.getAirline();
				destination = vista.getDestination();
				seatNum = vista.getNumSeat();
				flightNum = vista.getNumFlight();
				flightType = vista.getFlightType();
				vueloModel.setAtributes(airline,destination,seatNum,flightNum,flightType);
				pasajero.setFlightType(flightType);
			}
			catch (Exception ex){
				System.out.println(ex);
				JOptionPane.showMessageDialog(null,"ERROR DE DATOS");
			}
			finally {
				//cierra jpanel
				JComponent comp = (JComponent) e.getSource();
				Window win = SwingUtilities.getWindowAncestor(comp);
				win.dispose();

				PasajeroView pasajeroView = new PasajeroView();
				PasajeroController pasajeroController = new PasajeroController(pasajeroView,pasajero);
				pasajeroView.setVisible(true);
			}
		}

	}
}

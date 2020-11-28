import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class VueloView extends JPanel {
	private JLabel aerolineaLabel = new JLabel("Aerolinea: ");
	private JLabel destinoVueloLabel = new JLabel("Destino: ");
	private JLabel numAsientoLabel = new JLabel("Número de Asiento: ");
	private JLabel numVueloLabel = new JLabel("Número de Vuelo: ");
	private JLabel tipoVueloLabel = new JLabel("Tipo de Vuelo: ");
	private JTextField aerolineaTextField = new JTextField(20);
	private JTextField destinoTextField = new JTextField(20);
	private JTextField numAsientoTextField = new JTextField(20);
	private JTextField numVueloTextField = new JTextField(20);
	private JTextField tipoVueloTextField = new JTextField(20);

	//inicializo para ejemplificar
	public String aerolineaVueloEntrada = "";
	public String destinoVueloEntrada = "";
	public int numAsientoVueloEntrada = 0;
	public int numeroVueloEntrada = 0;
	public EnumVuelo tipoVueloEntrada = EnumVuelo.INTERNACIONAL;

	public String getAerolineaVueloEntrada() {
		return aerolineaVueloEntrada;
	}

	public String getDestinoVueloEntrada(){
		return aerolineaVueloEntrada;
	}

	public int getNumAsientoVueloEntrada() {
		return numAsientoVueloEntrada;
	}

	public int getNumeroVueloEntrada() {
		return numeroVueloEntrada;
	}

	public EnumVuelo getTipoVueloEntrada() {
		return tipoVueloEntrada;
	}

	public VueloView() {
		this.setLayout(new GridBagLayout());

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(10, 10, 10, 10);

		constraints.gridx = 0;
		constraints.gridy = 0;
		this.add(aerolineaLabel,constraints);

		constraints.gridx = 1;
		this.add(aerolineaTextField,constraints);

		constraints.gridx = 0;
		constraints.gridy = 1;
		this.add(destinoVueloLabel,constraints);

		constraints.gridx = 1;
		this.add(destinoTextField,constraints);

		constraints.gridx = 0;
		constraints.gridy = 2;
		this.add(numAsientoLabel,constraints);

		constraints.gridx = 1;
		this.add(numAsientoTextField,constraints);

		constraints.gridx = 0;
		constraints.gridy = 3;
		this.add(numVueloLabel,constraints);

		constraints.gridx = 1;
		this.add(numVueloTextField,constraints);

		constraints.gridx = 0;
		constraints.gridy = 4;
		this.add(tipoVueloLabel,constraints);

		constraints.gridx = 1;
		this.add(tipoVueloTextField,constraints);

		this.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "VueloView"));
	}
}

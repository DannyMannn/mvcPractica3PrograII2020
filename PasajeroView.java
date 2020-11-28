import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class PasajeroView extends JPanel {
	private JLabel nombreLabel = new JLabel("Nombre: ");
	private JLabel edadLabel = new JLabel("Edad: ");
	private JLabel sexoLabel = new JLabel("Sexo: ");
	private JLabel claseVueloLabel = new JLabel("Clase de Vuelo: ");
	private JTextField nombreTextField = new JTextField(20);
	private JTextField edadTextField = new JTextField(20);
	private JTextField sexoTextField = new JTextField(20);//cambiar a radioButton
	private JComboBox<String> claseVueloComboBox = new JComboBox<>();

	//inicializo para ejemplificar
	private EnumClase claseEntrada = EnumClase.TURISTA;
	private int edadEntrada = 0;
	private String nombreEntrada = "";
	private String sexoEntrada = "Masculino";

	public EnumClase getClaseEntrada(){
		return claseEntrada;
	}

	public int getEdadEntrada(){
		return edadEntrada;
	}

	public String getNombreEntrada(){
		return nombreEntrada;
	}

	public String getSexoEntrada(){
		return sexoEntrada;
	}

	public PasajeroView() {
		this.setLayout(new GridBagLayout());

		claseVueloComboBox.setModel(new DefaultComboBoxModel<>(
				new String[] { "TURISTA", "PRIMERA_CLASE", "EJECUTIVO" }));

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(10, 10, 10, 10);

		constraints.gridx = 0;
		constraints.gridy = 0;
		this.add(nombreLabel,constraints);

		constraints.gridx = 1;
		this.add(nombreTextField,constraints);

		constraints.gridx = 0;
		constraints.gridy = 1;
		this.add(edadLabel,constraints);

		constraints.gridx = 1;
		this.add(edadTextField,constraints);

		constraints.gridx = 0;
		constraints.gridy = 2;
		this.add(sexoLabel,constraints);

		constraints.gridx = 1;
		this.add(sexoTextField,constraints);

		constraints.gridx = 0;
		constraints.gridy = 3;
		this.add(claseVueloLabel,constraints);

		constraints.gridx = 1;
		this.add(claseVueloComboBox,constraints);

		this.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "PasajeroView"));
	}
}

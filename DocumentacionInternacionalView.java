import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.nio.ByteOrder;
import java.util.Scanner;

public class DocumentacionInternacionalView extends JPanel {
	private JLabel numPasaporteLabel = new JLabel("Número de Pasaporte: ");
	private JLabel tipoVisaLabel = new JLabel("Tipo de Visa: ");
	private JLabel vigenciaLabel = new JLabel("Vigencia: ");
	private JTextField numPasaporteTextField = new JTextField(20);
	private JComboBox<String> tipoVisaComboBox = new JComboBox<>();
	private JTextField vigenciaTextField = new JTextField(20);

	//los inicializo para ejemplificar en el main sin ActionListener o Events
	private int numPasaporteEntrada = 0;
	private EnumVisa visaEntrada = EnumVisa.TURISTA;
	private int vigenciaEntrada = 0;

	public int getVigenciaEntrada() {
		return vigenciaEntrada;
	}

	public EnumVisa getVisaEntrada() {
		return visaEntrada;
	}

	public int getNumPasaporteEntrada(){
		return numPasaporteEntrada;
	}


	public DocumentacionInternacionalView(){
		this.setLayout(new GridBagLayout());

		tipoVisaComboBox.setModel(new DefaultComboBoxModel<>(
				new String[] { "TURISTA", "TRABAJO", "ATENCION_MEDICA" }));

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(10, 10, 10, 10);

		constraints.gridx = 0;
		constraints.gridy = 0;
		this.add(numPasaporteLabel,constraints);

		constraints.gridx = 1;
		this.add(numPasaporteTextField,constraints);

		constraints.gridx = 0;
		constraints.gridy = 1;
		this.add(tipoVisaLabel,constraints);

		constraints.gridx = 1;
		this.add(tipoVisaComboBox,constraints);

		constraints.gridx = 0;
		constraints.gridy = 2;
		this.add(vigenciaLabel,constraints);

		constraints.gridx = 1;
		this.add(vigenciaTextField,constraints);

		this.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "DocumentacionInternacionalView"));
	}
}
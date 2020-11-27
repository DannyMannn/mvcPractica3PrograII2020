import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Scanner;

public class DocumentacionInternacionalView extends JPanel {
	private JLabel numPasaporteLabel = new JLabel("Número de Pasaporte: ");
	private JLabel tipoVisaLabel = new JLabel("Tipo de Visa: ");
	private JLabel vigenciaLabel = new JLabel("Vigencia: ");
	private JTextField numPasaporteTextField = new JTextField(20);
	private JComboBox<String> tipoVisaComboBox = new JComboBox<>();
	private JTextField vigenciaTextField = new JTextField(20);

	public int numPasaporteEntrada;
	public EnumVisa visaEntrada;
	public int vigenciaEntrada;

	public DocumentacionInternacionalView(){
		this.setLayout(new GridBagLayout());

		tipoVisaComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "TURISTA", "PRIMERA_CLASE", "EJECUTIVO" }));

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

	public static void main(String[] args) {
		JFrame mainFrame = new JFrame();
		mainFrame.setLayout(new BorderLayout());
		DocumentacionInternacionalView view = new DocumentacionInternacionalView();
		DocumentacionNacionalView view2 = new DocumentacionNacionalView();
		mainFrame.getContentPane().add(view,BorderLayout.WEST);
		mainFrame.getContentPane().add(view2,BorderLayout.EAST);
		mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
		mainFrame.pack();
	}

}


import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class DocumentacionNacionalView extends JPanel{
	private JLabel curpLabel = new JLabel("Ingresa CURP: ");
	private JTextField curpField = new JTextField(20);

	private String curpEntrada = "ABCD1234";

	public String getCurpEntrada() {
		return curpEntrada;
	}

	public DocumentacionNacionalView() {
		this.setLayout(new GridBagLayout());

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(10, 10, 10, 10);

		constraints.gridx = 0;
		constraints.gridy = 0;
		this.add(curpLabel,constraints);

		constraints.gridx = 1;
		this.add(curpField,constraints);

		this.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "DocumentacionNacionalView"));
	}
}


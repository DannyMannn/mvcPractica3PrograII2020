import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class MaletaView extends JPanel{
	private JLabel pesoMaletaLabel = new JLabel("Ingrese Peso");
	private JTextField pesoMaletaTextField = new JTextField(20);

	private double pesoMaletaEntrada = 0;

	public double getPesoMaletaEntrada(){
		return pesoMaletaEntrada;
	}
	MaletaView(){
		this.setLayout(new GridBagLayout());

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(10, 10, 10, 10);

		constraints.gridx = 0;
		constraints.gridy = 0;
		this.add(pesoMaletaLabel,constraints);

		constraints.gridx = 1;
		this.add(pesoMaletaTextField,constraints);

		this.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "Registrar Maleta"));
	}
}

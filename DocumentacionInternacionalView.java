import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DocumentacionInternacionalView extends JFrame {
	private JLabel passportNumLabel;
	private JTextField passportNumTextField;
	private JButton botonEnviar;
	private JLabel visaTypeLabel;
	private JComboBox<String> visaTypeComboBox;
	private JPanel mainPanel;
	private JLabel planeGUI;
	private JLabel visaValidityLabel;
	private JTextField visaValidityTextField;
	private int visaValidity;
	private EnumVisa visaType = EnumVisa.TURISTA;
	private String passportNum;

	public DocumentacionInternacionalView() {
		initComponents();
	}

	private void initComponents() {
		mainPanel = new JPanel();
		passportNumLabel = new JLabel();
		passportNumTextField = new JTextField();
		visaTypeLabel = new JLabel();
		visaValidityLabel = new JLabel();
		visaTypeComboBox = new JComboBox<>();
		botonEnviar = new JButton();
		visaValidityTextField = new JTextField();
		planeGUI = new JLabel();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		mainPanel.setLayout(null);

		passportNumLabel.setFont(new Font("Segoe UI Black", 0, 24));
		passportNumLabel.setText("Número de Pasaporte");
		mainPanel.add(passportNumLabel);
		passportNumLabel.setBounds(40, 160, 280, 30);

		mainPanel.add(passportNumTextField);
		passportNumTextField.setBounds(40, 200, 190, 30);

		visaTypeLabel.setFont(new Font("Segoe UI Black", 0, 24));
		visaTypeLabel.setText("Tipo de Visa");
		mainPanel.add(visaTypeLabel);
		visaTypeLabel.setBounds(40, 360, 170, 40);

		visaValidityLabel.setFont(new Font("Segoe UI Black", 0, 24));
		visaValidityLabel.setText("Años de Vigencia de Visa");
		mainPanel.add(visaValidityLabel);
		visaValidityLabel.setBounds(40, 260, 320, 40);

		visaTypeComboBox.setFont(new Font("Segoe UI Emoji", 0, 12));
		visaTypeComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "TURISTA", "TRABAJO", "ATENCION_MEDICA" }));
		visaTypeComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				visaType = EnumVisa.valueOf(cb.getSelectedItem().toString());
			}
		});
		mainPanel.add(visaTypeComboBox);
		visaTypeComboBox.setBounds(230, 370, 120, 30);

		botonEnviar.setFont(new Font("Segoe UI Black", 0, 24));
		botonEnviar.setText("ENVIAR");
		mainPanel.add(botonEnviar);
		botonEnviar.setBounds(130, 470, 160, 70);

		mainPanel.add(visaValidityTextField);
		visaValidityTextField.setBounds(40, 300, 190, 30);

		planeGUI.setBackground(new Color(0, 0, 0));
		planeGUI.setIcon(new ImageIcon("Images/Registration.png"));
		planeGUI.setBorder(new MatteBorder(null));
		mainPanel.add(planeGUI);
		planeGUI.setBounds(0, -50, 420, 700);

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
								.addGap(0, 0, 0))
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
		);

		pack();
	}

	public EnumVisa getVisaType() {
		return visaType;
	}

	public int getVisaValidity(){
		return Integer.parseInt(visaValidityTextField.getText());
	}

	public String getPassportNum(){
		return passportNumTextField.getText();
	}

	void addSubmitListener(ActionListener listenForSubmitButton){
		botonEnviar.addActionListener(listenForSubmitButton);
	}
}


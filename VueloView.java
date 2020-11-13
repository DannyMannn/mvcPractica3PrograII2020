import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class VueloView extends JFrame {
	private JLabel airlineLabel;
	private JTextField airlineTextField;
	private JButton botonEnviar;
	private JLabel destinationLabel;
	private JTextField destinationTextField;
	private JLabel flightNumLabel;
	private JTextField flightNumTextField;
	private JComboBox<String> flightTypeComboBox;
	private JLabel flightTypeLabel;
	private JPanel mainPanel;
	private JLabel planeGUI;
	private JLabel seatNumLabel;
	private JTextField seatNumTextField;

	public VueloView() {
		initComponents();
	}
	private EnumVuelo flightType;

	private void initComponents() {
		setTitle("Registro de Boleto");
		this.setResizable(false);
		setIconImage(new ImageIcon(getClass().getResource("/Images/plane.png")).getImage());
		mainPanel = new JPanel();
		airlineLabel = new JLabel();
		airlineTextField = new JTextField();
		destinationLabel = new JLabel();
		destinationTextField = new JTextField();
		seatNumLabel = new JLabel();
		flightNumLabel = new JLabel();
		flightTypeComboBox = new JComboBox<>();
		botonEnviar = new JButton();
		seatNumTextField = new JTextField();
		flightNumTextField = new JTextField();
		flightTypeLabel = new JLabel();
		planeGUI = new JLabel();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		mainPanel.setLayout(null);

		airlineLabel.setFont(new Font("Segoe UI Black", 0, 24));
		airlineLabel.setText("Aeorlinea");
		mainPanel.add(airlineLabel);
		airlineLabel.setBounds(40, 120, 130, 30);

		mainPanel.add(airlineTextField);
		airlineTextField.setBounds(40, 150, 190, 30);

		destinationLabel.setFont(new Font("Segoe UI Black", 0, 24));
		destinationLabel.setText("Destino");
		mainPanel.add(destinationLabel);
		destinationLabel.setBounds(40, 180, 100, 40);

		mainPanel.add(destinationTextField);
		destinationTextField.setBounds(40, 220, 190, 30);

		seatNumLabel.setFont(new Font("Segoe UI Black", 0, 24));
		seatNumLabel.setText("Número de Asiento");
		mainPanel.add(seatNumLabel);
		seatNumLabel.setBounds(40, 250, 250, 40);

		flightNumLabel.setFont(new Font("Segoe UI Black", 0, 24));
		flightNumLabel.setText("Número de Vuelo");
		mainPanel.add(flightNumLabel);
		flightNumLabel.setBounds(40, 330, 220, 30);

		flightTypeComboBox.setFont(new Font("Segoe UI Emoji", 0, 12));
		flightTypeComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "INTERNACIONAL", "NACIONAL" }));

		flightTypeComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				flightType = EnumVuelo.valueOf(cb.getSelectedItem().toString());
			}
		});
		mainPanel.add(flightTypeComboBox);
		flightTypeComboBox.setBounds(250, 400, 120, 30);

		botonEnviar.setFont(new Font("Segoe UI Black", 0, 24));
		botonEnviar.setText("ENVIAR");
		mainPanel.add(botonEnviar);
		botonEnviar.setBounds(130, 470, 160, 70);

		mainPanel.add(seatNumTextField);
		seatNumTextField.setBounds(40, 290, 190, 30);

		mainPanel.add(flightNumTextField);
		flightNumTextField.setBounds(40, 360, 190, 30);

		flightTypeLabel.setFont(new Font("Segoe UI Black", 0, 24)); // NOI18N
		flightTypeLabel.setText("Tipo de Vuelo");
		mainPanel.add(flightTypeLabel);
		flightTypeLabel.setBounds(40, 390, 210, 40);

		planeGUI.setBackground(new Color(0, 0, 0));
		planeGUI.setIcon(new ImageIcon("C:\\Users\\Daniel Sánchez V\\Documents\\GitHub\\mvcPractica3PrograII2020\\Images\\Registration.png")); // NOI18N
		//planeGUI.setBorder(new javax.swing.border.MatteBorder(null));
		mainPanel.add(planeGUI);
		planeGUI.setBounds(0, -50, 420, 700);

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
								.addGap(0, 0, 0))
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
		);

		pack();
	}

	public String getAirline(){
		return this.airlineTextField.getText();
	}

	public String getDestination(){
		return this.destinationTextField.getText();
	}

	public int getNumSeat(){
		return Integer.parseInt(this.seatNumTextField.getText());
	}

	public int getNumFlight(){
		return Integer.parseInt(this.flightNumTextField.getText());
	}

	public EnumVuelo getFlightType(){
		return this.flightType;
	}

	void addSubmitListener(ActionListener listenForSubmitButton){
		botonEnviar.addActionListener(listenForSubmitButton);
	}
}


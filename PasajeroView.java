import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class PasajeroView extends JFrame implements ActionListener {
    private JLabel ageLabel;
    private JTextField ageTextField;
    private JButton botonEnviar;
    private JRadioButton femRButton;
    private JComboBox<String> flightClassComboBox;
    private JLabel flightClassLabel;
    private JLabel genderLabel;
    private JPanel jPanel1;
    private JRadioButton maleRButton;
    private JLabel nameLabel;
    private JTextField nameTextField;
    private JLabel planeGUI;
    private String generoPasajero = "";
    private String claseVueloPasajero = "";
    public PasajeroView() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Registro de Boleto");
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Images/plane.png")).getImage());
        jPanel1 = new JPanel();
        nameLabel = new JLabel();
        nameTextField = new JTextField();
        ageLabel = new JLabel();
        ageTextField = new JTextField();
        genderLabel = new JLabel();
        maleRButton = new JRadioButton();
        femRButton = new JRadioButton();
        flightClassLabel = new JLabel();
        flightClassComboBox = new JComboBox<>();
        planeGUI = new JLabel();
        botonEnviar = new JButton();
        botonEnviar.addActionListener(this);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        nameLabel.setFont(new Font("Segoe UI Black", 0, 24));
        nameLabel.setText("Nombre");
        jPanel1.add(nameLabel);
        nameLabel.setBounds(40, 160, 130, 30);
        /*
        nameTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });*/
        jPanel1.add(nameTextField);
        nameTextField.setBounds(40, 200, 190, 30);

        ageLabel.setFont(new Font("Segoe UI Black", 0, 24)); // NOI18N
        ageLabel.setText("Edad");
        jPanel1.add(ageLabel);
        ageLabel.setBounds(40, 230, 100, 40);

        jPanel1.add(ageTextField);
        ageTextField.setBounds(40, 270, 190, 30);

        genderLabel.setFont(new Font("Segoe UI Black", 0, 24));
        genderLabel.setText("Género");
        jPanel1.add(genderLabel);
        genderLabel.setBounds(40, 320, 130, 40);

        maleRButton.setFont(new Font("Segoe UI Emoji", 0, 14));
        maleRButton.setText("Masculino");
        maleRButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if(maleRButton.isSelected()){
                    femRButton.setSelected(false);
                    generoPasajero = maleRButton.getText();
                }

            }
        });
        jPanel1.add(maleRButton);
        maleRButton.setBounds(150, 330, 93, 23);

        femRButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        femRButton.setText("Femenino");
        femRButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if(femRButton.isSelected()){
                    maleRButton.setSelected(false);
                    generoPasajero = femRButton.getText();
                }

            }
        });
        jPanel1.add(femRButton);
        femRButton.setBounds(260, 330, 93, 23);

        flightClassLabel.setFont(new Font("Segoe UI Black", 0, 24));
        flightClassLabel.setText("Clase de Vuelo");
        jPanel1.add(flightClassLabel);
        flightClassLabel.setBounds(40, 390, 200, 30);

        flightClassComboBox.setFont(new Font("Segoe UI Emoji", 0, 12));
        flightClassComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "TURISTA", "PRIMERA_CLASE", "CLASE_EJECUTIVA" }));
        //flightClassComboBox.addContainerListener(new ContainerAdapter() {
          //  public void componentAdded(ContainerEvent evt) {
            //    flightClassComboBoxComponentAdded(evt);
            //}
        //});
        flightClassComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox)e.getSource();
                claseVueloPasajero = (String)cb.getSelectedItem();
            }
        });
        jPanel1.add(flightClassComboBox);
        flightClassComboBox.setBounds(250, 390, 120, 30);

        planeGUI.setHorizontalAlignment(SwingConstants.CENTER);
        planeGUI.setIcon(new ImageIcon("Images/Registration.png"));

        jPanel1.add(botonEnviar);
        botonEnviar.setBounds(125, 470, 160, 65);
        botonEnviar.setText("Enviar");
        botonEnviar.setFont(new Font("Segoe UI Black", 0, 28));

        jPanel1.add(planeGUI);
        planeGUI.setBounds(-30, -50, 480, 700);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );

        pack();
        this.setVisible(true);
    }

    public String getNombrePasajero(){
        return nameTextField.getText();
    }

    public int getEdadPasajero(){
        return Integer.parseInt(ageTextField.getText());
    }

    public String getGeneroPasajero(){
        return generoPasajero;
    }

    public EnumClase getClasePasajero(){
        return EnumClase.valueOf(claseVueloPasajero);
    }

    private void maleRButtonActionPerformed(ActionEvent evt) {
    }

    private void femRButtonActionPerformed(ActionEvent evt) {
    }

    private void flightClassComboBoxActionPerformed(ActionEvent evt) {
    }

    private void flightClassComboBoxComponentAdded(ContainerEvent evt) {
    }


    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PasajeroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasajeroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasajeroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasajeroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasajeroView().setVisible(true);
            }
        });*/
        //PasajeroView gui = new PasajeroView();
       // gui.setVisible(true);
    //}

    @Override
    public void actionPerformed(ActionEvent e) {
        JComponent comp = (JComponent) e.getSource();
        Window win = SwingUtilities.getWindowAncestor(comp);
        win.dispose();
    }
}

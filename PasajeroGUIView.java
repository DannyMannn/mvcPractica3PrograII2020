import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasajeroGUIView extends JFrame  {
    private JPanel lowerPanel;
    private JPanel upperPanel;
    private JTextField nameField;
    private JTextField ageField;
    private JLabel nameLabel;
    private JLabel edadLabel;
    private JLabel titleLabel;
    private JLabel genderLabel;
    private JRadioButton maleRButton;
    private JRadioButton femaleRButton;
    private JComboBox flightClassComboBox;
    private JLabel flightClassLabel;
    private JPanel mainPanel;

    PasajeroGUIView(){
        super("Vuelo");
        this.setContentPane(this.mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setSize(420,550);
        this.setVisible(true);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Images/plane.png")).getImage());
    }

    public static void main(String[] args){
        PasajeroGUIView screen = new PasajeroGUIView();
    }

}

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) {
		JFrame mainFrame = new JFrame();
		mainFrame.setLayout(new BorderLayout());
		DocumentacionInternacionalView view = new DocumentacionInternacionalView();
		DocumentacionNacionalView view2 = new DocumentacionNacionalView();
		PasajeroView view3 = new PasajeroView();
		VueloView view4 = new VueloView();
		MaletaView view5 = new MaletaView();

		mainFrame.getContentPane().add(view,BorderLayout.WEST);
		mainFrame.getContentPane().add(view2,BorderLayout.EAST);
		mainFrame.getContentPane().add(view3,BorderLayout.CENTER);
		mainFrame.getContentPane().add(view4, BorderLayout.SOUTH);
		mainFrame.getContentPane().add(view5,BorderLayout.NORTH);
		mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
		mainFrame.pack();
	}
}

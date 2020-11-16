import javax.swing.*;
import java.util.Scanner;

public class DocumentacionNacionalView {
	public String curpEntrada;

	public DocumentacionNacionalView() throws Exception {
		curpEntrada = JOptionPane.showInputDialog("Ingresa CURP");
	}

	public String getCurpEntrada() {
		return curpEntrada;
	}
}


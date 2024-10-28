package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class tempControler {

	@FXML
	private Button btnSair;
	
	@FXML
	private Button btnCalcularF;
	@FXML
	private Button btnCalcularC;
	@FXML
	private Button btnLimparC;
	@FXML
	private Button btnLimparF;
	@FXML
	private TextField c1;
	@FXML
	private TextField f1;
	@FXML
	private TextField cr1;
	@FXML
	private TextField fr2;
		
	@FXML
	public void onbtSair() {
			System.exit(0);
	}
	@FXML
	public void onbtLimparF() {	
		f1.setText("");
		cr1.setText("");
	}
	public void onbtLimparC() {	
		c1.setText("");
		fr2.setText("");
	}
	
	public void onbtonbtCalcularF() {
	double n1 = Double.parseDouble(f1.getText());
	double resultc = (n1-32)/1.8;
	cr1.setText(String.format("%.2f",resultc));
	
	}
	public void onbtonbtCalcularC() {
	double n2 = Double.parseDouble(c1.getText());
	double resultf = (1.8*n2)+32;
	fr2.setText(String.format("%.2f",resultf));
	}
}

package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class bhaskControle {

	@FXML
	
	private Button btnCalcular;
	@FXML
	private Button btnLimpar;
	@FXML
	private Button btnSair;
	@FXML
	private TextField A;
	@FXML
	private TextField B;
	@FXML
	private TextField C;
	@FXML
	private Label delta;
	@FXML
	private Label x1;
	@FXML
	private Label x2;
	@FXML
	public void onbtLimpar() {
		A.setText("");
		B.setText("");
		C.setText("");
		delta.setText("");
		x1.setText("");
		x2.setText("");
	}
	@FXML
	public void onbtSair() {
			System.exit(0);
	}
	@FXML
	public void onbtCalcular() {
		
	double n1 = Double.parseDouble(A.getText());
	double n2 = Double.parseDouble(B.getText());
	double n3 = Double.parseDouble(C.getText());
	double d1 = Math.pow(n2,2.0) - 4*n1*n3;
	double v1 = (-n2 + Math.sqrt(d1)) / (2.0 * n1 );		
	double v2 = (-n2 - Math.sqrt(d1)) / (2.0 * n1 );
	delta.setText(String.format("%.2f",d1));
	x1.setText(String.format("%.2f",v1));
	x2.setText(String.format("%.2f",v2));
	}
}


package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import util.Alerta;

public class CalcController {

	@FXML
	private Button soma;

	@FXML
	private Button sub;

	@FXML
	private Button mult;

	@FXML
	private Button div;

	@FXML
	private Button limpar;

	@FXML
	private Button sair;

	@FXML
	private TextField v1;

	@FXML
	private TextField v2;

	@FXML
	private TextField result;

	@FXML
	public void onBtLimpar() {

		v1.setText("");
		v2.setText("");
		result.setText("");

	}

	@FXML
	public void onbtSoma() {
		try {
			double n1 = Double.parseDouble(v1.getText());
			double n2 = Double.parseDouble(v2.getText());
			double soma = n1 + n2;
			result.setText(String.format("%.2f", soma));
		} catch (NumberFormatException e) {
			Alerta.showAlert("Erro de entrada de dados", "Entrada inválida", "Entrada de numérico", AlertType.ERROR);
		}
	}

	@FXML
	public void onbtSub() {
		try {
			double n1 = Double.parseDouble(v1.getText());
			double n2 = Double.parseDouble(v2.getText());
			double sub = n1 - n2;
			result.setText(String.format("%.2f", sub));
		} catch (NumberFormatException e) {
			Alerta.showAlert("Erro de entrada de dados", "Entrada inválida", "Entrada de numérico", AlertType.ERROR);
		}
	}

	@FXML
	public void onbtMult() {
		try {
			double n1 = Double.parseDouble(v1.getText());
			double n2 = Double.parseDouble(v2.getText());
			double mult = n1 * n2;
			result.setText(String.format("%.2f", mult));
		} catch (NumberFormatException e) {
			Alerta.showAlert("Erro de entrada de dados", "Entrada inválida", "Entrada de numérico", AlertType.ERROR);
		}
	}

	@FXML
	public void onbtDiv() {
		try {
			double n1 = Double.parseDouble(v1.getText());
			double n2 = Double.parseDouble(v2.getText());
			double div = n1 / n2;
			result.setText(String.format("%.2f", div));
		} catch (NumberFormatException e) {
			Alerta.showAlert("Erro de entrada de dados", "Entrada inválida", "Entrada de numérico", AlertType.ERROR);
		}
	}

	@FXML
	public void onBtSair() {
		System.exit(0);
	}


}

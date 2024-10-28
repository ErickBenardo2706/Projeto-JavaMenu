package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import util.Alerta;

public class telaController implements Initializable {

	@FXML
	private MenuItem quemSomos;

	@FXML
	private MenuItem sair;

	@FXML
	private MenuItem escrever;

	@FXML
	private MenuItem versao;
	
	@FXML
	private MenuItem calc;
	
	@FXML
	private MenuItem bhas;
	
	@FXML
	private MenuItem temp;
	
	
	public void Escrever() {
		System.out.println("Este item de menu ESCREVE NO CONSOLE!!!");
	}

	public void QuemSomos() {
		loadView("Sobre.fxml");
	}

	public void Versao() {
		loadView("Versao.fxml");
	}
	public void Calc() {
		loadView("Calc.fxml");
	}
	public void bhas() {
		loadView("bhask.fxml");
	}
	public void temp() {
		loadView("tempView.fxml");
	}
	
	public void Sair() {
		System.exit(1);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

	public synchronized void loadView(String absolutName) {
		try {
			// carregando uma view, passando como par�metro a localiza��o
			// (absolutName)
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absolutName));
			VBox newVBox = loader.load();

			// obtendo uma refer�ncia da cena principa, criada e exposta na classe Main
			Scene mainScene = Main.getMainScene();

			// fazendo o casting de scrooPane que � o componente da cena principal, para o
			// VBox
			// que � o componente na nova tela a ser carregada na cena principal
			VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

			// guardando o componente MenuBar que dever ser carregado junto com todas as
			// views
			// do sistema
			Node mainMenu = mainVBox.getChildren().get(0);

			// limpando todos os componentes da view principal
			mainVBox.getChildren().clear();

			// adicionando o mainMenu porque deve estar presente em todas as views
			mainVBox.getChildren().add(mainMenu);

			// adicionando todos os componente filhos do layout newVBox (� o layout da
			// tela
			// a ser carregada na janela principal)
			mainVBox.getChildren().addAll(newVBox.getChildren());

		} catch (IOException e) {
			// caso acontece algum erro, emitir� um alerta, conforme implementado
			// anteriormente
			// poss�veis erros aqui � 1) n�o conseguir obter uma refer�ncia da cena
			// principal,
			// 2)n�o conseguir carregar alguma tela, 3) n�o encontrar os componentes da
			// VBox principal
			Alerta.showAlert("IO Exception", "Error loading view", e.getMessage(), AlertType.ERROR);
		}
	}

}

package application;

import java.awt.TextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.Observable;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ControleTelaRelatorio extends MenuBar implements Initializable{

	@FXML
	private TableView tbAgencias;
	@FXML
	private TextField tfPesquisarAgencia;
	@FXML
	private TableColumn<Agencia, String> colGerente;
	@FXML
	private TableColumn<Agencia, String> colCNPJ;
	@FXML
	private TableColumn<Agencia, Endereco> colEndereco;
	@FXML
	private TableColumn<Agencia, String> colEmail;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	@FXML
	protected void ClicouPesquisar(ActionEvent event) {
		preencherTabela(Main.repositorio.getAgencias());
	}
	
	
	private void preencherTabela(ArrayList<Agencia> armz) {
		ObservableList<Agencia> data = FXCollections.observableArrayList(armz);
		
		colGerente.setCellValueFactory(new PropertyValueFactory<>("Gerente"));
		colCNPJ.setCellValueFactory(new PropertyValueFactory<>("CNPJ"));
		colEmail.setCellValueFactory(new PropertyValueFactory<>("e-mail"));
		colEndereco.setCellValueFactory(new PropertyValueFactory<>("Endereço"));
		
		tbAgencias.setItems(data);
	}
	
	

}

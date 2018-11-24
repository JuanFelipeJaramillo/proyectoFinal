package application;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class LoginController{
	
	public Main main;
	
	
	//login
	@FXML
	private Button registrar;
	
	@FXML
	private Button iniciarS;
	
	@FXML
	private TextField userN;
	
	@FXML
	private PasswordField password;
	
	
	//Register
	@FXML
	private TextField nombre;
	
	@FXML
	private TextField apellido;
	
	@FXML
	private TextField fechaN;
	
	@FXML
	private TextField correo;
	
	@FXML
	private PasswordField passwordR;
	
	@FXML
	private PasswordField passwordCon;
	
	@FXML
	private ChoiceBox<String> genero;
	
	@FXML
	private Button siguiente;
	
	@FXML
	private Button atras;
	
	@FXML 
	private javafx.scene.control.Button closeButton; 
	
	public void initialize() {
		// TODO Auto-generated method stub
		
		Main main = new Main();
		
		//agregarUser();
		
	}
	
	@FXML 
	private void actionRegistrarse(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
		Scene scene = new Scene(root);
		Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
		
		window.setOnCloseRequest((WindowEvent evento)->{
			
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Confirmation Dialog");
			alert.setHeaderText(null);
			alert.setContentText("¿Deseas cerrar la app??");

			Optional<ButtonType> result = alert.showAndWait();
			if (result.get() == ButtonType.OK){
				window.close();
			  
			} else {
			    alert.close();
			    //linea que se encarga de evitar del cierre de la app sin confirmacion
			    evento.consume();
			}
			
		});
		window.setScene(scene);
		window.show();
		
	}
	
	
	@FXML 
	private void actionSiguiente(ActionEvent event1) throws IOException {
		
		Parent root1 = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene = new Scene(root1);
		Stage window_register = (Stage)((Node) event1.getSource()).getScene().getWindow();
		
		window_register.setScene(scene);
		window_register.show();
			
		
	}
	@FXML 
	private void actionAtras(ActionEvent event2) throws IOException {
		
		Parent rootA = FXMLLoader.load(getClass().getResource("Login.fxml"));
		Scene scene = new Scene(rootA);
		Stage window_Atras = (Stage)((Node) event2.getSource()).getScene().getWindow();
		
		window_Atras.setScene(scene);
		window_Atras.show();
		
		
			
		
	}
	
	@FXML 
	private void actionStar(ActionEvent events) throws IOException {
		
		Parent rootS = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene = new Scene(rootS);
		Stage window_Star = (Stage)((Node) events.getSource()).getScene().getWindow();
		
		window_Star.setScene(scene);
		window_Star.show();
			
		
		
		
	}
	
//	@FXML 
//	public void agregarUser() {
//		
//		//genero.setItems(FXCollections.observableArrayList("Hombre", "Mujer"));
//		String name  = nombre.getText();
//		String apellido1 = apellido.getText();
//		String  fechaNa = fechaN.getText();
//		String correoL = correo.getText();
//		String generpU = genero.getSelectionModel().getSelectedItem();
//		
//		String confirmacionCon = passwordCon.getText();
//		String contraseña = passwordR.getText();
//		
//		if(name != null && apellido1 != null && fechaNa != null && correoL != null && confirmacionCon != null && contraseña != null) {
//			
//			if(contraseña.equals(confirmacionCon) == false) {
//				Alert contraseñasADiferentes = new Alert(AlertType.INFORMATION);
//				contraseñasADiferentes.setTitle("Information Dialog");
//				contraseñasADiferentes.setHeaderText(null);
//				contraseñasADiferentes.setContentText("Las contraseñas que ingresaste no son iguales!");
//
//				contraseñasADiferentes.showAndWait();
//			}
//			else {
//				main.addUser(name, apellido1, fechaNa, correoL, generpU, contraseña);
//			}
//		}
//		else {
//			Alert datosIncompletos = new Alert(AlertType.INFORMATION);
//			datosIncompletos.setTitle("Information Dialog");
//			datosIncompletos.setHeaderText(null);
//			datosIncompletos.setContentText("No has llenado todos los datos!");
//
//			datosIncompletos.showAndWait();
//		}
//		
//		
//		
//		
//  }
//	
//	


}

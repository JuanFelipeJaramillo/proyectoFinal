package application;
	
import java.util.Optional;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import modelo.Store;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	private Store store;
	
	public void addUser(String nombre, String apellido, String fechaNacimiento, String correoL, String genero, String contraseña ) {
		store.agregarUsuario(nombre, apellido, fechaNacimiento, correoL, genero, contraseña);
	}
	
	Scene login;
	
	public LoginController loginC;
	
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
	
			Pane root = (Pane)FXMLLoader.load(getClass().getResource("Login.fxml"));
			login = new Scene(root,485,245);
			login.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(login);
			
			primaryStage.setOnCloseRequest((WindowEvent evento)->{
				
				Alert alert = new Alert(AlertType.CONFIRMATION);
				alert.setTitle("Confirmation Dialog");
				alert.setHeaderText(null);
				alert.setContentText("¿Deseas cerrar la app??");

				Optional<ButtonType> result = alert.showAndWait();
				if (result.get() == ButtonType.OK){
					primaryStage.close();
				  
				} else {
				    alert.close();
				    
				    //linea que se encarga de evitar del cierre de la app sin confirmacion
				    evento.consume();
				}
				
			});
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}

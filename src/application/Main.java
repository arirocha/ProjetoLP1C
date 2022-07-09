package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {

	private static Scene sceneScene1, sceneScene2, sceneScene3, sceneScene4; // static para ser inserida na classe sem exigir objeto
	private static Stage primaryStage; // static para ser inserida na classe sem exigir objeto

	public static Repositorio repositorio;
	
	@Override
	public void start(Stage stage) throws Exception {
		try {
			FXMLLoader Scene1 = new FXMLLoader(getClass().getResource("Scene1.fxml"));
			FXMLLoader Scene2 = new FXMLLoader(getClass().getResource("Scene2.fxml"));
			FXMLLoader Scene3 = new FXMLLoader(getClass().getResource("Scene3.fxml"));
			FXMLLoader Scene4 = new FXMLLoader(getClass().getResource("Scene4.fxml"));
			
			primaryStage = stage;
			stage.setTitle("Brasil Tour Agências");
			
			Parent parentScene1 = Scene1.load();
			Parent parentScene2 = Scene2.load();
			Parent parentScene3 = Scene3.load();
			Parent parentScene4 = Scene4.load();
			
			sceneScene1 = new Scene(parentScene1);
			sceneScene2 = new Scene(parentScene2);
			sceneScene3 = new Scene(parentScene3);
			sceneScene4 = new Scene(parentScene4);

			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			primaryStage.setScene(sceneScene1);
			primaryStage.show();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		repositorio = new Repositorio();
		launch(args);
	}
	
	public static void switchMudaTelas(int opcao){
		switch(opcao) {
		case 1:
			primaryStage.setScene(sceneScene1);
			break;
		case 2:
			primaryStage.setScene(sceneScene2);
			break;
		case 3:
			primaryStage.setScene(sceneScene3);
			break;
		case 4:
			primaryStage.setScene(sceneScene4);
			break;
		
		}
	}
}
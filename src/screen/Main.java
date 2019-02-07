package screen;

import java.io.IOException;

import javax.annotation.Resource;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Hello");
		showScreen(primaryStage, "Screen1.fxml");
	}
	
	public void showScreen(Stage stage, String rs) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource(rs));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void showScreen2() throws IOException {
		Stage stage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("Screen2.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		stage.initModality(Modality.WINDOW_MODAL);
		stage.initOwner(primaryStage);
		stage.setScene(scene);
		stage.showAndWait();
	}
	
	public static void showScreen3() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("Screen3.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setTitle("Screen 3");
		stage.initModality(Modality.WINDOW_MODAL);
		stage.initOwner(primaryStage);
		stage.showAndWait();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

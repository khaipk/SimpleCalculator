package menu;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
	private Stage primaryStage;
	private static BorderPane mainRoot;

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Menu");
		showMainView();
		showMainMenu();
	}

	public void showMainView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("Main.fxml"));
		mainRoot = loader.load();
		Scene scene = new Scene(mainRoot);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void showMainMenu() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("Menu.fxml"));
		Pane root = loader.load();
		mainRoot.setCenter(root);
	}
	
	public void showMenuOne() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("One.fxml"));
		Pane root = loader.load();
		mainRoot.setCenter(root);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

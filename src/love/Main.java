package love;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	Stage window;
	Scene scene1, scene2;

	@Override
	public void start(Stage primaryStage) throws IOException {
		window = primaryStage;
		Parent root = FXMLLoader.load(getClass().getResource("/love/View.fxml"));
		
		scene1 = new Scene(root, 400, 400);
		window.setScene(scene1);
		window.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void start1() throws IOException {
		window = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/user/View.fxml"));
		 scene2 = new Scene(root);
		window.setScene(scene2);
		window.show();
	}
}

package normal1;

import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	ShowScreen show = new ShowScreen();
	private Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Hello");
		show.showScreen(primaryStage, "View.fxml");
	}

	public static void main(String[] args) {
		launch(args);
	}
}

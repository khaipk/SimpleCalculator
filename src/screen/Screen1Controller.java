package screen;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Screen1Controller implements Initializable{
	@FXML
	private Button button2;
	@FXML
	private Button button3;
	
	Main main;
	@FXML
	private void goScreen2(ActionEvent event) throws IOException {
		main.showScreen(new Stage(), "Screen2.fxml");
	}
	@FXML
	private void goScreen3(ActionEvent event) throws IOException {
		main.showScreen3();
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
}

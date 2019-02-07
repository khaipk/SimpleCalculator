package screen;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Screen2Controller implements Initializable{
	@FXML
	private Button button1;
	@FXML
	private Button button2;
	
	Main main;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	//@FXML
	/*private void goScreen1(ActionEvent event) throws IOException {
		main.showScreen1();
	}*/
	@FXML
	private void goScreen3(ActionEvent event) throws IOException {
		main.showScreen(new Stage()	, "Screen3.fxml");
	}
	
}

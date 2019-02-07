package menu;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {
	Main main;
	
	@FXML
	private Button homeBtn;
	
	@FXML
	private void goHome() throws IOException {
		main.showMainMenu();
	}
}

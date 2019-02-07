package menu;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MenuController {
	Main main;
	
	@FXML
	private Button homeButton;
	@FXML
	private Button but1;
	
	@FXML
	private void goHome() throws IOException {
		main.showMenuOne();
	}
}

package login;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
	
	Main main = new Main();
	@FXML
	private TextField username;
	@FXML
	private PasswordField password;
	@FXML
	private Label txtStatus;
	
	@FXML
	private void login() throws IOException {
		if(username.getText().equals("phamkhai") && password.getText().equals("hagiang")) {
			txtStatus.setText("Login Successful! ");
			main.user();
		} else {
			txtStatus.setText("Login Failed! ");
		}
	}
	
}

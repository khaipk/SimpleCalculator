package login;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

public class UserController {
	@FXML
	TableColumn colum1;
	@FXML
	TableColumn colum2;
	
	ObservableList<String> listColum1 = FXCollections.observableArrayList("1","2","3");
	
	@FXML
	private void initialize() {
		
	}
	
}

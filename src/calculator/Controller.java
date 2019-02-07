package calculator;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	@FXML
	private TextField resultText;
	@FXML
	private Button button1;
	@FXML
	private Button button2;
	@FXML
	private Button button3;
	@FXML
	private Button button4;
	@FXML
	private Button button5;
	@FXML
	private Button button6;
	@FXML
	private Button button7;
	@FXML
	private Button button8;
	@FXML
	private Button button9;
	@FXML
	private Button button0;
	@FXML
	private Button buttonAdd;
	@FXML
	private Button buttonSub;
	@FXML
	private Button buttonX;
	@FXML
	private Button buttonD;
	@FXML
	private Button buttonRS;
	@FXML
	private RadioButton buttonOn;
	@FXML
	private RadioButton buttonOff;
	
	private String view ="";
	
	@FXML
	private void number(ActionEvent event) {
		view += "0";
		resultText.setText(view);
	}
	@FXML
	private void number1(ActionEvent event) {
		view += "1";
		resultText.setText(view);
	}
	@FXML
	private void number2(ActionEvent event) {
		view += "2";
		resultText.setText(view);
	}
	@FXML
	private void number3(ActionEvent event) {
		view += "3";
		resultText.setText(view);
	}
	@FXML
	private void number4(ActionEvent event) {
		view += "4";
		resultText.setText(view);
	}
	@FXML
	private void number5(ActionEvent event) {
		view += "5";
		resultText.setText(view);
	}
	@FXML
	private void number6(ActionEvent event) {
		view += "6";
		resultText.setText(view);
	}
	@FXML
	private void number7(ActionEvent event) {
		view += "7";
		resultText.setText(view);
	}
	@FXML
	private void number8(ActionEvent event) {
		view += "8";
		resultText.setText(view);
	}
	@FXML
	private void number9(ActionEvent event) {
		view += "9";
		resultText.setText(view);
	}
	@FXML
	private void methodAdd(ActionEvent event) {
		view += "+";
		resultText.setText(view);
	}
	@FXML
	private void methodSub(ActionEvent event) {
		view += "-";
		resultText.setText(view);
	}
	@FXML
	private void methodX(ActionEvent event) {
		view += "*";
		resultText.setText(view);
	}
	@FXML
	private void methodD(ActionEvent event) {
		view += "/";
		resultText.setText(view);
	}
	@FXML
	private void dot(ActionEvent event) {
		view += ".";
		resultText.setText(view);
	}
	@FXML
	private void action(ActionEvent event) {
		view += "=";
		resultText.setText(view);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
}

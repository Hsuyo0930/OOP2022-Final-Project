package application;

import java.awt.Checkbox;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CheckMemberInformationController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	Checkbox checkbox;
	@FXML
	Label LabelAccount;
	@FXML
	Label LabelPassword;
	@FXML
	Label LabelName;
	@FXML
	Label LabelPhoneNumber;
	
	public void displayInformation() {
		LabelAccount.setText("");
		LabelPassword.setText("");
		LabelName.setText("");
		LabelPhoneNumber.setText("");
	}
	
	public void toDeliver(ActionEvent event) {
		
	}
	
	public void logout(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("SceneLogin.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void toPreviousPage(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("SceneDeliveryMan.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
}

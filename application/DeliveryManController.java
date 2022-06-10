package application;

import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DeliveryManController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void checkMemberInformation(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("SceneCheckMemberInformation.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void checkOrders(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("SceneCheckOrders.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void checkCurrentOrder(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("SceneCheckCurrentOrder.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void checkHistoryOrder(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("SceneCheckHistoryOrder.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void logout(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("SceneLogin.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void toPreviousPage(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("SceneSelectIdentity.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
}

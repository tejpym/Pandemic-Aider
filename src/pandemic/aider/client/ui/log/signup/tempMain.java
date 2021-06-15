package pandemic.aider.client.ui.log.signup;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class tempMain extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("PostRequestFXML.fxml")));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}

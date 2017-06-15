package gui_test;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	public Controller ctr = new Controller(this);
	public Unit unit = new Unit(this);

	public void start(Stage stage) throws Exception {
		try {
			Scene scene = new Scene(FXMLLoader.load(getClass().getResource("gui_test_2017-06.fxml")));
			stage.setScene(scene);
			stage.show();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
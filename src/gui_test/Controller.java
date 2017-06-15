package gui_test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller{
	Main main;
	@FXML Label label_1;
	@FXML Label label_2;
	@FXML Button btn_1;
	@FXML Button btn_2;
	@FXML TextField field_1;
	@FXML TextField field_2;

	public Controller() {
	}

	public Controller(Main main) {
		this.main = main;
	}

	@FXML
	protected void doActionButton_1(ActionEvent e) {
		//10to16
		String field_1s = field_1.getText();
		if (field_1s.length() < 9) {
			System.out.print("The number is too short. Please entrer 9 numbers.");
			return;
		}
		int[] field_1_number = main.unit.parseIntFromString(main.unit.splitString(field_1s, 0));
		String[] number_16 = main.unit.toHexStringFromNumber(field_1_number);
		//If 2桁x3
		String[] result_10to16 = main.unit.toTwoHexString(number_16);
		label_1.setText("Result: "+result_10to16[0]+result_10to16[1]+result_10to16[2]);
		label_1.setText("TEST");
	}

	@FXML
	protected void doActionButton_2(ActionEvent e) {
		//16to10
		String field_2s = field_2.getText();
		if (field_2s.length() < 6) {
			System.out.print("The number is too short. Please entrer 6 HexString.");
			return;
		}
		String[] field_2_number = main.unit.splitString(field_2s, 1);
		String[] result_16to10 = main.unit.toDecimalStringFromString(field_2_number);
		label_2.setText("Result: "+result_16to10[0]+result_16to10[1]+result_16to10[2]);
	}
}

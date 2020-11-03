package cz.toce.learn.openjfx.app.fxml.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloController {
	private static final Logger log = LoggerFactory.getLogger(HelloController.class);

	@FXML
	private Text actiontarget;

	@FXML
	protected void handleSubmitButtonAction(ActionEvent event) {
		actiontarget.setText("Sign in button pressed");
	}
}

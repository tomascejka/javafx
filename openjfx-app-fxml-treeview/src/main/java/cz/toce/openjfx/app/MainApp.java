package cz.toce.openjfx.app;

import javafx.animation.KeyFrame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cz.toce.openjfx.app.controller.TreeViewController;
import javafx.animation.*;
import javafx.application.Application;
import javafx.event.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.*;
import javafx.util.Duration;

/**
 * 
 * @author tomas.cejka
 * 
 * @see http://tutorials.jenkov.com/javafx/treeview.html
 *
 */
public class MainApp extends Application {

	private static final Logger LOG = LoggerFactory.getLogger(MainApp.class);

	public static void main(String[] args) throws Exception {
		launch(args);
	}

	public void start(Stage stage) throws Exception {
		LOG.info("Starting JavaFX and Maven demonstratsion application");

		String fxmlFile = "/fxml/treeview.fxml";
		LOG.debug("Loading FXML for main view from: {}", fxmlFile);
		FXMLLoader loader = new FXMLLoader();
		Parent rootNode = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));
		final TreeViewController controller = loader.<TreeViewController>getController();

		LOG.debug("Showing JFX scene");
		// continuously refresh the TreeItems.
		// demonstrates using controller methods to manipulate the controlled UI.
		final Timeline timeline = new Timeline(
				new KeyFrame(Duration.seconds(3), new TreeLoadingEventHandler(controller)));
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();

		// close the app if the user clicks on anywhere on the window.
		// just provides a simple way to kill the demo app.
		rootNode.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent t) {
				//stage.hide();
				stage.setOpacity(0.89);
			}
		});

		// initialize the stage.
		Scene scene = new Scene(rootNode);
		//stage.initStyle(StageStyle.TRANSPARENT);
		scene.getStylesheets().add("/styles/styles.css");

		stage.setTitle("JavaFX - TreeView/FXML control");
		stage.getIcons().add(new Image("https://cdn3.iconfinder.com/data/icons/inficons/512/stackoverflow.png"));
		stage.setScene(scene);
		stage.show();
	}

	/** small helper class for handling tree loading events. */
	private class TreeLoadingEventHandler implements EventHandler<ActionEvent> {
		private TreeViewController controller;
		private int idx = 0;

		TreeLoadingEventHandler(TreeViewController controller) {
			this.controller = controller;
		}

		@Override
		public void handle(ActionEvent t) {
			controller.loadTreeItems("Loaded " + idx, "Loaded " + (idx + 1), "Loaded " + (idx + 2));
			idx += 3;
		}
	}
}

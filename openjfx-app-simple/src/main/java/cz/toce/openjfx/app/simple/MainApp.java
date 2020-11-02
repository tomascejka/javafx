package cz.toce.openjfx.app.simple;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApp extends Application {

    private static final Logger log = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public void start(Stage stage) throws Exception {

        log.info("Starting Hello JavaFX and Maven demonstration application");

        log.debug("Showing JFX scene");
        Label rootNode = new Label("Hello world!");
        rootNode.setAlignment(Pos.CENTER);
		Scene scene = new Scene(rootNode , 400, 200);
        scene.getStylesheets().add("/styles/styles.css");

        stage.setTitle("Hello JavaFX and Maven");
        stage.getIcons().add(new Image("https://cdn3.iconfinder.com/data/icons/inficons/512/stackoverflow.png"));
        stage.setScene(scene);
        stage.show();
    }
}

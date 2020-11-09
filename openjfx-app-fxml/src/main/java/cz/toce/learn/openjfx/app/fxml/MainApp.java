package cz.toce.learn.openjfx.app.fxml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainApp extends Application {

    private static final Logger LOG = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        LOG.info("Starting Hello JavaFX and Maven demonstration application");

        String fxmlFile = "/fxml/hello.fxml";
        LOG.debug("Loading FXML for main view from: {}", fxmlFile);
        FXMLLoader loader = new FXMLLoader();
        Parent rootNode = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));

        LOG.debug("Showing JFX scene");
		Scene scene = new Scene(rootNode , 400, 200);
        scene.getStylesheets().add("/styles/styles.css");

        stage.setTitle("JavaFX - simple using FXML");
        stage.getIcons().add(new Image("https://cdn3.iconfinder.com/data/icons/inficons/512/stackoverflow.png"));
        stage.setScene(scene);
        stage.show();
    }
}

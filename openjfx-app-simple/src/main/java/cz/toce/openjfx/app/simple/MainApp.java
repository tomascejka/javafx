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

    private static final Logger LOG = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    /**
     * The main entry point for all JavaFX applications.
     * The start method is called after the init method has returned,
     * and after the system is ready for the application to begin running.
     * 
     * @see {@link Application#start(Stage)}
     */
    public void start(Stage stage) throws Exception {
        LOG.info("Starting JavaFX and Maven demonstratsion application");
        LOG.debug("Showing JFX scene");
        Label rootNode = new Label("Hello world!");
        rootNode.setAlignment(Pos.CENTER);
        
		Scene scene = new Scene(rootNode , 400, 200);
        scene.getStylesheets().add("/styles/styles.css");

        stage.setTitle("JavaFX - Simple app using maven");
        stage.getIcons().add(new Image("https://cdn3.iconfinder.com/data/icons/inficons/512/stackoverflow.png"));
        stage.setScene(scene);
        stage.show();
    }
}

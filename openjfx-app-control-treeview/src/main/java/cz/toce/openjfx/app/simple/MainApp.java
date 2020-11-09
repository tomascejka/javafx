package cz.toce.openjfx.app.simple;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;

/**
 * 
 * @author tomas.cejka
 * 
 * @see http://tutorials.jenkov.com/javafx/treeview.html
 *
 */
public class MainApp extends Application {

    //private static final Logger LOG = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        TreeItem<String> rootItem = new TreeItem<String>("Tutorials");

        TreeItem<String> webItem = new TreeItem<>("Web Tutorials");
        webItem.getChildren().add(new TreeItem<>("HTML  Tutorial"));
        webItem.getChildren().add(new TreeItem<>("HTML5 Tutorial"));
        webItem.getChildren().add(new TreeItem<>("CSS Tutorial"));
        webItem.getChildren().add(new TreeItem<>("SVG Tutorial"));
        rootItem.getChildren().add(webItem);

        TreeItem<String> javaItem = new TreeItem<>("Java Tutorials");
        javaItem.getChildren().add(new TreeItem<>("Java Language"));
        javaItem.getChildren().add(new TreeItem<>("Java Collections"));
        javaItem.getChildren().add(new TreeItem<>("Java Concurrency"));
        rootItem.getChildren().add(javaItem);

        TreeView<String> treeView = new TreeView<>();
        treeView.setRoot(rootItem);
        treeView.setShowRoot(false);

        Scene scene = new Scene(new VBox(treeView));
        scene.getStylesheets().add("/styles/styles.css");

        stage.setTitle("JavaFX - TreeView control");
        stage.getIcons().add(new Image("https://cdn3.iconfinder.com/data/icons/inficons/512/stackoverflow.png"));
        stage.setScene(scene);
        stage.show();
    }
}

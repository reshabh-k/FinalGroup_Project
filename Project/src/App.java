
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Project FXML.fxml"));
        Scene scene=new Scene(root);
        scene.getStylesheets().add(getClass().getResource("layout.css").toExternalForm());
        stage.setTitle("Fitness Buffs");
        stage.setScene(scene);
        stage.show();

    }
}

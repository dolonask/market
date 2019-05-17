package market;

import com.aquafx_project.AquaFx;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);


    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        AquaFx.style();


        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("layout/login.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}

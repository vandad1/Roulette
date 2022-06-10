import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Main {

    public static Stage stage;
    public static Scene loginScene;
    public static Scene scheduleScene;
    //public static LoginController loginController;

    public static void main(String[] args) {
        launch();
    }


    public void start(Stage stage) throws Exception {

        Main.stage = stage;

        FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("../FXML/Startskærm.fxml"));
        Parent loginView = loginLoader.load();
        //loginController = loginLoader.getController();

        //FXMLLoader scheduleLoader = new FXMLLoader(getClass().getResource("../FXML/SchedulePage.fxml"));
        //Parent scheduleView = scheduleLoader.load();
        //scheduleController = scheduleLoader.getController();

        //loginScene = new Scene(loginView, 600, 450);
        //scheduleScene = new Scene(scheduleView, 600, 450);

        //loginScene.getStylesheets().add("resources/invisible-tab-pane.css");
        //scheduleScene.getStylesheets().add("resources/invisible-tab-pane.css");

        stage.show();
    }



}

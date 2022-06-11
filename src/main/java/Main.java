import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main extends Application {

    public static Stage stage;
    public static Scene startScreenScene;
    public static Scene gameScene;
    public static StartScreenController startScreenController;
    public static GameController gameController;

    public static void main(String[] args) {
        launch();
    }


    @Override
    public void start(Stage stage) throws Exception {

        //System.out.println(getClass().getResource("Game.fxml"));
        //System.out.println(getClass().getResource("StartScreen.fxml"));

        Main.stage = stage;

        FXMLLoader startScreenLoader = new FXMLLoader(getClass().getResource("StartScreen.fxml"));
        Parent startScreenView = startScreenLoader.load();
        startScreenController = startScreenLoader.getController();

        FXMLLoader gameLoader = new FXMLLoader(getClass().getResource("Game.fxml"));
        Parent gameView = gameLoader.load();
        gameController = gameLoader.getController();

        startScreenScene = new Scene(startScreenView, 530, 900);
        gameScene = new Scene(gameView, 900, 516);

        startScreenScene.getStylesheets().add("invisible-tab-pane.css");
        gameScene.getStylesheets().add("invisible-tab-pane.css");

        stage.setTitle("Roulette");
        stage.setScene(startScreenScene);
        stage.setMinHeight(567);
        stage.setMinWidth(900);
        stage.show();
    }



}

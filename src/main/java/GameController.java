import javafx.event.ActionEvent;

public class GameController {

    public void QuitTableEvent(ActionEvent actionEvent){
        Main.stage.setScene(Main.startScreenScene);
    }
}

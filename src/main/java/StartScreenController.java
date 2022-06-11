import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;

public class StartScreenController {

    @FXML
    private TabPane TabPaneStartScreen;

    public void OpenRulesEvent(ActionEvent actionEvent){
        TabPaneStartScreen.getSelectionModel().select(1);
    }

    public void CloseRulesEvent(ActionEvent actionEvent){
        TabPaneStartScreen.getSelectionModel().select(0);
    }

    public void JoinTableEvent( ActionEvent actionEvent){
        Main.stage.setScene(Main.gameScene);
    }
}

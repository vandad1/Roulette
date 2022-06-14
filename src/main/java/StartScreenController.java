import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;

public class StartScreenController {

    @FXML
    private TabPane TabPaneStartScreen;

    @FXML
    private CheckBox CheckBoxAgeAgreement;

    @FXML
    private Button ButtonJoinTable;

    @FXML
    private TextField TextFieldName;

    public void OpenRulesEvent(ActionEvent actionEvent){
        TabPaneStartScreen.getSelectionModel().select(1);
    }

    public void CloseRulesEvent(ActionEvent actionEvent){
        TabPaneStartScreen.getSelectionModel().select(0);
    }

    public void JoinTableEvent( ActionEvent actionEvent){
        if (CheckBoxAgeAgreement.isSelected()){

            Main.stage.setScene(Main.gameScene);
            return;
        }

        Dialog dialog = new Dialog<>();

        dialog.setContentText("you have to be 18 years old to be abel to play");

        ButtonType type = new ButtonType("ok", ButtonBar.ButtonData.OK_DONE);

        dialog.getDialogPane().getButtonTypes().add(type);
        dialog.show();
    }
}

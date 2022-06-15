import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;



class GameController{

    @FXML
    private static Label LabelName;

    private final int wheel[] = {0, 32, 15, 19, 4, 21, 2, 25, 17, 34, 6, 27, 13, 36, 11, 30, 8, 8, 23, 10, 5, 24, 16, 33, 1, 20, 14, 31, 9, 22, 18, 29, 7, 28, 12, 35, 3, 26};

    private final int board[][] =
                          {{3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36},
                           {2, 5, 8, 11, 14, 17, 20, 23, 26, 29, 32, 35},
                           {1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34}};
    private static int wheelNumber;

    private static int betAmount;

    private static int balance;

    private static int betNumber;

    private static int wheelNumberId;

    public static int getWheelNumberId() {
        return wheelNumberId;
    }

    public static void setWheelNumberId(int wheelNumberId) {
        GameController.wheelNumberId = wheelNumberId;
    }

    public void QuitTableEvent(ActionEvent actionEvent){
        Main.stage.setScene(Main.startScreenScene);
    }
 void winnings(int betStyle){
        switch (betStyle){
            case 0:
                if (getBetNumber() == getWheelNumber()){
                  setBalance(getBetAmount() * 36 + getBalance());
                }
                break;
            case 1:
                if ((getWheelNumber() % 3) == 0 && getWheelNumber() != 0){
                    setBalance((getBetAmount() * 3) + getBalance());
                }
                break;
            case 2:
                if ((getWheelNumber() % 3) == 1){
                    setBalance((getBetAmount() * 3) + getBalance());
                }
                break;
            case 3:
                if ((getWheelNumber() % 3) == 2){
                    setBalance((getBetAmount() * 3) + getBalance());
                }
                break;
            case 4:
                if (getWheelNumber() <= 18 ) {
                    setBalance((getBetAmount() * 2) + getBalance());
                }
                break;
            case 5:
                if (getWheelNumber() >= 19){
                setBalance((getBetAmount() * 2) + getBalance());
                }
                break;
            case 6:
                if ((getWheelNumber()) <= 12){
                    setBalance((getBetAmount() * 3) + getBalance());
                }
                break;
            case 7:
                if (getWheelNumber() >= 13 && getWheelNumber() <= 24){
                setBalance((getBetAmount() * 3) + getBalance());
                }
                break;
            case 8:
                if (getWheelNumber() >= 25){
                setBalance((getBetAmount() * 3) + getBalance());
                }
                break;
            case 9:
                if ((getWheelNumberId() % 2) == 0 && getWheelNumberId() != 0){
                    setBalance((getBetAmount() * 2) + getBalance());
                }
                break;
            case 10:
                if ((getWheelNumberId() % 2) == 1){
                    setBalance((getBetAmount() * 2) + getBalance());
                }
                break;
            case 11:
                if ((getWheelNumber() % 2) == 0 && getWheelNumberId() != 0){
                    setBalance((getBetAmount() * 2) + getBalance());
                }
            case 12:
                if ((getWheelNumber() % 2) == 1){
                    setBalance((getBetAmount() * 2) + getBalance());
                }
        }
    }

    public static int getWheelNumber() {
        return wheelNumber;
    }

    public static void setWheelNumber(int wheelNumber) {
        GameController.wheelNumber = wheelNumber;
    }

    public static int getBetAmount() {
        return betAmount;
    }

    public static int getBalance() {
        return balance;
    }

    public static void setBalance(int balance) {
        GameController.balance = balance;
    }

    public static int getBetNumber() {
        return betNumber;
    }

    public void setBetAmount(int amount){
        betAmount = betAmount;
    }
    public void setBetNumber(int number){
        betNumber = number;
    }
}

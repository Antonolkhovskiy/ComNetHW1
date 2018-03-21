import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Anton on 21.03.2018.
 */
public class StartingStage extends Application {

    private Button createButton;
    private Button joinButton;
    private TextField nickNameTextField;
    private Label typeNickNameLabel;
    private VBox vBox;
    private Scene startingScene;

    public static void main(String[] args){
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        createButton = new Button("Create Game");
        joinButton = new Button("Join Game");
        nickNameTextField = new TextField();
        typeNickNameLabel = new Label("Type NickName");
        vBox = new VBox(25);

        nickNameTextField.setMaxWidth(80);

        vBox.getChildren().addAll(typeNickNameLabel, nickNameTextField, joinButton, createButton);
        vBox.setAlignment(Pos.CENTER);

        vBox.setPrefSize(400, 250);

        startingScene = new Scene(vBox);

        primaryStage.setScene(startingScene);
        primaryStage.setTitle("Welcome to One-Dimentional Battleship Game");
        primaryStage.show();

    }
}

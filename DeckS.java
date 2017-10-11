import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class DeckS {

    public static Pane deckS() {

        Pane root = new Pane();

        //making a new Hbox for top menu buttons
        HBox topBar = new HBox(10);
        topBar.setPadding(new Insets(15));
        //array of the buttons to go in the Hbox
        Button[] myButtons = new Button[4];

        myButtons[0] = new Button("No deck selected\n(X cards in current deck)");
        myButtons[0].setPrefSize(180, 60);
        myButtons[0].setOnAction((ActionEvent ae) -> placeholder());

        myButtons[1] = new Button("Add to favorites");
        myButtons[1].setPrefSize(180, 60);
        myButtons[1].setOnAction((ActionEvent ae) -> placeholder());

        myButtons[2] = new Button("Edit");
        myButtons[2].setPrefSize(180, 60);
        myButtons[2].setOnAction((ActionEvent ae) -> placeholder());

        myButtons[3] = new Button("Bin");
        myButtons[3].setPrefSize(180, 60);
        myButtons[3].setOnAction((ActionEvent ae) -> placeholder());

        topBar.getChildren().addAll(myButtons);
        root.getChildren().add(topBar);

        //gridpane for the decks
        GridPane body = new GridPane();
        body.setHgap(10);
        body.setVgap(10);
        body.setPadding(new Insets(20));
        //filling gridpane with buttons
        Button[][] bodyButtons = new Button[4][6];
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 5; y++) {
                bodyButtons[x][y] = new Button(Integer.toString(x) + ", " + Integer.toString(y));
                bodyButtons[x][y].setPrefSize(240, 120);
                bodyButtons[x][y].setOnAction((ActionEvent ae) -> placeholder());
                body.add(bodyButtons[x][y], x, y);
            }
        }
        bodyButtons[0][0].setText("New deck.");
        bodyButtons[0][0].setOnAction((ActionEvent ae) -> deckC());
        root.getChildren().add(body);
        body.setLayoutY(100);

        //Making bottom "page turn" buttons.
        HBox bottomBar = new HBox(10);
        bottomBar.setPadding(new Insets(32));
        //array of the buttons to go in the Hbox
        Button[] bottomButtons = new Button[2];

        bottomButtons[0] = new Button("<---");
        bottomButtons[0].setPrefSize(350, 60);
        bottomButtons[0].setOnAction((ActionEvent ae) -> placeholder());

        bottomButtons[1] = new Button("--->");
        bottomButtons[1].setPrefSize(350, 60);
        bottomButtons[1].setOnAction((ActionEvent ae) -> placeholder());

        bottomBar.getChildren().addAll(bottomButtons);
        root.getChildren().add(bottomBar);
        bottomBar.setLayoutY(800);

        return root;

    }

    private static void deckC(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("This feature has not been implemented yet.");

        alert.showAndWait();
    }


    private static void placeholder(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("This feature has not been implemented yet.");

        alert.showAndWait();
    }
} //plspush
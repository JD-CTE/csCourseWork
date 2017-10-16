import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.*;

public class deckC extends Main{
    public static Pane launchDeckC() {

        Pane root = new Pane();
        //Showing deck title at op of window
        Text title = new Text(10, 50, "Deck title or name.");
        title.setFont(new Font(20));
        title.setLayoutX(30);
        root.getChildren().add(title);
        //making a new Hbox for top menu buttons
        HBox topBar = new HBox(10);
        topBar.setPadding(new Insets(15));
        //array of the buttons to go in the Hbox
        Button[] myButtons = new Button[3];

        myButtons[0] = new Button("X cards in current deck");
        myButtons[0].setPrefSize(180, 60);
        myButtons[0].setOnAction((ActionEvent ae) -> Main.placeholder());

        myButtons[1] = new Button("Add to favorites");
        myButtons[1].setPrefSize(180, 60);
        myButtons[1].setOnAction((ActionEvent ae) -> Main.placeholder());

        myButtons[2] = new Button("Bin");
        myButtons[2].setPrefSize(160, 60);
        myButtons[2].setOnAction((ActionEvent ae) -> Main.placeholder());

        topBar.getChildren().addAll(myButtons);
        root.getChildren().add(topBar);
        topBar.setLayoutY(60);
        topBar.setLayoutX(25);

        //gridpane for the cards
        GridPane body = new GridPane();
        body.setHgap(10);
        body.setVgap(10);
        body.setPadding(new Insets(20));
        //filling gridpane with buttons
        Button[][] bodyButtons = new Button[5][6];
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                bodyButtons[x][y] = new Button("Card"+Integer.toString(x) + ", " + Integer.toString(y));
                bodyButtons[x][y].setPrefSize(100, 120);
                bodyButtons[x][y].setOnAction((ActionEvent ae) -> Main.placeholder());
                body.add(bodyButtons[x][y], x, y);
            }
        }
        bodyButtons[0][0].setText("New card.");
        //bodyButtons[0][0].setOnAction((ActionEvent ae) -> deckC());
        root.getChildren().add(body);
        body.setLayoutY(150);
        body.setLayoutX(20);

        //Making bottom "page turn" buttons.
        HBox bottomBar = new HBox(10);
        bottomBar.setPadding(new Insets(32));
        //array of the buttons to go in the Hbox
        Button[] bottomButtons = new Button[2];

        bottomButtons[0] = new Button("<---");
        bottomButtons[0].setPrefSize(350, 60);
        bottomButtons[0].setOnAction((ActionEvent ae) -> Main.placeholder());

        bottomButtons[1] = new Button("--->");
        bottomButtons[1].setPrefSize(350, 60);
        bottomButtons[1].setOnAction((ActionEvent ae) -> Main.placeholder());

        bottomBar.getChildren().addAll(bottomButtons);
        root.getChildren().add(bottomBar);
        bottomBar.setLayoutY(800);

        return root;

    }
}
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CardC {
    private static Stage mainstage;
    public static Pane launchCardC(Stage stage){
        mainstage = stage;
        Pane root = new Pane();
        //making a toolbar for text formatting tools
        ToolBar textFormatting = new ToolBar();
        Button bold = new Button("Bold");
        Button italic = new Button("Italic");
        Button underline = new Button("Underline");
        ObservableList<String> options = FXCollections.observableArrayList(
                "10","11","12","14","16","18","20","22","24","26","30","36","42","48","56","64","72"
        );
        ComboBox fontSize = new ComboBox(options);
        options = FXCollections.observableArrayList(
                "Arial","Courier","Courier New","Helvetica","Times","Times New Roman"
        );
        ComboBox font = new ComboBox(options);
        textFormatting.getItems().add(font);
        textFormatting.getItems().add(fontSize);
        textFormatting.getItems().addAll(bold, italic, underline);
        textFormatting.setPrefWidth(768);
        root.getChildren().add(textFormatting);
        return root;

        /* So, I have 2 options depending on how the stackoverflow question goes: Jam all the relevant stuff from
         * the HTMLEditor scene constructor in here, or pass the HTMLEditor in and use that as my root pane - see
          * example 19.4 in the help I linked on stackoverflow.*/
    }
}

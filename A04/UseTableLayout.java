package a04;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * A program to test the TableLayout class.
 *
 * @author Mark Young (A00000000)
 */
public class UseTableLayout extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane root = makePane();

        Scene scene = new Scene(root);

        primaryStage.setTitle("TableLayout Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Create and lay out the scene contents.
     *
     * @return a Pane containing the contents to go in the Scene.
     */
    private Pane makePane() {
        // create the root layout
        TableLayout root = new TableLayout(4, 3);
        root.setHgap(10);
        root.setVgap(5);
        root.setPadding(new Insets(15, 25, 15, 25));
        
        // create a nested layout
        TableLayout internal = new TableLayout(1, 5);
        internal.setHgap(5);
        internal.setVgap(2);
        internal.setPadding(new Insets(5, 5, 5, 5));
        
        // create an invalid layout
        TableLayout notUsed = new TableLayout(-2, -7);
        
        // add items to the layouts
        root.add(makeLabel("Alpha" + notUsed.NUM_ROWS));
        root.add(makeButton("Bravo" + root.NUM_ROWS), 2);
        root.add(makeLabel("Charlie" + notUsed.NUM_COLUMNS));
        internal.add(makeLabel("Delta" + internal.NUM_ROWS));
        internal.add(makeLabel("Echo"));
        internal.add(makeLabel("Foxtrot"));
        internal.add(makeLabel("Golf"));
        internal.add(makeLabel("Hotel" + internal.NUM_COLUMNS));
        internal.add(makeLabel("Zulu"));
        root.add(internal, 2);
        root.add(makeTextField("India"), 2);
        root.add(makeLabel("Juliet"));
        root.add(makeLabel("Kangeroo" + root.NUM_COLUMNS));
        root.add(makeTextField("Lima"));
        root.add(makeLabel("Mike"));
        root.add(makeLabel("Zulu"));

        // return the root layout
        return root;
    }

    // The size of the font to use in this Application
    private static final int FONT_SIZE = 18;

    /**
     * Create a label in the appropriate font size
     *
     * @param text the text of the new label
     * @return a Label with the default font size
     */
    private Label makeLabel(String text) {
        Label result = new Label(text);
        result.setFont(new Font(FONT_SIZE));
        return result;
    }

    /**
     * Create a right-justified text field in the appropriate font size
     *
     * @param text the text of the new text field
     * @return a right-aligned TextField with the default font size
     */
    private TextField makeTextField(String text) {
        TextField result = new TextField(text);
        result.setFont(new Font(FONT_SIZE));
        result.setAlignment(Pos.CENTER_RIGHT);
        return result;
    }

    /**
     * Create a button with the appropriate font size
     *
     * @param text the text on the new button
     * @return a Button with the default font size
     */
    private Button makeButton(String text) {
        Button result = new Button(text);
        result.setFont(new Font(FONT_SIZE));
        return result;
    }

}
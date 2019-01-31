package l03;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * A GUI that says Hello World.
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class L03Application extends Application {

    /**
     * The method where we build and activate the GUI.
     *
     * @param primaryStage The main window for this application.
     */
    @Override
    public void start(Stage primaryStage) {

        Button btn = makeButton("Say 'Hello World'");
        btn.setOnAction((ActionEvent event) -> {
            System.out.println("Hey");
        });

        Pane root = new Pane();
        root.getChildren().add(btn);

        //Create the scene.
        Scene scene = new Scene(root);

        //Set and show the stage.
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    // The size of the font to use in this application.
    private static final int FONT_SIZE = 48;

    /**
     * Creates a button with the appropriate font size.
     *
     * @param text the text on the new button.
     * @return the button.
     */
    private Button makeButton(String text) {
        Button result = new Button(text);
        result.setFont(new Font(FONT_SIZE));
        return result;
    }

}

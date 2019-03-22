package a08;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * A JavaFX Application to draw a many rings.
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class ManyRingsApplication extends Application {

    /**
     * Fill in the Application window.
     *
     * @param applicationStage the application window
     */
    @Override
    public void start(Stage applicationStage) {
        Pane pane = makePane();
        Scene scene = new Scene(pane);          // A scene containing the pane
        applicationStage.setTitle("ManyRings");      // Set window's title
        applicationStage.setScene(scene);       // Set window's scene
        applicationStage.show();                // Display window
    }

    /**
     * Create a Pane containing the required circles.
     *
     * @return a Pane containing a canvas painted with the circles.
     */
    private Pane makePane() {
        Pane pane = new Pane();                 // An empty pane    
        Canvas canvas = makeCircle();

        // put it all together, give it a title, and show it
        pane.getChildren().add(canvas);             // Add canvas to pane 
        return pane;

    }

    /**
     * Width of the window.
     */
    private static final int WIDTH = 1220;

    /**
     * Height of the window.
     */
    private static final int HEIGHT = 600;

    /**
     * Diameter of the circle.
     */
    private static final double DIAMETER = HEIGHT;

    /**
     * Make a painting of the Circles.
     *
     * @return a Canvas with the circles painted on it.
     */
    private Canvas makeCircle() {

        // A canvas to draw on
        Canvas result = new Canvas(WIDTH, HEIGHT);
        double leftEdge, topEdge;
        GraphicsContext draw = result.getGraphicsContext2D();

        //Calculate the edges.
        leftEdge = (WIDTH / 2);
        topEdge = 0;

        //Set stroke color to black and draw the circles.
        draw.setStroke(Color.BLACK);
        drawCircle(draw, leftEdge, topEdge, DIAMETER);
        return result;
    }

    /**
     * A recursive method which draws circles with a diameter of 10 or greater
     * than 10.
     *
     * @param drawTool A drawing tool.
     * @param leftEdge Left edge of the window.
     * @param topEdge Top edge of the window.
     * @param diameter Diameter of the circles.
     */
    private void drawCircle(GraphicsContext drawTool, double leftEdge,
            double topEdge, double diameter) {

        //Draw the first circle.
        drawTool.strokeOval(leftEdge - diameter / 2, topEdge,
                diameter, diameter);

        //Draw upto 10 or more diameter of circles.
        if (diameter >= 10) {
            drawCircle(drawTool, leftEdge + (diameter / 2),
                    topEdge + (diameter / 4), diameter / 2);
            drawCircle(drawTool, leftEdge - (diameter / 2),
                    topEdge + (diameter / 4), diameter / 2);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

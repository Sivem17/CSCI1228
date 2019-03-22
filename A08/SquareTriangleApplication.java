package a08;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * A JavaFX Application to draw a SquareTriangle.
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class SquareTriangleApplication extends Application {

    /**
     * Fill in the Application window.
     *
     * @param applicationStage the application window
     */
    @Override
    public void start(Stage applicationStage) {
        Pane pane = makePane();
        Scene scene = new Scene(pane);          // A scene containing the pane
        applicationStage.setTitle("SquareTriangles");      // Set window's title
        applicationStage.setScene(scene);       // Set window's scene
        applicationStage.show();                // Display window
    }

    /**
     * Create a Pane containing the required SquareTriangles.
     *
     * @return a Pane containing a canvas painted with the SquareTriangles
     */
    private Pane makePane() {
        Pane pane = new Pane();                 // An empty pane    
        Canvas canvas = makeSquareTriangles();

        // put it all together, give it a title, and show it
        pane.getChildren().add(canvas);             // Add canvas to pane 
        return pane;
    }

    /**
     * Dimension of square window.
     */
    public static final double DIMENSION = 800;

    /**
     * Make a painting of the SquareTriangles.
     *
     * @return a Canvas with the SquareTriangles painted on it.
     */
    public Canvas makeSquareTriangles() {
        Canvas result = new Canvas(DIMENSION, DIMENSION);
        GraphicsContext draw = result.getGraphicsContext2D();

        draw.setStroke(Color.BLACK);
        drawSquare(draw, 0, 0, DIMENSION, DIMENSION);
//        drawTriangle(draw, 180 - 45, DIMENSION, DIMENSION);

        return result;
    }

    private void drawSquare(GraphicsContext draw, double x, double y, double w, double h) {
        draw.strokeRect(x, y, w, h);
        if (w >= 1) {
//            draw.strokeRect(x + (w / 2), y, w / 4, h / 4);
//            draw.strokeRect(x, y + (w / 2), w / 4, h / 4);
        }
    }

    private double[] drawTriangle(GraphicsContext draw, double angle, double x, double y) {
        double[] end = new double[2];
        double hyp = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double radians = Math.toRadians(angle);
        end[0] = x + Math.sin(radians) * hyp;
        end[1] = y + Math.sin(radians) * hyp;
        draw.strokeLine(x, y, end[0], end[1]);
        return end;
    }

    /**
     * Launch the application.
     *
     * @param args ignored
     */
    public static void main(String[] args) {
        launch(args);
    }

}

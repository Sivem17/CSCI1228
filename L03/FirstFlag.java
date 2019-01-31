package l03;

import static javafx.application.Application.launch;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * A JavaFX Application to draw the Bangladesh flag.
 *
 * @author Aitezaz Siddiqi (A00431079).
 */
public class FirstFlag extends FlagApplication {

    //Flag constants
    private static final int WIDTH = 900;
    private static final int HEIGHT = WIDTH * 3 / 5;

    private static final double DIAMETER = HEIGHT * 2 / 3;

    /**
     * Paint the flag.
     *
     * @return a Canvas with the Bangladesh flag painted on it.
     */
    @Override
    public Canvas makeFlag() {

        // A canvas to draw on.
        Canvas result = new Canvas(WIDTH, HEIGHT);
        double leftEdge, topEdge;
        GraphicsContext drawing = result.getGraphicsContext2D();
        Color red = Color.rgb(218, 41, 28);
        Color green = Color.rgb(0, 106, 78);

        //Calculate the edges.
        leftEdge = (WIDTH * 1 / 4);
        topEdge = (HEIGHT - DIAMETER) / 2;

        //Draw background -- green
        drawing.setFill(green);
        drawing.fillRect(0, 0, WIDTH, HEIGHT);

        //Draw circle -- red
        drawing.setFill(red);
        drawing.fillOval(leftEdge, topEdge, DIAMETER, DIAMETER);

        return result;
    }

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {

        //Launch application
        launch(args);
    }

}

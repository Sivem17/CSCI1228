package l03;

import static javafx.application.Application.launch;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * A JavaFX Application to draw the Colombian flag.
 *
 * @author Aitezaz Siddiqi (A00431079).
 */
public class SecondFlag extends FlagApplication {

    // flag drawing constants
    private static final int WIDTH = 900;
    private static final int HEIGHT = WIDTH * 2 / 3;

    private static final int[] PROPORTIONS = {50, 25, 25};

    /**
     * Paint the flag.
     *
     * @return a Canvas with the Colombian flag painted on it.
     */
    @Override
    public Canvas makeFlag() {

        //A canvas to draw on
        Canvas result = new Canvas(WIDTH, HEIGHT);
        double totalHeight, yellowHeight, redHeight, blueHeight;
        GraphicsContext drawing = result.getGraphicsContext2D();
        Color yellow = Color.rgb(252, 209, 22);
        Color blue = Color.rgb(0, 56, 147);
        Color red = Color.rgb(206, 17, 38);

        //Calculate the edges of the blue and red stripes
        totalHeight = PROPORTIONS[0] + PROPORTIONS[1] + PROPORTIONS[2];
        yellowHeight = (double) PROPORTIONS[0] / totalHeight;
        blueHeight = (double) PROPORTIONS[1] / totalHeight;
        redHeight = (double) PROPORTIONS[2] / totalHeight;

        //Draw left stripe -- yellow
        drawing.setFill(yellow);
        drawing.fillRect(0, 0, WIDTH, HEIGHT * 0.5);

        //Draw right stripe -- blue
        drawing.setFill(blue);
        drawing.fillRect(0, 300, WIDTH, HEIGHT * 0.25);
        //Draw right stripe -- red
        drawing.setFill(red);
        drawing.fillRect(0, 450, WIDTH, HEIGHT * 0.25);

        return result;
    }

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {

        // Launch application
        launch(args);
    }

}

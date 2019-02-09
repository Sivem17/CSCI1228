package a04;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class TableLayout extends GridPane {

    public final int NUM_ROWS;
    public final int NUM_COLUMNS;

    private int numRows = 0;
    private int numColumns = 0;

    public TableLayout(int rows, int columns) {
        if (rows < 1) {
            NUM_ROWS = 1;
        } else {
            NUM_ROWS = rows;
        }
        if (columns < 1) {
            NUM_COLUMNS = 1;
        } else {
            NUM_COLUMNS = columns;
        }
    }

    public void add(Node ns1) {

        if (numColumns < NUM_COLUMNS) {
            super.add(ns1, numColumns, numRows);
            ++numColumns;
        } else {
            ++numRows;
            numColumns = 0;

            if (numRows < NUM_ROWS) {
                super.add(ns1, numColumns, numRows);
                ++numColumns;
            }
        }

    }

    public void add(Node ns2, int columns) {

        if (numColumns < NUM_COLUMNS) {
            super.add(ns2, numColumns, numRows, columns, 1);
            numColumns += columns;
        } else {
            ++numRows;
            numColumns = 0;

            if (numColumns < NUM_COLUMNS) {
                super.add(ns2, numColumns, numRows,
                        columns, 1);
                numColumns += columns;
            }
        }

    }
}

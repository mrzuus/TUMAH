package sample.javaTables;

import java.util.ArrayList;

public class fifthTable extends table {
    public static ArrayList<chosenPos> selectedPositions = new ArrayList();

    public fifthTable(ArrayList<chosenPos> selectedPositions) {
        super(fifthTable.selectedPositions);
    }
}

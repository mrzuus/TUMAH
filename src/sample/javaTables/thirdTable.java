package sample.javaTables;

import java.util.ArrayList;

public class thirdTable extends table{

    public static ArrayList<chosenPos> selectedPositions = new ArrayList();

    public thirdTable(ArrayList<chosenPos> selectedPositions) {
        super(sample.javaTables.thirdTable.selectedPositions);
    }
}

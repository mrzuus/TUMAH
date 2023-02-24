package sample.javaTables;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class thirdTable extends table{
    public static thirdTable thirdTable = new thirdTable(table.selectedPositions);
    public static ArrayList<chosenPos> selectedPositions = new ArrayList();

    public thirdTable(ArrayList<chosenPos> selectedPositions) {
        super(sample.javaTables.thirdTable.selectedPositions);
    }
}

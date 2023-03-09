package sample.javaTables;

import java.util.ArrayList;

public class secondTable extends table {

    public static ArrayList<chosenPos> selectedPositions = new ArrayList();



    public secondTable(ArrayList<secondTable.chosenPos> selectedPositions) {
        super(secondTable.selectedPositions);
    }
}

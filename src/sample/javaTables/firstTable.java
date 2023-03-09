package sample.javaTables;


import java.util.ArrayList;

public class firstTable  extends table{

    public static ArrayList<chosenPos> selectedPositions = new ArrayList();
    public firstTable(ArrayList <firstTable.chosenPos> selectedPositions) {
        super(firstTable.selectedPositions);
    }
}

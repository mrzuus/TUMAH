package sample.javaTables;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class secondTable extends table {
    public static LinkedList<Integer> price = new LinkedList();
    public static ArrayList<chosenPos> selectedPositions = new ArrayList();
    private static final LinkedHashSet<String> positions= new LinkedHashSet<>();
    private static final LinkedList<Integer> amount = new LinkedList<>();


    public secondTable(ArrayList<secondTable.chosenPos> selectedPositions) {
        super(secondTable.selectedPositions);
    }
}

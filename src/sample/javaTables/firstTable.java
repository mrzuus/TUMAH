package sample.javaTables;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class firstTable  extends table{

    public static LinkedList<Integer> price = new LinkedList();
    public static ArrayList<chosenPos> selectedPositions = new ArrayList();
    private static final LinkedHashSet<String> positions= new LinkedHashSet<>();
    private static final LinkedList<Integer> amount = new LinkedList<>();



    public firstTable(ArrayList <firstTable.chosenPos> selectedPositions) {
        super(firstTable.selectedPositions);
    }
}

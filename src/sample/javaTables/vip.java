package sample.javaTables;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class vip extends table{
    public static ArrayList<chosenPos> selectedPositions = new ArrayList();
    public static LinkedHashSet<String> positions= new LinkedHashSet<>();
    public static LinkedList<Integer> price = new LinkedList();
    public static LinkedList<Integer> amount = new LinkedList<>();
    public vip(ArrayList<chosenPos> selectedPositions) {
        super(vip.selectedPositions);
    }
}

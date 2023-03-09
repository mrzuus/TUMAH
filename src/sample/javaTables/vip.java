package sample.javaTables;

import java.util.ArrayList;

public class vip extends table{
    public static ArrayList<chosenPos> selectedPositions = new ArrayList();
;
    public vip(ArrayList<chosenPos> selectedPositions) {
        super(vip.selectedPositions);
    }
}

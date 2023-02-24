package sample.javaTables;

import java.util.ArrayList;

public class paidTables  {
   private ArrayList<table.chosenPos> positions = new ArrayList();
   private int transferSum ;
   private int cashSum;



    public ArrayList<table.chosenPos> getPositions() {
        return positions;
    }

    public void setPositions(ArrayList<table.chosenPos> positions) {
        this.positions = positions;
    }

    public int getTransferSum() {
        return transferSum;
    }

    public void setTransferSum(int transferSum) {
        this.transferSum = transferSum;
    }

    public int getCashSum() {
        return cashSum;
    }

    public void setCashSum(int cashSum) {
        this.cashSum = cashSum;
    }




}

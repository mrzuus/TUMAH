package sample.javaTables;

import sample.tableController;

import java.util.ArrayList;
import java.util.Objects;

public class table {


    public static ArrayList<chosenPos> selectedPositions ;


    public static ArrayList<chosenPos> getTable(String nt) {
        if (nt.equals("1")) {
return firstTable.selectedPositions;
        }
        if (nt.equals("2")) {
            return secondTable.selectedPositions;
        }
        if (nt.equals("3")) {
            return thirdTable.selectedPositions;
        }
        if (nt.equals("4")) {
            return fouthTable.selectedPositions;
        }
        if (nt.equals("VIP")) {
            return vip.selectedPositions;
        }
        return null;
    }


        public table(ArrayList<chosenPos> selectedPositions){
        table.selectedPositions = selectedPositions;
    }




        public static void  addPos (String pos, int count, int price, String nt){
         chosenPos  newPos= new chosenPos(pos, count, price);
         if(nt.equals("1")){
            getTable("1").add(newPos);
         }if(nt.equals("2")){
             getTable("2").add(newPos);
         }if(nt.equals("3")){
            getTable("3").add(newPos);
         }if(nt.equals("4")){
            getTable("4").add(newPos);
         }if(nt.equals("VIP")){
            getTable("VIP").add(newPos);
         }
        }
        public static void deleteChosenPos (int index){
        ArrayList<chosenPos> arr = new ArrayList<>();
        for(int i = 0; i<table.getTable("").size(); i++){
            if (i == index){
            }
            else{
                arr.add(table.getTable("").get(i));
            }
        }

        }
      public static class chosenPos {
            String pos;
            int amount;
            int price;

            public String getPos() {
                return pos;
            }

          @Override
          public boolean equals(Object o) {
              if (this == o) return true;
              if (o == null || getClass() != o.getClass()) return false;
              chosenPos chosenPos = (chosenPos) o;
              return amount == chosenPos.amount && price == chosenPos.price && pos.equals(chosenPos.pos);
          }

          @Override
          public int hashCode() {
              return Objects.hash(pos, amount, price) * 51;
          }

          public void setPos(String pos) {
                this.pos = pos;
            }

            public int getAmount() {
                return amount;
            }

            public void setAmount(int amount) {
                this.amount = amount;
            }

            public int getPrice() {
                return price;
            }


            public chosenPos(String pos, int amount, int price) {
                this.pos = pos;
                this.amount = amount;
                this.price = price;

            }
          @Override
          public String toString() {
              return  "Position:" +  this.pos
                      + " Amount:" + this.amount
                      + " Price:" + this.price;
          }
        }
    }


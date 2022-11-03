package sample;

public abstract class coctail {
    int count;
    String name ;


    public void setCount(int newCount) {
        this.count = newCount;
    }


    public  void setName(String newName) {
        this.name = newName;
    }



    public String getName(){
        return name;
    }

    public  int getCount() {
        return this.count;
    }

}

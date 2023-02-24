package sample;

import javafx.beans.property.SimpleStringProperty;

public class tableModel {
    private SimpleStringProperty position;
    private SimpleStringProperty count;
    private SimpleStringProperty sum;

    public String getPosition() {
        return position.get();
    }

    public SimpleStringProperty positionProperty() {
        return position;
    }

    public void setPosition(String position) {
        this.position.set(position);
    }

    public String getCount() {
        return count.get();
    }

    public SimpleStringProperty countProperty() {
        return count;
    }

    public void setCount(String count) {
        this.count.set(count);
    }

    public String getSum() {
        return sum.get();
    }

    public SimpleStringProperty sumProperty() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum.set(sum);
    }

    public String getPrice() {
        return price.get();
    }

    public SimpleStringProperty priceProperty() {
        return price;
    }

    public void setPrice(String price) {
        this.price.set(price);
    }

    private SimpleStringProperty price;


    public tableModel(String position, String count, String price, String sum) {
        this.price = new SimpleStringProperty(price);
        this.position = new SimpleStringProperty(position);
        this.count = new SimpleStringProperty(count);
        this.sum = new SimpleStringProperty(sum);
    }







}

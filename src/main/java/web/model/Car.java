package web.model;

public class Car {
    private String manufacture;
    private String model;
    private int price;

    public Car() {
    }

    public Car(String manufacture, String model, int price) {
        this.manufacture = manufacture;
        this.model = model;
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

package ie.atu.car_manager;

public class Car {

    // Instance variable

    private int VinNumber; // unique id for car
    private String Model;
    private float PriceEur;
    private boolean IsSold;

    // Constructor

    public Car(int VinNumber, String Model, float Price, boolean IsSold) {
        this.VinNumber = VinNumber;
        this.Model = Model;
        this.PriceEur = PriceEur;
        this.IsSold = IsSold;
    }

    // Getter and setter methods

    // Getter methods

    public int getVinNumber() {
        return this.VinNumber;
    }

    public String getModel() {
        return this.Model;
    }

    public float getPriceEur() {
        return this.PriceEur;
    }

    public boolean getIsSold() {
        return this.IsSold;
    }

    // Setter methods

    public void setVinNumber(int VinNumber) {
        this.VinNumber = VinNumber;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public void setPrice(float PriceEur) {
        this.PriceEur = PriceEur;
    }

    public void setIsSold(boolean IsSold) {
        this.IsSold = IsSold;
    }

}

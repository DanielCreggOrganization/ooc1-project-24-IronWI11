package ie.atu.car_manager;

public class Car {

// Instance variable

private int VinNumber; // unique id for car 
private String Model;
private float Price;
private boolean IsSold;



//Getter and setter methods

//Getter methods

public int getVinNumber(){
    return this.VinNumber;
}

public String getModel(){
    return this.Model;
}

public float getPrice(){
    return this.Price;
}

public boolean getIsSold(){
    return this.IsSold;
}


//Setter methods

public void setVinNumber(int VinNumber){
    this.VinNumber = VinNumber;
}

public void setModel(String Model){
    this.Model = Model;
}

public void setPrice(float Price){
    this.Price = Price;
}

public void setIsSold(boolean IsSold){
    this.IsSold = IsSold;
}





}

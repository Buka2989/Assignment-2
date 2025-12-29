public abstract class Vehicle {
    protected String brand;
    protected int year;

    protected Driver driver;
    Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    void startEngine(){}
    void stopEngine(){}

    public void setDriver(Driver driver){
        this.driver = driver;
    }
    void displayInfo(){
        System.out.println("Brand: " + brand + ", year: " + year);
    }
}

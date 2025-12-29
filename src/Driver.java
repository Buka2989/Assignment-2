public class Driver {
    private String name;
    private String licenseNumber;

    Driver(String name, String licenseNumber){
        this.name = name;
        this.licenseNumber = licenseNumber;
    }
    public void displayDriverInfo(){
        System.out.println("Name: " + name + " | License number: " + licenseNumber);
    }
}

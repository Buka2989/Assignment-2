public class Main{
    public static void main(String[] args){
        Car car1 = new Car("BMW", 2006, 4, "Gasoline");
        Motorcycle moto1 = new Motorcycle("Yamaha", 2015, false);
        Truck truck1 = new Truck("Volvo", 2017, 25.0, 6);

        Driver driver1 = new Driver("Ruslan", "000001");
        Driver driver2 = new Driver("Dastan", "000002");

        car1.setDriver(driver1);
        moto1.setDriver(driver1);
        truck1.setDriver(driver2);

        Vehicle[] vehicles = {car1, moto1, truck1};

        for (Vehicle vehicle: vehicles){
            vehicle.startEngine();
        }
        for (Vehicle vehicle: vehicles){
            if (vehicle.driver != null) {
                vehicle.driver.displayDriverInfo();
            } else {
                System.out.println("Vehicle has no driver");
            }
        }

    }
}

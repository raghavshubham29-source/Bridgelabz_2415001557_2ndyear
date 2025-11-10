interface Insurable {
    double calculateInsurance();
    void getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public double getRentalRate() { return rentalRate; }
    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) { super(num, "Car", rate); }

    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 1000; }
    public void getInsuranceDetails() { System.out.println("Car insurance: 1000"); }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String num, double rate) { super(num, "Bike", rate); }

    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 300; }
    public void getInsuranceDetails() { System.out.println("Bike insurance: 300"); }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String num, double rate) { super(num, "Truck", rate); }

    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 2000; }
    public void getInsuranceDetails() { System.out.println("Truck insurance: 2000"); }
}

public class VehicleRental {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("C123", 2000),
            new Bike("B456", 500),
            new Truck("T789", 5000)
        };

        for (Vehicle v : vehicles) {
            double cost = v.calculateRentalCost(5);
            double insurance = ((Insurable)v).calculateInsurance();
            System.out.println(v.getClass().getSimpleName() + " Total: " + (cost + insurance));
        }
    }
}
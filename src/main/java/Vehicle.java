import java.util.Random;

abstract class Vehicle {

    String driverName;
    String licensePlate;
    String brand;
    Boolean isFree;
    double velocity;
    int type;

    GPS currentGPS;

    public Vehicle(String driverName, String licensePlate, String brand, int type) {
        this.driverName = driverName;
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Boolean getFree() {
        return isFree;
    }

    public void setFree(Boolean free) {
        isFree = free;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public GPS getCurrentGPS() {
        return currentGPS;
    }

    public void setCurrentGPS(GPS currentGPS) {
        this.currentGPS = currentGPS;
    }

    public void randomGPS() {

        Random rand = new Random();
        double temp;
        temp = rand.nextDouble();
        double x_random = Math.round(temp * 100) / 100d;
        temp = rand.nextDouble();
        double y_random = Math.round(temp * 100) / 100d;

        GPS newGPS = new GPS(x_random, y_random);

        // gan lai
        this.setCurrentGPS(newGPS);
    }

    // abstract method:
    public abstract double calculateFreight(double km);
}

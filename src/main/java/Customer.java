import java.util.Scanner;

public class Customer {
    GPS currentGPS;
    GPS startGPS;
    GPS destinationGPS;

    public Customer() {
        this.currentGPS = new GPS();
    }

    // parameter constructor
    public Customer(GPS currentGPS) {
        this.currentGPS = currentGPS;
    }

    public GPS getCurrentGPS() {
        return currentGPS;
    }

    public void setCurrentGPS(GPS currentGPS) {
        this.currentGPS = currentGPS;
    }

    public GPS getStartGPS() {
        return startGPS;
    }

    public void setStartGPS(GPS startGPS) {
        this.startGPS = startGPS;
    }

    public GPS getDestinationGPS() {
        return destinationGPS;
    }

    public void setDestinationGPS(GPS destinationGPS) {
        this.destinationGPS = destinationGPS;
    }



    // other methods:
    public void callBooking() {
        int option;
        System.out.println("Chon loai phuong tien muon chon: ");
        System.out.println("1. Xe may");
        System.out.println("2. Oto");
        System.out.println("3. Xe tai");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chon load xe so: ");
        int selectedType = scanner.nextInt();

        Vehicle bookedVehicle;
        if (selectedType == 1) {
            // select vehicle match condition
//            bookedVehicle =
        } else if (selectedType == 2) {

        } else {

        }


    }
}

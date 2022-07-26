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
        System.out.println("Chon loai phuong tien muon chon: ");
        System.out.println("1. Xe may");
        System.out.println("2. Oto");
        System.out.println("3. Xe tai");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chon load xe so: ");
        int selectedType = scanner.nextInt();

        int seat, capacity;

        if (selectedType == 1) {
            // nothing todo
        } else if (selectedType == 2) {
            System.out.println("nhap cho ngoi: ");
            seat = scanner.nextInt();
        } else {
            System.out.println("nhap capacity: ");
            capacity = scanner.nextInt();
        }

//        System.out.println("nhap diem bat dau: ");
//        System.out.println("nhap batdau x: ");
//        double startX = scanner.nextDouble();
//        System.out.println("nhap batdau y: ");
//        double startY = scanner.nextDouble();
        startGPS = GPS.inputGPS();
        destinationGPS = GPS.inputGPS();

        System.out.println("nhap diem ketthuc: ");
        System.out.println("nhap kt x: ");
        double desX = scanner.nextDouble();
        System.out.println("nhap kt y: ");
        double desY = scanner.nextDouble();
        destinationGPS = new GPS(desX, desY);

//        Vehicle bookedVehicle = findVehicleSuitable();


    }
}

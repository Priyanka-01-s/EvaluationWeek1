public class App {
    public static void main(String[] args) {
        Attendant attendant1 = new Attendant("Roy");
        Attendant attendant2 = new Attendant("Mary");
        ParkingLot parkingLot1 = new ParkingLot(4, attendant1);
        //ParkingLot parkingLot2 = new ParkingLot(1, attendant2);
        Vehicle car1 = new Vehicle("ABC123");
        Vehicle car2 = new Vehicle("XYZ789");

        parkingLot1.parkVehicle(car1);
        //parkingLot2.parkVehicle(car2);


        parkingLot1.exitVehicle(car1);
        //parkingLot2.exitVehicle(car2);
    }
}

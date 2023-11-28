package Evaluation.ParkingLot1.main.src;

import java.util.ArrayList;
import java.util.List;

class ParkingLot {
    private List<ParkingSpace> parkingSpaces;
    private Attendant attendant;

    public ParkingLot(int capacity, Attendant attendant) {
        this.parkingSpaces = new ArrayList<>();
        for (int i = 1; i <= capacity; i++) {
            parkingSpaces.add(new ParkingSpace(i));
        }
        this.attendant = attendant;
    }

    public void parkVehicle(Vehicle vehicle) {
        for (ParkingSpace space : parkingSpaces) {
            if (!space.getOccupied()) {
                space.occupySpace(vehicle);
                return;
            }
        }
        System.out.println("Parking lot is full. Cannot park vehicle with license plate " + vehicle.getLicensePlate());
    }

    public void exitVehicle(Vehicle vehicle) {
        for (ParkingSpace space : parkingSpaces) {
            if (space.getOccupied() && space.getParkedVehicle().equals(vehicle)) {
                space.vacateSpace();
                attendant.collectFee(vehicle);
                return;
            }
        }
        System.out.println("Vehicle with license plate " + vehicle.getLicensePlate() + " not found in the parking lot");
    }
}

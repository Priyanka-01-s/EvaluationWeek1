package Evaluation.ParkingLot1.main.src;

class ParkingSpace {
    private int spaceNumber;
    private boolean occupied;
    private Vehicle parkedVehicle;

    public ParkingSpace(int spaceNumber) {
        this.spaceNumber = spaceNumber;
        this.occupied = false;
        this.parkedVehicle = null;
    }

    public int getSpaceNumber() {
        return spaceNumber;
    }

    public boolean getOccupied() {
        return occupied;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void occupySpace(Vehicle vehicle) {
        this.occupied = true;
        this.parkedVehicle = vehicle;
        System.out.println("Vehicle with " + vehicle.getLicensePlate() + " parked at space " + spaceNumber);
    }

    public void vacateSpace() {
        this.occupied = false;
        this.parkedVehicle = null;
    }
}
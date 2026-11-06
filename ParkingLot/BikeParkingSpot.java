package ParkingLot;

public class BikeParkingSpot extends ParkingSpot {
    
    public  BikeParkingSpot(int spotNumber,String spotType) {
        super(spotNumber,spotType);
    }
    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "bike".equalsIgnoreCase(vehicle.getVehicleType());
    }
}

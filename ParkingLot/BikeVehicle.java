package ParkingLot;

import ParkingLot.strategies.ParkingStrategy;

public class BikeVehicle extends Vehicle{
    
    public BikeVehicle(String licensePlate,String vehicleType,ParkingStrategy feeStrategy) {
        super(licensePlate, vehicleType, feeStrategy);
    }
}

package ParkingLot;

import ParkingLot.strategies.ParkingStrategy;

public class CarVehicle extends Vehicle{
    
    public CarVehicle(String licensePlate,String vehicleType,ParkingStrategy feeStrategy) {
        super(licensePlate, vehicleType, feeStrategy);
    }
}

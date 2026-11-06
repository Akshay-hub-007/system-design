package ParkingLot;

import ParkingLot.strategies.ParkingStrategy;

public class VehicleFactory {
    public static Vehicle createVehicle(String vehicleType, String licensePlate, ParkingStrategy feeStrategy) {
        if (vehicleType.equalsIgnoreCase("Car")) {
            return new CarVehicle(licensePlate, vehicleType, feeStrategy);
        } else  {
            return new BikeVehicle(licensePlate, vehicleType, feeStrategy);
        }
    }
}

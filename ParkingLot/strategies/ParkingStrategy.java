package ParkingLot.strategies;

import ParkingLot.DurationType;

public  interface ParkingStrategy  {
    double calculateFee(String vehicleType, int duration, DurationType durationType);

}

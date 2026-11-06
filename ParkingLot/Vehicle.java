package ParkingLot;
import ParkingLot.strategies.*;
public abstract class  Vehicle {
    private String licensePlate;
    private String vehicleType;
    
    private ParkingStrategy feeStrategy;

    public Vehicle(String licensePlate, String vehicleType, ParkingStrategy feeStrategy) {  
        this.licensePlate = licensePlate;  
        this.vehicleType = vehicleType;  
        this.feeStrategy = feeStrategy;  
    }  
    public String getVehicleType() {  
        return vehicleType;  
    }  
    public String getLicensePlate() {  
        return licensePlate;  
    }  
    public double calculateFee(int duration, DurationType durationType) {  
        return feeStrategy.calculateFee(vehicleType, duration, durationType);
    }  
}

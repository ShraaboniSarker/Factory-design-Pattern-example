/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclecreator;

/**
 *
 * @author Lenovo
 */
public class VehicleFactory {
    public static Vehicle createVehicle(VehicleType type,int numOfWheels, int numOfPassengers, boolean hasGas){
    
        Vehicle vehicle = null;
        switch(type){
            case CAR:
                vehicle = new Car(numOfWheels, numOfPassengers, hasGas);
                break;
            case PLANE:
                vehicle = new Plane(numOfWheels, numOfPassengers, hasGas);
                break;
        }
        return vehicle;
    }
}

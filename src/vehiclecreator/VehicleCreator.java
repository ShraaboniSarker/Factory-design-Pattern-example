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
public class VehicleCreator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle(VehicleType.CAR,4,4,true); 
        
        Vehicle plane = VehicleFactory.createVehicle(VehicleType.PLANE,3,15,false);
    }
    
}

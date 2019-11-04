/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import vehiclecreator.Vehicle;
import vehiclecreator.VehicleFactory;
import vehiclecreator.VehicleType;

/**
 *
 * @author Lenovo
 */
public class VehiclecreatorJUnitTest {
    
    @Before
    public void setUp() {
    }

     @Test
     public void doTest() {
     Vehicle car = VehicleFactory.createVehicle(VehicleType.CAR, 4, 4, true);
     
     Vehicle plane = VehicleFactory.createVehicle(VehicleType.PLANE, 3, 15, true);
     
     Assert.assertTrue(car instanceof Vehicle);
     Assert.assertTrue(plane instanceof Vehicle);
     
     }
}

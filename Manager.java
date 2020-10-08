
/**
 * The manager runs the CPM Delivery Service business
 * 
 * @author GK CPM
 * @version 3/10/2018
 */
import java.util.ArrayList;
import java.util.Random;
import garage.*;
import office.*;

public class Manager
{
    private ArrayList<Vehicle> fleet;
    private ArrayList<OfficeEquipment> equipList;
    private ArrayList<Salvage> assetList = new ArrayList<Salvage>();
    private ArrayList<Driver> driverList = new ArrayList<Driver>();
    private final int NUM_DRIVERS = 5;
    private BookKeeper janet;
    
    private Random rand = new Random();

    /**
     * Constructor for objects of class Driver
     */
    public Manager()
    {
        // get fleet of vehicles
        FleetMaker fm = new FleetMaker();
        fleet = fm.getFleet();  
        
        // get office equipment
        OfficeMaker om = new OfficeMaker();
        equipList = om.getOfficeEquipList(); 
        
        // add drivers
        for(int x = 0; x < NUM_DRIVERS; x++) driverList.add(new Driver(fleet));
        
        //add real property to the assetList
        for(Vehicle v:fleet) assetList.add(v);
        for(OfficeEquipment oe:equipList)assetList.add(oe);
        
        //instantiate bookkeeper
        janet = new BookKeeper(assetList);
        
    }


    /**
     * Simulates taking inventory of CPM Delivery Service assets
     * 
     */
    public void showInventoryReport()
    {
        String reportStr = janet.takeInventory();

        System.out.println(reportStr);
    }
    
    /**
     * Simulates making one day of deliveries
     * 
     */
    public void makeDeliveries()
    {
        driverList.get(0).checkFleet();
        for(int driverNum = 1; driverNum <= driverList.size(); driverNum++) {
            driverList.get(driverNum - 1).workDay();
            System.out.println("Driver Number " + driverNum + " day is complete.\n");
        }

    }
    
    // ... a bunch of other methods for running a business not shown. 
}

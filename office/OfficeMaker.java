package office;

/** ONLY MODIFY THE CONSTRUCTOR
 * Creates ArrayList of Office Equipment.
 * 
 * @author GK CPM 
 * @version 2/10/18
 */

import java.util.ArrayList;
import java.util.Random;

public class OfficeMaker
{
    // instance variables 
    private ArrayList<OfficeEquipment> officeEquipList = new ArrayList<OfficeEquipment>();
    private Random rand = new Random();

    /**
     * Constructor for objects of class Driver
     * 
     * ADD YOUR OFFICE EQUIPMENT TO THE officeEquipList
     *   You may change the price parameters too.
     */
    public OfficeMaker()
    {
        officeEquipList.add(new ElectricPencilSharpener(25));
        officeEquipList.add(new Your_Office_Item_1(15));
        officeEquipList.add(new Your_Office_Item_2(125));
        
        //Additional items
        int numItems = rand.nextInt(6) + 3;
        for(int x = 0; x < numItems; x++)
        {
            int itemChooser = rand.nextInt(3);
   
            if(itemChooser < 1) officeEquipList.add(new ElectricPencilSharpener(25));
            else if (itemChooser < 2) officeEquipList.add(new Your_Office_Item_1(15));
            else officeEquipList.add(new Your_Office_Item_2(125));
        }

      this.useOfficeStuff(); 
    }
    
    /**
     * Simulates the use of Office Equipment
     */    
    public void useOfficeStuff()
    {
        
        int randUses = rand.nextInt(13) + 2;
        for(int v = 0; v < randUses; v++){
            
            for(OfficeEquipment oe:officeEquipList){
                oe.use();
            }
        }
    }

    /**
     * Accessor method for the List of Office Equipment
     * 
     * @return     an ArrayList representing the Vehicles in the fleet 
     */
    public ArrayList<OfficeEquipment> getOfficeEquipList()
    {
        return officeEquipList;
    }
        
}

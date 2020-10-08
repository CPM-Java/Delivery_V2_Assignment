package office;


/**
 * Abstract class OfficeEquipment - write a description of the class here
 * 
 * @author GK CPM
 * @version 3/10/2018
 */

public abstract class OfficeEquipment implements Salvage
{
    private String colorStr = "Ecru"; //boring
    private int initialCost; //in dollars
    //assume more instance variables
    
    public OfficeEquipment(int costNew)
    {
        initialCost = costNew;
    }
    
    // abstract methods
    public abstract int getSalvageValue();
    
    public abstract String use();
    
    
    public int getCostNew()
    {
        return initialCost;
    }
    
    public void kickMeInFrustration()
    {
        System.out.println("Hey stop that!");
    }
    
    //assume other methods that office equipment might share.
}

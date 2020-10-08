package office;


/**
 * A simple Pencil Sharpener.
 * 
 * @author GK 
 * @version 10-09-07, CPM 2/8/18
 */


public class ElectricPencilSharpener extends OfficeEquipment
{
    // instance variables 
    private double myAmtOfShavings;//ounces
    private double mySharpness;//scaled 1-10(10 is sharpest)
    private final int SHAVINGS_CAPACITY = 16;//capacity in ounces

    /**
     * Constructor for objects of class PencilSharpener
     */
    public ElectricPencilSharpener(int new$)
    {
        super(new$); //25 dollars new
        // initialize instance variables
        myAmtOfShavings = Math.random()*SHAVINGS_CAPACITY;
        mySharpness = Math.random()*10.0;
    }

    /**
     * Calculates and return the current value based on
     *  purchace price and instance variables affected by use()
     * 
     * @return     current value 
     */
    public int getSalvageValue()
    {
        return (int)(super.getCostNew() - (10.0 - mySharpness) - myAmtOfShavings);
    }
    
    /**
     * Modifies instance variables based on normal use
     * 
     * @return     a String describing a typical use 
     */  
    public String use()
    { 
        String useStr = "";
        if(myAmtOfShavings >= SHAVINGS_CAPACITY) useStr += this.emptyShavings();  
        else if(mySharpness <= 0) useStr += this.replaceBlade();
        else 
        {
            mySharpness -= 0.2;
            myAmtOfShavings += 0.4;
            useStr += "\nPencil Sharpening Completed.";          
        }
        return useStr;
    }
    
    //Maintain the sharpener
    public String emptyShavings()
    {
        myAmtOfShavings = 0;//no shavings left
        return "\n\tThe Shavings have been emptied.";
    }
    public String replaceBlade()
    {
        mySharpness = 10;//new blade is as sharp as possible
        return "\n\tThe Blade has been replaced with a new one.";
    }

    //toString()
    public String toString()
    {
        return "Pencil Sharpener, Amount of shavings: " + Math.round(10*myAmtOfShavings)/10.0 + " ounces. " + 
               "Blade Sharpness: " + Math.round(10*mySharpness)/10.0 +" (Scale 0 - 10).";
    }
}


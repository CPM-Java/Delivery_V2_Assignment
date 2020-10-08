package office;

/**
 * Any class that implements Salvage must provide the method getSalvageValue()
 * and its objects may be referenced or grouped as <Salvage>
 * 
 * @author GK CPM 2018
 * @version 3/4/2018
 */
public interface Salvage
{
    /**
     * Salvage value based on factors such as age condition and use
     * 
     * @return        the monetary salvage value of the asset 
     */
    public int getSalvageValue();
}

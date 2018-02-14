import java.util.Random;

/**
 * 
 *
 * @author Sean Stock
 * @version 2.13.18
 */
 public class Dye
{
    private int type;
    private int result;
    Random rand = new Random();

    /**
     * Constructor for objects of class Dye
     */
    public Dye(int type)
    {
        this.type = type;
    }

    /**
     *
     */
    public int rollDye()
    {
        int result = rand.nextInt(type) + 1;
        return result;
    }
}

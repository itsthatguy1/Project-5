import java.util.Random;

/**
 * Creates a dye with a specified number of sides.
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
     * Rolls the die, and returns the random result.
     */
    public int rollDye()
    {
        int result = rand.nextInt(type) + 1;
        return result;
    }
}

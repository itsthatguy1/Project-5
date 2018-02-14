import java.util.Random;
import java.util.ArrayList;

/**
 * Lets user roll a die multiple times and records the results.
 *
 * @author Sean Stock
 * @version 2.13.18
 */
public class Roll
{
    private int numDice;
    private int targetNum;
    private int type;
    private int total;
    private static final int MIN_TARGET = 5;
    private static final int MAX_TARGET = 30;
    private static final int MAX_NUM_DICE = 10;
    private Dye dye;
    private ArrayList<Integer> rolls;

    /**
     * Constructor for objects of class Roll
     */
    public Roll(int numDice, int type, int targetNum)
    {
        this.numDice = numDice;
        this.targetNum = targetNum;
        this.type = type;
        rolls = new ArrayList<>();
        dye = new Dye(type);
    }

    /**
     * Clears the rolls array, and rolls the die the specified number of times.
     * Will print a failure message of more than half the rolls are ones.
     * Will reroll if the result is the same as the dye type, then add the two individual results
     * If result is successful, it will be displayed on screen.
     */
    public void newAttempt()
    {
        rolls.clear();
        int oneCounter = 0;
        for (int i = 0; i < numDice; i++)
        {
            int result = dye.rollDye();
            if (result == 1)
            {
                oneCounter++;
            }
            while (result == type)
            {
                int oldResult = result;
                result = dye.rollDye() + oldResult;
            }
            rolls.add(result);
        }
        int halfRolls = rolls.size() / 2;
        if (oneCounter >= halfRolls)
        {
            System.out.println("Sorry, you rolled too many ones!");
        }
        else
        {
           total = 0;
           for (int i = 0; i < numDice; i++)
           {
               int oldTotal = total;
               total = rolls.get(i) + oldTotal;
           }
           System.out.println("You rolled"  + total); 
        }
    }
}

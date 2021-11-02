/************************
 * Ranged.java
 * @author Zhan Li
 * @version 3.2.4
 * @date 11/1/2021
 **************************/
// This class for enemies which can make ranged attacks to the player.
import java.util.Random;

public class Ranged extends EnemyMember
{
protected String weapons;
protected Integer range;

public Ranged(String eName, String eRace, String eLocation, String eWeapons, Integer eRange)
{
    super(eName, eRace, eLocation);
    weapons = eWeapons;
    range = eRange;
}

public String toString()
{
    String result = super.toString();

    result += "\nWeapons: " + weapons;
    result += "\nAttack range: " + range;

    return result;
}

public String attack()
{
    String attackInformation;
    int damageValue;
    Random rand = new Random();

    damageValue = rand.nextInt(50 - 20) + 20;
    attackInformation = name + " launch a long range attack by " + weapons + " caused damage " + damageValue + " points" + "\n";



    return attackInformation;
}



}
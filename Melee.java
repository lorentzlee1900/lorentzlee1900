/************************
 * Melee.java
 * @author Zhan Li
 * @version 3.2.4
 * @date 11/1/2021
 **************************/
// This class for enemies which can make melee attacks to the player.
import java.util.Random;

public class Melee extends EnemyMember
{
protected String skills;
protected Integer speedLevel;

public Melee(String eName, String eRace, String eLocation, String eSkills, Integer eSpeedLevel)
{
    super(eName, eRace, eLocation);
    skills = eSkills;
    speedLevel = eSpeedLevel;
}

public String toString()
{
    String result = super.toString();

    result += "\nSkills: " + skills;
    result += "\nSpeed Level: " + speedLevel;

    return result;
}

public String attack()
{
    String attackInformation;
    int damageValue;
    Random rand = new Random();

    damageValue = rand.nextInt(200 - 100) + 100;
    attackInformation = name + " launch a melee attack using " + skills + " caused damage " + damageValue + " points" + "\n";



    return attackInformation;
}



}
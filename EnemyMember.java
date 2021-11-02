/************************
 * EnemyMember.java
 * @author Zhan Li
 * @version 3.2.4
 * @date 11/1/2021
 **************************/
abstract public class EnemyMember
{
protected String name; //The name of enemy.
protected String race; //The race of enemy. For example, wildlife, demon, giant...
protected String location; //The location where the enemy most likely will appear in the game.

public EnemyMember(String eName, String eRace, String eLocation)
{
    name = eName;
    race = eRace;
    location = eLocation;
}

public String toString()
{
    String result = "Name: " + name + "\n";

    result += "Race: " + race + "\n";
    result += "Location: " + location;
    
    return result;
}

public abstract String attack();
}
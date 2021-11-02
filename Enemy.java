/************************
 * Enemy.java
 * @author Zhan Li
 * @version 3.2.4
 * @date 11/1/2021
 **************************/
public class Enemy
{
private EnemyMember[] enemyList;

public Enemy()
{
enemyList = new EnemyMember[6];

enemyList[0] = new Ranged("Ghost Knight", "Ghosts", "Castle", "Crossbow", 100);
enemyList[1] = new Ranged("Witch", "Enchanters", "Wilderness", "Magic Wand", 150);
enemyList[2] = new Ranged("Demon Sniper", "Demons", "City", "Gun", 200);

enemyList[3] = new Melee("Undead Dog", "Undeads", "Castle", "Clawing", 20);
enemyList[4] = new Melee("Hollow Warrior", "Hollows", "Forest", "Heavy Punch", 15);
enemyList[5] = new Melee("Skeleton Beast", "Skeletons", "Dungeon", "Collision", 10);

   
}

public void attackInfo()
{
    String description;
    for (int count=0; count < enemyList.length; count++)
{
    System.out.println(enemyList[count] +"\n");

    description = enemyList[count].attack(); // polymorphic

        
    System.out.println(description);
    System.out.println("-------------------------------------");
            
            
}

}

}
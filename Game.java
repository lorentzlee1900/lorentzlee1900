/************************
 * Game.java
 * Generate enemy information and attacks within a game
 * @author Zhan Li
 * @version 3.2.4
 * @date 11/1/2021
 **************************/
public class Game
{

public static void main(String[] args)
{
    System.out.println("Welcome to the Dark Souls game ememies simulator");
    System.out.println("Here we will generate ememy information, and simulate the damage they made to you !");
    System.out.println("-------------------------------------");
    Enemy newEnemy = new Enemy();
    newEnemy.attackInfo();
}
}
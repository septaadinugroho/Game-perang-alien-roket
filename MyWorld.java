import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        alien alien = new alien();
        addObject(alien,196,109);

        hero hero = new hero();
        addObject(hero,65,108);
        hero.setLocation(142,437);
        alien alien2 = new alien();
        addObject(alien2,89,112);
        alien alien3 = new alien();
        addObject(alien3,145,59);
    }
}

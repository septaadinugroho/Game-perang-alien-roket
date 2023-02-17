import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class blast extends Actor
{
    /**
     * Act - do whatever the blast wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count=0;
    blast(){
        setImage("blast.png");
    }
    
    public void act() 
    {
        count++;
        if(count>=5){
            getWorld().removeObject(this);
        }
        // Add your action code here.
    }    
}

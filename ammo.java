import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ammo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ammo extends Actor
{
    /**
     * Act - do whatever the ammo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    ammo()
    {
        setImage("bullet.png");
    }
    
    
    public void act() 
    {
       setLocation(getX(), getY()-4);
       if(getY() <= 5){
           getWorld().removeObject(this);
        
        // Add your action code here.
    }    
}
}

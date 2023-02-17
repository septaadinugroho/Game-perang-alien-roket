import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hero extends Actor
{
    
    
    /**
     * Act - do whatever the hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count=0;
    hero()
    {
    setImage("rocket.png");
    }
    void shoot(){
        count++;
        if(count>=10){
            ammo peluru=new ammo();
            getWorld().addObject(peluru,getX(),getY());
            Greenfoot.playSound("ammo.wav");
            count=0;
        }
    }
    
    
    public void act()
    {
      // Add your action code here.
           if(Greenfoot.isKeyDown("right")){
           setLocation(getX()+1, getY());
         }    
         else if(Greenfoot.isKeyDown("left")){
             setLocation(getX()-1, getY());
         }
       if(Greenfoot.isKeyDown("up")){
          setLocation(getX(), getY()-1);
         } 
         else if(Greenfoot.isKeyDown("down")){
           setLocation(getX(), getY()+1);
         }
        if(Greenfoot.isKeyDown("space")){
            shoot();
        }
        
    }
}
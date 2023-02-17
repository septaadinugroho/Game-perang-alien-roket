import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class alien extends Actor
{
    /**
     * Act - do whatever the alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        alien alien=new alien();
        getWorld().addObject(alien,Greenfoot.getRandomNumber(300),0);
        
    }
    
    
    void meledak(){
        
        Greenfoot.playSound("blast.wav");
        blast bom=new blast();
        getWorld().addObject(bom,getX(),getY());
        cetakbaru();
        getWorld().removeObject(this);
    }
    
    
    public void act() 
    {
        setLocation(getX(),getY()+1);
        if(getY()>=499){
            setLocation(Greenfoot.getRandomNumber(300),0);
        }
                if(isTouching(hero.class)){
                    meledak();
                }
          else if(isTouching(ammo.class)){
              removeTouching(ammo.class);      
              meledak();
           }  
        // Add your action code here.
        
   }
}
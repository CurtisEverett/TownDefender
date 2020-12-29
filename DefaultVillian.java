import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DefaultVIllian here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DefaultVillian extends Intruder
{
    public DefaultVillian()
    {
       super(100,3,"VillianDefault.png",50); 
    }
    
    /**
     * Act - do whatever the DefaultVIllian wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(getSpeed());
    }  
    
    
}

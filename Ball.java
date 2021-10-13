import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        move(4);
        
        World world = getWorld();
        
        if(getX()>=world.getWidth()-5||getX()<=5){
            turn(95);
            if(Greenfoot.getRandomNumber(100)<90){
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        if(getY()>=world.getHeight()-5||getY()<=5){
            turn(95);
            if(Greenfoot.getRandomNumber(100)<90){
                turn(Greenfoot.getRandomNumber(90-45));
            }

        }
        
    }    
}

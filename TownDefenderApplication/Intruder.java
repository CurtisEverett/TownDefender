
public abstract class Intruder
{
    private int hp;   //Lebenspunkte
    private double mvmspeed;  //Bewegungsgeschwindigkeit 
    // private String model; //Serie von Fotos die die Bewegung darstellen
    private String currentPic; //Pfad der Bilder
    private int bounty; //Geld das gutgeschrieben wird, wenn $Objekt stirbt

    public Intruder(int hp, double mvmspeed, String picturePath, int bounty)
    {
        this.hp=hp;
        this.mvmspeed=mvmspeed;
        this.currentPic=picturePath;
        this.bounty=bounty;
    }
    
    private int die()
    {
        //remove Object
        return bounty;
    }
    
    public boolean hit(double damage)
    {
        return false;
    }
    
    public boolean move(double movementSpeed)
    {
        return false;
    }
    
    public int getHP()
    {
        return hp;
    }
    
    public double getSpeed()
    {
        return mvmspeed;
    }
    
    public String getPic()
    {
        return currentPic;
    }
    
    public boolean setPic(String picturePath)
    {
        try{
            currentPic=picturePath;
            return true;
        }
        catch(Exception e)
        {
            return false;
        }                  
    }
    
    public boolean setSpeed(double newSpeed)
    {
        try{
            this.mvmspeed=newSpeed;
            return true;
        }
        catch(Exception e)
        {
            return false;
        } 
    }
    
    public boolean turn(int grad)
    {
        return false;
    }
}

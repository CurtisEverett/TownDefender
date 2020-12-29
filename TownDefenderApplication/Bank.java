
public class Bank
{
    private static int money;
    private static int roundmoney;
    
    private static boolean setMoney(int newMoney)
    {
        try{
            money=newMoney;
            return true;
        }
        catch(Exception e)
        {
            return false;
        } 
    }
    
    public static boolean minus(int soll)
    {
        try{
            money-=soll;
            return true;
        }
        catch(Exception e)
        {
            return false;
            
        } 
    }
    
    public static boolean plus(int haben)
    {
        try{
            money+=haben;
            return true;
        }
        catch(Exception e)
        {
            return false;
        } 
    }
    
    public static int getMoney()
    {
        return money;
    }
}

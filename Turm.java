import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public abstract class Turm extends Actor
{
    private int level; //welches Level der Turm aktuell hat
    private int bauPreis; //die Kosten zum ersten mal Bauen
    private double grundSchaden; //der Schaden beim ersten mal Bauen ohne Upgrades
    private double reichweite; //die Reichweite in dem der Turm angreifen kann
    private int maxLevel; //das maximale Level den der Turm erreichen kann
    private double schadensMultiplikator; //um wie viel sich der Schaden vervielfacht
    private double attackSpeed; //die Angriffsrate in Millisekunden
    private int kills; //wie viel Schaden der Turm angerichtet hat
    private boolean buildableOnWater; //kann man den Turm auf Wasser platzieren
    private String currentPic; 
    //private Debuff debuffs; #REWORK#
    
    private int berechneSellPrize()
    {
        return -1;
    }
    
    private double berechneSchaden()
    {
        return -1;
    }
    
    public double sell()
    {
        return -1;
    }
    
    public int getKills()
    {
        return kills;
    }
    
    public boolean setPicture(String bildquelle)
    {
        try{
            currentPic=bildquelle;
            return true;
        }
        catch(Exception e)
        {
            return false;
        } 
    }
    
    public boolean upgraden()
    {
        return false;
    }
    
    // public boolean setBuff(Buff buff)
    // {
        // return false;
    // }
}


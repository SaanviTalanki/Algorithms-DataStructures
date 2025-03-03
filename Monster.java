public class Monster
{
    private double strength = 15; 
    private double health = 100; 
    public Monster(double s, double h)
    {
        strength = s;
        health = h;
    }
    public double getHealth()
    {
        return health;
    }
    public double getStrength()
    {
        return strength;
    }
    public void setHealth(double h)
    {
        health = h;
    }
    public void setStrength(double s)
    {
        strength = s;
    }
    public double attack ()
    {
        return (Math.random()*getStrength());
    }
    public void takeDamage(double d)
    {
        setHealth(getHealth()-d);
    }
    public boolean isAlive()
    {
        if (getHealth() > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main (String [] args)
    {
        Monster giant = new Monster (15,100);
        Monster ogre = new Monster (25, 60);
        while (giant.isAlive() && ogre.isAlive())
        {
            giant.takeDamage(ogre.attack());
            ogre.takeDamage(giant.attack());
            System.out.println("Giant: "+giant.getHealth());
            System.out.println("Ogre: "+ogre.getHealth());
        }
        if (!giant.isAlive()&&!ogre.isAlive())
        {
           System.out.println("Both fighters are dead.");
        }
        else if (!giant.isAlive())
        {
            System.out.println("The Ogre wins!");
        }
        else if(!ogre.isAlive())
        {
            System.out.println("The Giant wins!");
        }
    }
    
}

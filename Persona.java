import javax.swing.JOptionPane;
import javax.swing.JFrame;
/**
 * Write a description of class Persona here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private boolean hasTie;
    private boolean isArmUp;
    private boolean hasClothes;
    private boolean isEating;
    private boolean hasHorn;
    private boolean hasBelt;
    private boolean walks;
    private boolean isAnimal;
    
    public Persona(int id, String name, boolean hasTie, boolean isArmUp, boolean hasClothes, boolean isEating, boolean hasHorn, boolean hasBelt, boolean walks, boolean isAnimal) 
    {
        this.id = id;
        this.name = name;
        this.hasTie = hasTie;
        this.isArmUp = isArmUp;
        this.hasClothes = hasClothes;
        this.isEating = isEating;
        this.hasHorn = hasHorn;
        this.hasBelt = hasBelt;
        this.walks = walks;
        this.isAnimal = isAnimal;
    }

    public int getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }

    public boolean getHasTie() 
    {
        return hasTie;
    }

    public boolean getIsArmUp() 
    {
        return isArmUp;
    }

    public boolean getHasClothes() 
    {
        return hasClothes;
    }

    public boolean getIsEating() 
    {
        return isEating;
    }

    public boolean getHasHorn() 
    {
        return hasHorn;
    }

    public boolean getHasBelt() 
    {
        return hasBelt;
    }

    public boolean getWalks() 
    {
        return walks;
    }

    public boolean getIsAnimal() 
    {
        return isAnimal;
    }
    
    public boolean getValue(String attr) 
    {
        if (attr.equals("tie"))
            return hasTie;
        else if (attr.equals("armup"))
            return isArmUp;
        else if (attr.equals("clothes"))
            return hasClothes;
        else if (attr.equals("eating"))
            return isEating;
        else if (attr.equals("horn"))
            return hasHorn;
        else if (attr.equals("belt"))
            return hasBelt;
        else if (attr.equals("walks"))
            return walks;
        else if (attr.equals("animal"))
            return isAnimal;
        else {
            JOptionPane.showMessageDialog(new JFrame(), "Unknown attribute value: " + attr);
            System.exit(-1);
            return false;
        }
    }
}
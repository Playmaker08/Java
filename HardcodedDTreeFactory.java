/**
 * @author Steven Bogaerts (starter code)
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HardcodedDTreeFactory 
{
    public static void main(String[] args) 
    {
        HardcodedDTreeFactory factory = new HardcodedDTreeFactory();
        
        System.out.println("--------------------------");
        DTreeNode tree2 = factory.hardcode2PersonaTree();
        System.out.println("2-persona tree:\n" + tree2);
        
        System.out.println("--------------------------");
        DTreeNode tree4 = factory.hardcode4PersonaTree();
        System.out.println("4-persona tree:\n" + tree4);
        
        System.out.println("--------------------------");
        DTreeNode tree9 = factory.hardcode9PersonaTree();
        System.out.println("9-persona tree:\n" + tree9);
    }
    
    public DTreeNode hardcode2PersonaTree() 
    {
        DTreeNode tie = new DTreeNode("tie", false);
        DTreeNode bear = new DTreeNode("Bear", true);
        DTreeNode tiger = new DTreeNode("Tiger", true);
        tie.setNodeForNo(bear);
        tie.setNodeForYes(tiger);
        
        return tie;
    }
    
    public DTreeNode hardcode4PersonaTree() 
    {
        DTreeNode clothes = new DTreeNode ("clothes", false);
        DTreeNode tie = new DTreeNode("tie", false);
        DTreeNode armUp = new DTreeNode("armUp", false);
        DTreeNode dog = new DTreeNode("dog", true);
        DTreeNode unicorn = new DTreeNode("unicorn", true);
        DTreeNode bear = new DTreeNode("bear", true);
        DTreeNode tiger = new DTreeNode("tiger", true);
        clothes.setNodeForNo(armUp);
        clothes.setNodeForYes(tie);
        armUp.setNodeForNo(dog);
        armUp.setNodeForYes(unicorn);
        tie.setNodeForNo(bear);
        tie.setNodeForYes(tiger);
        
        return clothes;
    }
    
    public DTreeNode hardcode9PersonaTree() 
    {
        DTreeNode clothes = new DTreeNode ("clothes", false);
        DTreeNode tie1 = new DTreeNode("tie1", false);
        DTreeNode tie2 = new DTreeNode("tie2", false);
        DTreeNode armUp = new DTreeNode("armUp", false);
        DTreeNode belt = new DTreeNode ("belt", false);
        DTreeNode eating = new DTreeNode("eating", false);
        DTreeNode walks1 = new DTreeNode("walks", false);
        DTreeNode walks2 = new DTreeNode("walks2", false);
        DTreeNode dog = new DTreeNode("dog", true);
        DTreeNode unicorn = new DTreeNode("unicorn", true);
        DTreeNode bear = new DTreeNode("bear", true);
        DTreeNode tiger = new DTreeNode("tiger", true);
        DTreeNode parrot = new DTreeNode("parrot", true);
        DTreeNode panda = new DTreeNode("panda", true);
        DTreeNode lion = new DTreeNode("lion", true);
        DTreeNode shark = new DTreeNode("shark", true);
        DTreeNode fox = new DTreeNode("fox", true);
        armUp.setNodeForNo(clothes);
        armUp.setNodeForYes(belt);
        clothes.setNodeForNo(eating);
        clothes.setNodeForYes(tie1);
        belt.setNodeForNo(tie2);
        belt.setNodeForYes(walks1);
        eating.setNodeForNo(walks2);
        eating.setNodeForYes(panda);
        tie1.setNodeForNo(bear);
        tie1.setNodeForYes(tiger);
        tie2.setNodeForNo(unicorn);
        tie2.setNodeForYes(lion);
        walks1.setNodeForNo(shark);
        walks1.setNodeForYes(fox);
        walks2.setNodeForNo(parrot);
        walks2.setNodeForYes(dog);
        return armUp;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *
 * @author Vanessa
 */

/*
Voltage class used to check if voltage values are valid, assigns each
voltage source to an ID number, and changes the nodes the voltage sources are attached
to when voltage is negative
*/
public class Voltage {
    //Initialize variables
    double v; //Voltage value
    int id1; //Node ID
    Node[] n; //Connected Nodes
    public static int id2 = 1;
    Circuit cir;//Circuit object
    
    /**Constructor: takes in voltage, Node 1, Node 2 values and checks if
    *they are valid values
    * @param voltage
    * @param node1
    * @param node2
    */
    public Voltage(double voltage, Node node1, Node node2){
        this.cir = Circuit.getInstance();
        //Votltage source must be connected to nodes; nodes cannot be null
        if (node1 == null || node2 == null)
            throw new IllegalArgumentException("The Voltage source must be connected to two nodes!");
        
        //Increase the node ID when a voltage is added
        id1 = id2;
        id2++;
        
        //Voltage is polarized, so if it is negative, the node numbers are switched
        if (voltage < 0){
            v = -voltage;
            n = new Node[]{node2, node1};
        }
        //If voltage is positive, the nodes the user inputted remains the same
        else{
            v = voltage;
            n = new Node[]{node1, node2};
        }
        cir.add(this); //Add voltage source to circuit
    }
    /**
    * @return node array n
    */
    public Node[] getNodes(){
        return n;
    }
    /**
     * @return voltage source number, 2 nodes, and voltage in the correct format
     */
    @Override
    public String toString(){
        return ("V" + id1 + " " + n[0] + " " + n[1] + " DC " + v);
    }
    
}
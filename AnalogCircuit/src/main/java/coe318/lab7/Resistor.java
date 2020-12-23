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
Resistor class used to check if resistor values are valid and assigns each
resistor to an ID number
*/
public class Resistor {
    //Initialize variables
    double r; //resistance value
    int id1; //Node ID
    Node[] n; //Connected Nodes
    public static int id2 = 1; //Next Node ID
    Circuit cir = Circuit.getInstance(); //Circuit object
    
    /**Constructor: takes in resistance, node 1, and node 2 values and checks if
    *they are valid values
    * @param resistance
    * @param node1
    * @param node2
    */
    public Resistor(double resistance, Node node1, Node node2){
        //Resistors must be connected to nodes; nodes cannot be null
        if (node1 == null || node2 == null)
            throw new IllegalArgumentException("The Resistor must be connected to two nodes!");
        //Resistance must be a positive number
        if (resistance < 0)
            throw new IllegalArgumentException("The resistance must be greater than zero!");
        
        id1 = id2; //Assign current Node ID to next ID
        id2++; //Increase ID number
        r = resistance; //Set resistance to r
        n = new Node[]{node1, node2}; //Store connected nodes
        cir.add(this); //Add resistor to circuit
    }
    
    /**
    * @return node array n
    */
    public Node[] getNodes(){
        return n;
    }
    
    /**
     * @return resistor number, 2 nodes, and resistance in the correct format
     */
    @Override
    public String toString(){
        return ("R" + id1 + " " + n[0] + " " + n[1] + " " + r);
    }
    
}
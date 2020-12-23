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
Node class used to create node ID numbers which the resistors and voltage 
sources are connected to
*/
public class Node {
    //Initialize variables
    int id1; //The current node ID
    public static int id2 = 0; //The next node ID
    
    //Constructor: changes current node ID to the next node ID
    public Node(){ 
        id1 = id2;
        id2++; //Next node ID increases
    }
    /**
     * @return id number of node
     */
    public String toString(){ 
        return(""+id1);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
import java.util.ArrayList;

/**
 *
 * @author Vanessa
 */

/*
Circuit class used to add store resistor and voltage components in an arraylist 
so that when spice command is used, the program will print out the description
*/
public class Circuit {
    private static Circuit instance = null; //inital value for circuit
    private ArrayList<Object> comp = new ArrayList<Object>(); //make list of components
    
    /**
    *if no circuit created yet, make new circuit
    * @return instance of the circuit
    */
    public static Circuit getInstance() {
    if (instance == null) { 
        instance = new Circuit();
    }
        return instance;
    }

    /**Adds resistor to components array list
    * @param r 
    */
    public void add(Resistor r){
        comp.add(r); 
    }
    
    /**Add voltage source to components array list
     * @param v 
     */
    public void add(Voltage v){
        comp.add(v); 
    }
    
    /**Prints out components in sequential order and correct format during "spice" command
    * @return text
    */
    @Override
    public String toString(){
        String text = new String(""); 
        for (int i = 0; i<comp.size(); i++){ 
            text = text.concat(comp.get(i) + "\n");
        }
        return text;
    }
    
}
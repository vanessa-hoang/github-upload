/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
import java.util.*;

/**
 *
 * @author Vanessa
 */

/*
Main class used to read stdin and interpret data, spice and end command
*/
public class UserMain {
    static Scanner scan = new Scanner(System.in); //Create scanner to scan voltage and resistance

    public static void main(String[] args){
        //Initialize variables
        int i, n1, n2; 
        double val;
        String user = new String();
        String[] data = new String[4]; //use inputs 4 values
        Node[] n = new Node[1000]; //Max number of nodes is 1000
        
        //Initialize each node
        for (i = 0; i<n.length; i++){
            n[i] = new Node(); 
        }
        
        //Scanner scans the user input values
        while (true){
            user = scan.nextLine();
            //If user inputs "end", the program terminates
            if (user.equals("end")) {
              System.out.println("All Done");
                break;
            }
            //if user inputs "spice", the program will print the spice description so far
            else if (user.equals("spice"))
               System.out.println(Circuit.getInstance());
            
            //If user inputs 4 values (r/v, node 1, node 2, voltage/resistance value) 
            else{
                data = user.split(" "); //user inputs will be split into 4 parts
                n1 = Integer.parseInt(data[1]); //node 1
                n2 = Integer.parseInt(data[2]); //node 2
                val = Double.parseDouble(data[3]); //voltage/resistance value

                if (data[0].equals("r")) //if "r" was inputted, a resistor will be created
                    new Resistor(val, n[n1], n[n2]);

                else if (data[0].equals("v")) //if "v" was inputted, a voltage source will be created
                    new Voltage(val, n[n1], n[n2]);
            }
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Vanessa
 */

/*
Test class for the Resistor class
*/
public class ResistorTest {
    
    public ResistorTest() {
    }
    
    //Sets up the class before the test; no set up required
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNodes method, of class Resistor.
     * Should return the expected results of the nodes
     */
    @org.junit.jupiter.api.Test
    public void testGetNodes() {
        Node n1 = new Node(); //Create node 1
        Node n2 = new Node(); //Create node 2
        Resistor r = new Resistor(2, n1, n2); //Create resistor with value of 2, attached to node 1 and 2
        System.out.println("getNodes");
        Resistor instance = r;
        Node[] expResult = new Node[]{n1, n2}; //expected nodes are n1 and n2
        Node[] result = instance.getNodes();
        assertArrayEquals(expResult, result); //Method to see if expected results is equal to results
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Resistor.
     * Should return that the expected and actual results are not equal
     */
    @org.junit.jupiter.api.Test
    public void testToString() {
        Node n3 = new Node(); //Create node 3
        Node n4 = new Node(); //Create node 4
        Resistor r = new Resistor(2, n3, n4); //Create resistor with value of 2, attached to node 3 and 4
        System.out.println("toString");
        Resistor instance = r;
        String expResult = "R2 1 2 2.0"; //expected output
        String result = instance.toString();
        assertFalse(expResult == result); //Methods to see if expected results is not equal to results
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miijavaxiv;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author YusufHA
 */
public class AritmatikaTest {
    
    public AritmatikaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testBagi() {
        System.out.println("bagi");
        
        Aritmatika instance = new Aritmatika();
        assertEquals(5, instance.bagi(10, 2), 0.0);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testBagiNol() {
        System.out.println("bagi dengan nol");
        
        Aritmatika instance = new Aritmatika();
        instance.bagi(10, 0);
    }
}

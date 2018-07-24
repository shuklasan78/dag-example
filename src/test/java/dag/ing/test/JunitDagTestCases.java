package dag.ing.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import dag.ing.assignment.Animal;
import dag.ing.assignment.DAG;
import dag.ing.assignment.Mammals;
import dag.ing.assignment.Reptiles;
import jdk.Exported;
import junit.framework.AssertionFailedError;

/** 
 * The purpose of JunitDagTestCases program is to run the test cases of the DAG class functionality.The test cases has been added as part of test Driven Approach
 * @author Sandeep Kumar Shukla
 * @version 1.0
 * @since   23-Jul-2018 
 */
public class JunitDagTestCases {
	
	@Test
	public void testAnimalMammalsDecedantcy() {
		/*Arrange*/
        Animal myUnit = new Mammals();
        /*Act*/
        boolean result = myUnit.isDesendant("Animal", "Mammals");
        /*Assert*/
        assertTrue("Animal as ancetor and Mammals as descendant is valid relationship :",result);		
    }
	
	@Test
	public void testMammalsDogDecedantcy() {
		/*Arrange*/
        Animal myUnit = new Mammals();
        /*Act*/
        boolean result = myUnit.isDesendant("Mammals", "Dog");
        /*Assert*/
        assertTrue("Mammals as ancetor and Dog as descendant is  valid relationship :",result);		
    }
	
	@Test
	public void testMammalsCatDecedantcy() {
		/*Arrange*/
        Animal myUnit = new Mammals();
        /*Act*/
        boolean result = myUnit.isDesendant("Mammals", "Cat");
        /*Assert*/
        assertTrue("Mammals as ancetor and Cat as descendant is  valid relationship :",result);		
    }
	
	@Test
	public void testMammalsCowDecedantcy() {
		/*Arrange*/
        Animal myUnit = new Mammals();
        /*Act*/
        boolean result = myUnit.isDesendant("Mammals", "Cow");
        /*Assert*/
        assertTrue("Mammals as ancetor and Cow as descendant is  valid relationship :",result);		
    }
	
	@Test
	public void testAnimalReptilesDecedantcy() {
		/*Arrange*/
        Animal myUnit = new Reptiles();
        /*Act*/
        boolean result = myUnit.isDesendant("Animal", "Reptiles");
        /*Assert*/
        assertTrue("Animal as ancetor and Reptiles as descendant is  valid relationship :",result);		
    }
	
	@Test
	public void testReptilesLizardDecedantcy() {
		/*Arrange*/
        Animal myUnit = new Reptiles();
        /*Act*/
        boolean result = myUnit.isDesendant("Reptiles", "Lizard");
        /*Assert*/
        assertTrue("Reptiles as ancetor and Lizard as descendant is  valid relationship :",result);		
    }
	
	@Test
	public void testReptilesCrocodileDecedantcy() {
		/*Arrange*/
        Animal myUnit = new Reptiles();
        /*Act*/
        boolean result = myUnit.isDesendant("Reptiles", "Crocodile");
        /*Assert*/
        assertTrue("Reptiles as ancetor and Crocodile as descendant is  valid relationship :",result);		
    }
	
	@Test
	public void testReptilesMammalsDecedantcy() {
		/*Arrange*/
        Animal myUnit = new Reptiles();
        /*Act*/
        boolean result = myUnit.isDesendant("Reptiles", "Mammals");
        /*Assert*/
        assertFalse("Reptiles as ancetor and Mammals as descendant is not valid relationship :",result);		
    }
	
	@Test
	public void testMammalsReptilesDecedantcy() {
		/*Arrange*/
        Animal myUnit = new Mammals();
        /*Act*/
        boolean result = myUnit.isDesendant("Mammals", "Reptiles");
        /*Assert*/
        assertFalse("Mammals as ancetor and Reptiles as descendant is not valid relationship :",result);		
    }
	
	
	@Test
	public void testReptilesAnimalDecedantcy() {
		/*Arrange*/
        Animal myUnit = new Reptiles();
        /*Act*/
        boolean result = myUnit.isDesendant("Reptiles", "Animal");
        /*Assert*/
        assertFalse("Reptiles as ancetor and Animal as descendant is not valid relationship :",result);		
    }
	
	@Test
	public void testReptilesDogCatCowDecedantcy() {
		/*Arrange*/
        Animal myUnit = new Reptiles();
        /*Act*/
        boolean result = myUnit.isDesendant("Reptiles", "Dog");
        /*Assert*/
        assertFalse("Reptiles as ancetor and Dog as descendant is not valid relationship :",result);		
    
        /*Act*/
        result = myUnit.isDesendant("Reptiles", "Cat");
        /*Assert*/
        assertFalse("Reptiles as ancetor and Cat as descendant is not valid relationship :",result);		
	
        /*Act*/
        result = myUnit.isDesendant("Reptiles", "Cow");
        /*Assert*/
        assertFalse("Reptiles as ancetor and Cow as descendant is not valid relationship :",result);		
	}
	
	@Test
	public void testMammalsLizardCrocodileDecedantcy() {
		/*Arrange*/
        Animal myUnit = new Mammals();
        /*Act*/
        boolean result = myUnit.isDesendant("Mammals", "Lizard");
        /*Assert*/
        assertFalse("Mammals as ancetor and Lizard as descendant is not valid relationship :",result);		
    
        /*Act*/
        result = myUnit.isDesendant("Mammals", "Crocodile");
        /*Assert*/
        assertFalse("Mammals as ancetor and Mammals as descendant is not valid relationship :",result);		
	       
	}
	
	@Test
	public void testDogCatCowLizardCrocodileDecedantcy() {
		/*Arrange*/
        Animal myUnit = new Mammals();
        /*Act*/
        boolean result = myUnit.isDesendant("Dog", "Cow");
        /*Assert*/
        assertFalse("Dog as ancetor and Cat as descendant is not valid relationship :",result);		
    
        /*Act*/
        result = myUnit.isDesendant("Dog", "Cat");
        /*Assert*/
        assertFalse("Dog as ancetor and Cow as descendant is not valid relationship :",result);		
        
        /*Act*/
        result = myUnit.isDesendant("Cow", "Dog");
        /*Assert*/
        assertFalse("Cow as ancetor and Dog as descendant is not valid relationship :",result);		
        
        /*Act*/
        result = myUnit.isDesendant("Cow", "Cat");
        /*Assert*/
        assertFalse("Cow as ancetor and Cat as descendant is not valid relationship :",result);		
        
        /*Act*/
        result = myUnit.isDesendant("Cat", "Cow");
        /*Assert*/
        assertFalse("Cat as ancetor and Cow as descendant is not valid relationship :",result);		
        
        /*Act*/
        result = myUnit.isDesendant("Cat", "Dog");
        /*Assert*/
        assertFalse("Cat as ancetor and Dog as descendant is not valid relationship :",result);		
       
        /*Act*/
        result = myUnit.isDesendant("Crocodile", "Lizard");
        /*Assert*/
        assertFalse("Crocodile as ancetor and Lizard as descendant is not valid relationship :",result);		
	       
        /*Act*/
        result = myUnit.isDesendant("Lizard", "Crocodile");
        /*Assert*/
        assertFalse("Lizard as ancetor and Crocodile as descendant is not valid relationship :",result);		
	
        /*Act*/
        result = myUnit.isDesendant("Lizard", "Cat");
        /*Assert*/
        assertFalse("Lizard as ancetor and Cat as descendant is not valid relationship :",result);		
	}
	
	@Test
	public void testAncestorDesedentForEmpty() {
		/*Arrange*/
        Animal myUnit = new Mammals();
        /*Act*/
        boolean result = myUnit.isDesendant("", "");
        /*Assert*/
        assertFalse("Ancestor and  Descendant cannot be empty :",result);		
    }
	
	@Test
	public void testAssertAnimalMammalsAddToList() {
		/*Arrange*/
        DAG myUnit = new DAG();
        /*Act*/
        Object[] expected = {"Animal:Reptiles","Animal:Mammals"};       
        myUnit.put("Animal", "Reptiles");
        myUnit.put("Animal", "Mammals");      
        List<String> result = myUnit.getList();
        Object[] actual =  result.toArray();   
        /*Assert*/
        assertArrayEquals(expected, actual);
    }
	
	@Test(expected=IllegalArgumentException.class)
	public void testAssertMammalsReptileFail() {
		/*Arrange*/
		DAG  myUnit = new DAG();
		/*Act*/
		myUnit.put("Mammals", "Reptiles");	
		
    }
	
	@Test(expected=IllegalArgumentException.class)
	public void testAssertAncestorDescendentAdditionToList() {
		/*Arrange*/
		DAG  myUnit = new DAG();
		/*Act*/
		Object[] expected = {"Animal:Reptiles","Animal:Mammals","Mammals:Cow","Animal:Cow","Reptiles:Lizard","Animal:Lizard"};       
       
		myUnit.put("Animal", "Reptiles");
        myUnit.put("Animal", "Mammals"); 
        myUnit.put("Mammals", "Cow");
        myUnit.put("Animal", "Cow");      
        myUnit.put("Reptiles", "Lizard");      
        myUnit.put("Animal", "Lizard");      

        List<String> result = myUnit.getList();
        Object[] actual =  result.toArray();
        /*Assert*/
        assertArrayEquals(expected, actual);
    }
	
}

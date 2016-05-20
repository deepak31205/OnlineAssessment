/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputReader;

import Business.Person;
import static InputReader.PipeInputTest.myComparision;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author deepak31205
 */
public class SpaceInputTest {
    
    private SpaceInput si;
    
    public SpaceInputTest() {
        si = new SpaceInput();
        
    }


    public static boolean myComparision(List<Person> p1 ,List<Person> p2){
       
        ArrayList<Person> cp = new ArrayList <>(p1);
        
        int count = 0;
        
        for(Person obj : p2) {
         
            for(Person obj1 : p1) {
                if(obj1.getFirstName().equals(obj.getFirstName()) && obj1.getLastName().equals(obj.getLastName())
                && obj1.getGender().equals(obj.getGender())&& obj1.getDate().equals(obj.getDate())
                && obj1.getColor().equals(obj.getColor())){
                    count++;
                }
                
                
            }}
        
        return count == 3;
    }
    
    
    /**
     * Test of readSpaceInput method, of class SpaceInput.
     */
    @Test
    public void testReadSpaceInput() throws Exception {
       
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person();
        person1.setFirstName("Anna");
        person1.setLastName("Kournikova");
        person1.setGender("Female");
        person1.setDate("6/3/1975");
        person1.setColor("Red");
        personList.add(person1);
        
        Person person2 = new Person();
        person2.setFirstName("Martina");
        person2.setLastName("Hingis");
        person2.setGender("Female");
        person2.setDate("4/2/1979");
        person2.setColor("Green");
        personList.add(person2);
        
        Person person3 = new Person();
        person3.setFirstName("Monica");
        person3.setLastName("Seles");
        person3.setGender("Female");
        person3.setDate("12/2/1973");
        person3.setColor("Black");
        personList.add(person3);
        
        List<Person> person = si.readSpaceInput();
        
        assertEquals(true, myComparision(personList, person));
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputReader;

import Business.Person;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author deepak31205
 */
public class PipeInputTest {
    
    private PipeInput pi;
    
    public PipeInputTest() {
        pi = new PipeInput();
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
     * Test of readPipeInput method, of class PipeInput.
     */
    @Test
    public void testReadPipeInput() throws Exception {
        
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person();
        person1.setFirstName("Steve");
        person1.setLastName("Smith");
        person1.setGender("Male");
        person1.setDate("3/3/1985");
        person1.setColor("Red");
        personList.add(person1);
        
        Person person2 = new Person();
        person2.setFirstName("Radek");
        person2.setLastName("Bonk");
        person2.setGender("Male");
        person2.setDate("6/3/1975");
        person2.setColor("Green");
        personList.add(person2);
        
        Person person3 = new Person();
        person3.setFirstName("Francis");
        person3.setLastName("Bouillon");
        person3.setGender("Male");
        person3.setDate("6/3/1975");
        person3.setColor("Blue");
        personList.add(person3);
        
        List<Person> person = pi.readPipeInput();
        
        assertEquals(true, myComparision(personList, person));
        
       
    }
    
}

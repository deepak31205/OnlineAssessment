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
public class commaFileReaderTest {
    
    
    private commaFileReader ci;
    
    public commaFileReaderTest() {
        ci = new commaFileReader();
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
     * Test of readCommaInput method, of class commaFileReader.
     */
    @Test
    public void testReadCommaInput() throws Exception {
    
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person();
        person1.setFirstName("Neil");
        person1.setLastName("Abercrombie");
        person1.setGender("Male");
        person1.setDate("2/13/1943");
        person1.setColor("Tan");
        personList.add(person1);
        
        Person person2 = new Person();
        person2.setFirstName("Timothy");
        person2.setLastName("Bishop");
        person2.setGender("Male");
        person2.setDate("4/23/1967");
        person2.setColor("Yellow");
        personList.add(person2);
        
        Person person3 = new Person();
        person3.setFirstName("Sue");
        person3.setLastName("Kelly");
        person3.setGender("Female");
        person3.setDate("7/12/1959");
        person3.setColor("Pink");
        personList.add(person3);
        
        List<Person> person = ci.readCommaInput();
        
        assertEquals(true, myComparision(personList, person));
        
    }
    
}

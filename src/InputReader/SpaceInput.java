/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputReader;


import Business.Person;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author deepak31205
 */
public class SpaceInput {
    
    public List readSpaceInput() throws FileNotFoundException, IOException{
        
       
        List<Person> personList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("codetest_files/input_files/space.txt"));
        
        try{
            String line = br.readLine();
            while(line != null){
                String[] input = line.split("\\s");
                Person p = new Person();
                p.setLastName(input[0]);
                p.setFirstName(input[1]);
                
                String gender = input[3];
                if(gender.equalsIgnoreCase("F")){
                   p.setGender("Female");
                }else{
                    p.setGender("Male");
                }
                
                p.setColor(input[5]);
                String date = input[4];
                date = date.replace("-", "/");
                p.setDate(date);
                personList.add(p);
                line = br.readLine();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return personList;
    }
}

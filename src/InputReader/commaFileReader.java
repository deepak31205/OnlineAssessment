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
public class commaFileReader {
    
    
    public List readCommaInput() throws FileNotFoundException, IOException{
        
        List<Person> personList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("codetest_files/input_files/comma.txt"));
        
        try{
            String line = br.readLine().trim();
            line = line.replaceAll("\\s+", "");
            
		while (line != null) {
		    String[] input = line.split(",");
		    Person p = new Person();
		    p.setLastName(input[0]);
                    p.setFirstName(input[1]);
                    p.setGender(input[2]);
                    p.setDate(input[4]);
                    p.setColor(input[3]);
                    personList.add(p);
                    line = br.readLine();
                    if(line != null){
                        line = line.replaceAll("\\s+", "");
                    }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return personList;
    }
}
